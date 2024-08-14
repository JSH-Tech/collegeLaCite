package com.collegelacite.healthcaresoftware

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.healthcaresoftware.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "TransitionsEtatsTAG"
    lateinit var binding: ActivityMainBinding
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

//        supportActionBar!!.setDisplayShowHomeEnabled(true)
//        supportActionBar!!.setLogo(R.drawable.logo_sans_fond)
//        supportActionBar!!.setTitle("HealthCare Software")
//        supportActionBar!!.setDisplayUseLogoEnabled(true)

        Log.i(TAG, "onCreate a été invoquée")
        //Restauration des champs en cas de besoin
        savedInstanceState?.let {
            val savedUsername=it.getString("username")
            binding.editTextText
        }

        binding.btnConnexion.setOnClickListener {
            
            if(binding.editTextText.text.toString().isEmpty() || binding.editTextTextPassword.text.toString().isEmpty()){
                Toast.makeText(this, "Veuillez renseigner tous les champs", Toast.LENGTH_SHORT).show()
            }else{
                var intent = Intent(this@MainActivity, MenuPersonel::class.java)
                startActivity(intent)
                Toast.makeText(this, "Connexion réussie", Toast.LENGTH_SHORT).show()
            }

            
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
        outState.putString("username",binding.editTextText.text.toString())
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState a été invoquée")
        //Restaure seulement le champ de contenu du identifiant
        val savedUsername=savedInstanceState.getString("username")
        binding.editTextText.setText(savedUsername)
        binding.editTextTextPassword.text.clear()
    }

}