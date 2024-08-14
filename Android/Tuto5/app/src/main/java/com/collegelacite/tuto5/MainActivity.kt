package com.collegelacite.tuto5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.collegelacite.tuto5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var leText: TextView
    lateinit var lebouton: Button
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        leText=findViewById(R.id.textView)
        lebouton=findViewById(R.id.button)
        leText.isVisible=false
        lebouton.setOnClickListener {
            if (leText.isVisible)
            leText.isVisible=false
            else
                leText.isVisible=true
        }

        lebouton.setOnLongClickListener{
            leText.text="Appui long sur le bouton"
            true
        }


        val lecran:ConstraintLayout=findViewById(R.id.main)

        lecran.setOnClickListener{
            leText.text="Appui sur l'ecran avec clique rapide"
        }

    }
}