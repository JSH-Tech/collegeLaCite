package com.collegelacite.menus


import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.collegelacite.menus.databinding.ActivityMainBinding
import java.util.Random

// Deux types d'opérations sur les View
enum class Operation {
    DROP, DRAG, DEL
}

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    private var views: ArrayList<View> = ArrayList()     // liste de View à gérer
    private var viewSelectionne: View? = null            // indique le view à déplacer par ACTION_MOVE

    private var operation = Operation.DRAG               // type d'opérations actif

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurer l'activité via liaison de vues
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ajouter les deux View du layout aux View à gérer
        views.add(binding.viewRouge)
        views.add(binding.viewBleu)

        // Installer un gestionnaire onTouch sur l'arrière-plan de l'activité
        binding.mainLayout.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View, ev: MotionEvent): Boolean {
                gererOnTouchSurLayout(ev)
                return true
            }
        })

        // Installer un gestionnaire onClick sur le bouton DRAG
        binding.dragButton.setOnClickListener {
            setOperation(Operation.DRAG)
        }

        // Installer un gestionnaire onClick sur le bouton DROP
        binding.dropButton.setOnClickListener {
            setOperation(Operation.DROP)
        }

        // Installer un gestionnaire onClick sur le bouton DEL
        binding.delButton.setOnClickListener {
            setOperation(Operation.DEL)
        }

        // Au démarrage, l'opération active est le dragging de View
        setOperation(Operation.DRAG)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = getMenuInflater()
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        item.setChecked(true)
        when (item.itemId) {

            R.id.menu_rouge -> binding.mainLayout.setBackgroundColor(Color.RED)
            R.id.menu_vert -> binding.mainLayout.setBackgroundColor(Color.GREEN)
            R.id.menu_bleu -> binding.mainLayout.setBackgroundColor(Color.BLUE)

        }
        return super.onOptionsItemSelected(item)
    }
    // Change l'opération active
    private fun setOperation(op: Operation) {
        operation = op

        // Mettre à jour l'affichage du type d'opération active
        when (operation) {
            Operation.DRAG -> binding.operationTextView.text = "DRAG"
            Operation.DROP -> binding.operationTextView.text = "DROP"
            Operation.DEL  -> binding.operationTextView.text = "DEL"
            else           -> binding.operationTextView.text = ""
        }
    }

    // Fonction gérant les touchers du layout
    private fun gererOnTouchSurLayout(geste: MotionEvent) {
        val x = geste.x
        val y = geste.y

        val action = geste.actionMasked
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                // Déterminer si un View a été sélectionné
                var selection = viewSurPosition(x, y)

                // Selon l'opération active...
                when (operation) {
                    Operation.DRAG -> {
                        // Amener le View sélectionné (s'il y en a un) à l'avant
                        selection?.bringToFront()

                        // Le View sélectionné devient celui à déplacer
                        viewSelectionne = selection
                    }

                    Operation.DROP -> {
                        // On s'assurer que le toucher n'est pas sur un View existant
                        if (selection == null)
                            ajouterView(x, y)
                    }

                    Operation.DEL -> {
                        // On supprime le View sélectionné
                        if (selection != null) {
                            views.remove(selection)
                            binding.mainLayout.removeViewInLayout(selection)
                        }
                    }
                }
            }

            MotionEvent.ACTION_UP -> {
                // On relâche le view sélectionné (s'il y en avait un)
                viewSelectionne = null
            }

            MotionEvent.ACTION_MOVE -> {
                // On doit travailler avec une variable locale car le viewélectionné
                // peut être sujet à un conflit d'accès dû au multitâche
                val selection = viewSelectionne
                if (selection != null) {
                    // Si le view fut sélectionnée dans ACTION_DOWN, on le repositionne
                    // à la position actuelle du toucher
                    centrerViewSurPosition(selection, x, y)
                }
            }

            else -> {}
        }
    }

    // Fonction indiquant si la position donnée est sur le view donné
    private fun positionSurView(v: View, x: Float, y: Float): Boolean {
        if (v == null)
            return false;

        val origineX: Float = v.x
        val origineY: Float = v.y
        val opposéX: Float = origineX + v.width
        val opposéY: Float = origineY + v.height
        return x >= origineX && x <= opposéX && y >= origineY && y <= opposéY
    }


    // Fonction retournant le view (s''il y en a un) à la position donnée
    private fun viewSurPosition(x: Float, y: Float): View? {
        var sélection: View? = null
        for (view in views) {
            if (positionSurView(view, x, y)) {
                sélection = view
                break
            }
        }

        return sélection
    }

    // Repositionne le view donné afin qu'il soit centré sur la position donnée
    private fun centrerViewSurPosition(v: View, x: Float, y: Float) {
        if (v != null) {
            v.x = x - v.width / 2
            v.y = y - v.height / 2
        }
    }

    // Retourne une couleur sélectionnée au hasard
    private fun getCouleurAleatoire(): Int {
        val random = Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }

    // Ajoute un View à la position donnée ainsi qu'aux View à gérer
    private fun ajouterView(x: Float, y: Float) {
        val view = ImageView(this)
        binding.mainLayout.addView(view)
        val dps = 40f
        val scale = resources.displayMetrics.density
        val pixels = (dps * scale).toInt()
        view.layoutParams = ConstraintLayout.LayoutParams(pixels, pixels)
        view.x = x - pixels / 2
        view.y = y - pixels / 2
        view.setBackgroundColor(getCouleurAleatoire())

        views.add(view)
    }
}
