package com.collegelacite.mathgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.collegelacite.mathgame.databinding.ActivityGameBinding
import java.util.Locale
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    lateinit var binding: ActivityGameBinding
    var correctAnswer = 0
    var numberOfQuestions = 0
    var score = 0
    var userLife = 3
    lateinit var timer: CountDownTimer
    private var startTimeInMillis: Long = 20000
    private var timeLeftInMillis: Long = startTimeInMillis
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.title="Addition Game"
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        gameContinue()

        binding.buttonOkay.setOnClickListener {
            val input = binding.editTextAnswer.text.toString()
            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show()
            }
            else
            {
                pauseTimer()
                val answer = input.toInt()
                if (answer == correctAnswer) {
                    score=score+10
                    binding.textViewQuestion.text = "Congratulation your answer is correct!"
                    binding.textViewValScore.text = "$score"
                }
                else {
                    userLife--
                    binding.textViewQuestion.text = "Sorry your answer is wrong!"
                    binding.textViewValLife.text = "$userLife"
                }
                numberOfQuestions++
            }
        }

        binding.buttonNext.setOnClickListener {
            pauseTimer()
            resetTimer()
            binding.editTextAnswer.setText("")

            if (userLife == 0) {
                Toast.makeText(this, "Game Over", Toast.LENGTH_LONG).show()
                var intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("score", score)
                startActivity(intent)
                finish()
            }else{
                gameContinue()
            }
        }
    }

    fun gameContinue(){
        var valeur1 = Random.nextInt(0, 100)
        var valeur2 = Random.nextInt(0, 100)

        binding.textViewQuestion.text = "$valeur1 + $valeur2"

        correctAnswer = valeur1 + valeur2
        startTimer()
    }

    fun startTimer(){
        timer=object : CountDownTimer(timeLeftInMillis,1000){
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis=millisUntilFinished
                updateText()
            }

            override fun onFinish() {
                pauseTimer()
                resetTimer()
                updateText()
                userLife--
                binding.textViewValLife.text = "$userLife"
                binding.textViewQuestion.text = "Sorry your time is up!"
            }

        }.start()
    }

    private fun resetTimer() {
        timeLeftInMillis=startTimeInMillis
        updateText()
    }

    private fun pauseTimer() {
        timer.cancel()

    }

    private fun updateText() {
        val remainingTime = (timeLeftInMillis/1000).toInt()
        binding.textViewValTime.text = String.format(Locale.getDefault(),"%02d",remainingTime)
    }
}