package com.collegelacite.exclass

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.exclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var enMouvement: Boolean = false
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.main.setOnTouchListener { _, event ->
            val x = event.x
            val y = event.y

            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    enMouvement = positionSurDroid(x, y)
                }
                MotionEvent.ACTION_MOVE -> {
                    if (enMouvement) {
                        moveDroid(x, y)
                    }
                }
                MotionEvent.ACTION_UP -> {
                    enMouvement = false
                }
            }
            true
        }
    }

        fun positionSurDroid(x: Float, y: Float): Boolean {
            val droidOrigineX: Float = binding.droid.x
            val droidOrigineY: Float = binding.droid.y
            val droidOpposéX: Float = droidOrigineX + binding.droid.width
            val droidOpposéY: Float = droidOrigineY + binding.droid.height
            return (x >= droidOrigineX) && (x <= droidOpposéX) &&
                    (y >= droidOrigineY) && (y <= droidOpposéY)
        }

        fun moveDroid(x: Float, y: Float) {
            val halfWidth = binding.droid.width / 2
            val halfHeight = binding.droid.height / 2
            binding.droid.x = x - halfWidth
            binding.droid.y = y - halfHeight
            binding.textViewCordonnee.text = "X: ${binding.droid.x}, Y: ${binding.droid.y}"
        }

}