package com.example.clicker

import android.content.IntentSender
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.Toast
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.timer


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                        // button1.setOnClickListener(View.OnClickListener { View.GONE })//

    }
    fun toastMe(View: View) {
        val StartToast = Toast.makeText(this, "GO !!!", Toast.LENGTH_SHORT)
        StartToast.show()
        val play = findViewById(R.id.button1) as Button
        val play2 = findViewById(R.id.button2) as Button
        val play3 = findViewById(R.id.button3) as Button
        var ScoreString: String = YourScore.text.toString()
        play.isClickable=true
        play.visibility=GONE
        val timer = object: CountDownTimer(60000,1000) {
            override fun onTick(millisUntilFinished:Long) {

              Time.text= (millisUntilFinished/1000).toString()

            }

            override fun onFinish() {
                play2.visibility=GONE
                play3.visibility= VISIBLE
                YourScore.visibility= VISIBLE
                YourScore.text= "YOUR SCORE:"+Score.text.toString()

            }
        }
        timer.start()


    }
    fun countMe(View: View) {
        val countString = Score.text. toString()
    var count: Int = Integer.parseInt(countString)
        count++
        Score.text=count.toString()
    }
    fun refresh(View: View) {
        setContentView(R.layout.activity_main)

    }


}
