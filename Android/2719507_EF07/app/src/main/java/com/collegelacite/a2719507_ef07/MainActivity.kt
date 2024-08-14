package com.collegelacite.a2719507_ef07

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GestureDetectorCompat
import com.collegelacite.a2719507_ef07.databinding.ActivityMainBinding
import java.util.Random


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener,
    GestureDetector.OnDoubleTapListener {
    private lateinit var binding: ActivityMainBinding

    private var views: ArrayList<View> = ArrayList()     // liste de View à gérer
    private var viewSelectionne: View? = null            // indique le view à déplacer par ACTION_MOVE

    private var detecteurGestes: GestureDetectorCompat? = null

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
        binding.mainLayout.setOnTouchListener { v, ev ->
            gererOnTouchSurLayout(ev)
            true
        }

        // Installer un gestionnaire OnDoubleTap sur l'activité
        this.detecteurGestes = GestureDetectorCompat(this, this)
        this.detecteurGestes?.setOnDoubleTapListener(this)
    }

    // Fonction gérant les touchers du layout
    private fun gererOnTouchSurLayout(geste: MotionEvent) {
        val x = geste.x
        val y = geste.y
        val action = geste.actionMasked
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                // Déterminer si un View a été sélectionné
                viewSelectionne = null
                for (view in views) {
                    if (positionSurView(view, x, y)) {
                        viewSelectionne = view
                        break
                    }
                }

                // Amener le View sélectionné (s'il y en a un) à l'avant
                viewSelectionne?.bringToFront()
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

            else -> {

            }
        }

        // Passer l'évènement au gestionnaire de gestes
        this.detecteurGestes?.onTouchEvent(geste);
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
        val view = View(this)
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

    // Gestionnaire déclenché lors d'un déposer du doigt
    override fun onDown(event: MotionEvent): Boolean {
        return true
    }

    // Gestionnaire déclenché lors d'un swap avec les doigts
    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return false;
    }

    // Gestionnaire déclenché lors d'un toucher prolongé
    override fun onLongPress(event: MotionEvent) {
        ajouterView(event.x, event.y)
    }



    // Gestionnaire déclenché lors d'un balayage en bordure d'activité
    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        return false
    }
    // Gestionnaire déclenché lorsque le doigt est déposé sur une position
    // pouvant être confondue avec un début de balayage, mais pas encore déplacé
    override fun onShowPress(event: MotionEvent) {
    }

    // Gestionnaire détaillé du toucher simple (déclenché lorsque le doigt est
    // levé).
    override fun onSingleTapUp(event: MotionEvent): Boolean {
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        TODO("Not yet implemented")
    }


    override fun onDoubleTap(e: MotionEvent): Boolean {
        for (view in views) {
            if (positionSurView(view, e.x, e.y)) {

                view.setBackgroundColor(getCouleurAleatoire())
                break
            }
        }
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        return false
    }


}
