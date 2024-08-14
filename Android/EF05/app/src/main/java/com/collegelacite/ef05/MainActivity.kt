package com.collegelacite.ef05

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.ef05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.buttonVerifier.setOnClickListener {
            val motDePasse = binding.editTextPassword.text.toString()
            val robustesse = evaluerRobustesseMotDePasse(motDePasse)

            if (robustesse <= 0.50f){
                binding.main.setBackgroundColor(getColor(R.color.red))
            }else if (robustesse >=0.75f){
                binding.main.setBackgroundColor(getColor(R.color.green))
            }else{
                binding.main.setBackgroundColor(getColor(R.color.yellow))
            }
        }
    }

    fun evaluerRobustesseMotDePasse(motDePasse: String): Float {
        var robustesse: Float = 0f
        // Y a-t-il au moins une minuscule?
        if (motDePasse.matches(Regex(".*[a-z]+.*")))
            robustesse += 0.25f
        // Y a-t-il au moins une majuscule?
        if (motDePasse.matches(Regex(".*[A-Z]+.*")))
            robustesse += 0.25f
        // Y a-t-il au moins un chiffre?
        if (motDePasse.matches(Regex(".*[\\d]+.*")))
            robustesse += 0.25f
        // Y a-t-il au moins un symbole?
        if (motDePasse.matches(Regex(".*[@#$%]+.*")))
            robustesse += 0.25f
        // Y a-t-il au moins six caractères?
        if (motDePasse.length < 6)
            robustesse -= 0.2f
        return robustesse
    }

}