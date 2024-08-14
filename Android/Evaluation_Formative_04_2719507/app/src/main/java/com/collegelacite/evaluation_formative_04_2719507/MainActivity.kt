package com.collegelacite.evaluation_formative_04_2719507

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var nom:EditText
    lateinit var adresse:EditText
    lateinit var couriel:EditText
    lateinit var telephone:EditText
    lateinit var effacer: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nom=findViewById(R.id.idNom)
        adresse=findViewById(R.id.idAdress)
        couriel=findViewById(R.id.idCourriel)
        telephone=findViewById(R.id.idTelephone)
        effacer=findViewById(R.id.btneffacer)
        effacer.setOnClickListener {
            nom.setText("")
            adresse.setText("")
            couriel.setText("")
            telephone.setText("")
        }
    }
}