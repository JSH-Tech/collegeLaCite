package com.collegelacite.tuto2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "TransitionsEtatsTAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(TAG, "onCreate a été invoquée");
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart a été invoquée")
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
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG, "onRestoreInstanceState a été invoquée")
    }

}