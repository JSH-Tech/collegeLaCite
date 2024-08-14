package com.collegelacite.evaluation_formative_02_2719507

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "TransitionsEtatsTAG"
    private lateinit var zonedesaisiepseudo:EditText
    private lateinit var zonedesaisiepwd:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.i(TAG, "onCreate a été invoquée")
//        Initialiser les champs de saisie
        zonedesaisiepseudo = findViewById(R.id.editTextText)
        zonedesaisiepwd = findViewById(R.id.editTextTextPassword)
        //Restauration des champs en cas de besoin
        savedInstanceState?.let {
            val savedUsername=it.getString("username")
            zonedesaisiepseudo.setText(savedUsername)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume a été invoquée")
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause a été invoquée")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop a été invoquée")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart a été invoquée")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy a été invoquée")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState a été invoquée")
        //Sauvegarde du pseudo
        outState.putString("username",zonedesaisiepseudo.text.toString())
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState a été invoquée")
        //Restaure seulement le champ de contenu du identifiant
        val savedUsername=savedInstanceState.getString("username")
        zonedesaisiepseudo.setText(savedUsername)
        zonedesaisiepwd.text.clear()
    }

}