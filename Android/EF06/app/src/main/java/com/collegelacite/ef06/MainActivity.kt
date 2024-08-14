package com.collegelacite.ef06

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.ef06.databinding.ActivityMainBinding
import java.util.Objects

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var isDragging = false

    @SuppressLint("ClickableViewAccessibility")
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

        binding.main.setOnTouchListener { _, event ->
            val x = event.x
            val y = event.y

            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    isDragging = positionSurDroid(x, y)
                }
                MotionEvent.ACTION_MOVE -> {
                    if (isDragging) {
                        moveDroid(x, y)
                    }
                }
                MotionEvent.ACTION_UP -> {
                    isDragging = false
                }
            }
            true
        }
    }

    private fun positionSurDroid(x: Float, y: Float): Boolean {
        val droidOrigineX: Float = binding.droid.x
        val droidOrigineY: Float = binding.droid.y
        val droidOpposéX: Float = droidOrigineX + binding.droid.width
        val droidOpposéY: Float = droidOrigineY + binding.droid.height
        return (x >= droidOrigineX) && (x <= droidOpposéX) && (y >= droidOrigineY) && (y <= droidOpposéY)
    }

    private fun moveDroid(x: Float, y: Float) {
        val halfWidth = binding.droid.width / 2
        val halfHeight = binding.droid.height / 2
        binding.droid.x = x - halfWidth
        binding.droid.y = y - halfHeight
        binding.textView.text = "X: ${binding.droid.x}, Y: ${binding.droid.y}"
    }
}