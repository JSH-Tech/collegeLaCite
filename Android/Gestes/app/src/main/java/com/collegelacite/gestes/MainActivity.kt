package com.collegelacite.gestes

import android.gesture.Gesture
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.gestes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    lateinit var binding: ActivityMainBinding
    private var detecteurGestes: GestureDetector? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.detecteurGestes = GestureDetector(this, this)
        this.detecteurGestes?.setOnDoubleTapListener(this)
        binding.mainLayout.setOnTouchListener { v, event ->
            this.detecteurGestes?.onTouchEvent(event)
            true
        }
         fun gererOnTouchSurLayout(geste: MotionEvent) {
            this.detecteurGestes?.onTouchEvent(geste);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    override fun onDown(e: MotionEvent): Boolean {
        binding.textView.text = "onDown"
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        binding.textView.text = "onShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        binding.textView.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        binding.textView.text = "onScroll"
        return true
    }

    override fun onLongPress(e: MotionEvent) {
        binding.textView.text = "onLongPress"
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        binding.textView.text = "onFling"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        binding.textView.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        binding.textView.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        binding.textView.text = "onDoubleTapEvent"
        return true
    }
}