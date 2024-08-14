package com.collegelacite.healthcaresoftware

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.healthcaresoftware.databinding.ActivityNewPatientBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class NewPatient : AppCompatActivity() {
    lateinit var binding: ActivityNewPatientBinding

    val database : FirebaseDatabase = FirebaseDatabase.getInstance()
    val reference : DatabaseReference = database.reference.child("patients")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNewPatientBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.buttonEnregistrer.setOnClickListener {


            val nom = binding.editTextNom.text.toString()
            val prenom = binding.editTextPrenom.text.toString()
            val dob = binding.editTextdob.text.toString()
            val sexe = binding.editTextSexe.text.toString()
            val pays = binding.editTextPays.text.toString()
            val ville = binding.editTextVille.text.toString()
            val tel = binding.editTextContact.text.toString()
            val occupation = binding.editTextOccupation.text.toString()
            val situation = binding.editTextSituation.text.toString()

            if (nom.isEmpty() || prenom.isEmpty() || dob.isEmpty() || sexe.isEmpty() || pays.isEmpty() || ville.isEmpty() || tel.isEmpty() || occupation.isEmpty() || situation.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
            }else{
                reference.child("nom").setValue(nom)
                reference.child("prenom").setValue(prenom)
                reference.child("dob").setValue(dob)
                reference.child("sexe").setValue(sexe)
                reference.child("pays").setValue(pays)
                reference.child("ville").setValue(ville)
                reference.child("tel").setValue(tel)
                reference.child("occupation").setValue(occupation)
                reference.child("situation").setValue(situation)

                binding.editTextNom.text?.clear()
                binding.editTextPrenom.text?.clear()
                binding.editTextdob.text?.clear()
                binding.editTextSexe.text?.clear()
                binding.editTextPays.text?.clear()
                binding.editTextVille.text?.clear()
                binding.editTextContact.text?.clear()
                binding.editTextOccupation.text?.clear()
                binding.editTextSituation.text?.clear()

                Toast.makeText(this, "Patient ajouté avec succès", Toast.LENGTH_SHORT).show()
            }



        }
    }
}