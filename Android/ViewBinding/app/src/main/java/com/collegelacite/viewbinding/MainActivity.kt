package com.collegelacite.viewbinding

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Installer un gestionnaire onTouch sur l'arrière-plan de l'activité
        binding.layout.setOnTouchListener(object : View.OnTouchListener {
            @SuppressLint("ClickableViewAccessibility")
            override fun onTouch(v: View, ev: MotionEvent): Boolean {
                mafonction(ev)
                return true
            }
        })
    }

    private fun mafonction(geste: MotionEvent) {
        val nombrePointeurs = geste.pointerCount
        for (i in 0 until nombrePointeurs)
        {
            val x = geste.getX(i)
            val y = geste.getY(i)
            val id = geste.getPointerId(i)
            val action = geste.actionMasked
            val actionIndex = geste.actionIndex
            var actionString: String
            when (action)
            {
                MotionEvent.ACTION_DOWN -> actionString = "DOWN"
                MotionEvent.ACTION_UP -> actionString = "UP"
                MotionEvent.ACTION_POINTER_DOWN -> actionString = "PTR DOWN"
                MotionEvent.ACTION_POINTER_UP -> actionString = "PTR UP"
                MotionEvent.ACTION_MOVE -> actionString = "MOVE"
                else -> actionString = ""
            }
            val statutToucher = "Action: $actionString Index: $actionIndex ID: $id X: $x Y: $y"
            if (id == 0) {
                binding.textViewh.text = statutToucher
            } else {
                binding.textViewb.text = statutToucher
            }
        }
    }


}