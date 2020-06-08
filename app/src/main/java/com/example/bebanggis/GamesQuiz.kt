package com.example.bebanggis

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_games_quiz.*
import kotlinx.android.synthetic.main.activity_learn_alfabeth.*
import kotlinx.android.synthetic.main.activity_learn_alfabeth.buttonback

class GamesQuiz : AppCompatActivity() {

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView

    var level : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_quiz)

        popup = Dialog(this)

        buttonback.setOnClickListener {
            onBackPressed()
        }

        button_help.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Pilih jumlah soal yang kamu inginkan"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

        button.setOnClickListener {
            level = "1"
            button.setBackgroundResource(R.drawable.circlegreen)
            button.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button2.setTextColor(resources.getColor(R.color.white))
            button3.setTextColor(resources.getColor(R.color.white))
            button2.setBackgroundResource(R.drawable.circlepurple)
            button3.setBackgroundResource(R.drawable.circlepurple)
        }

        button2.setOnClickListener {
            level = "2"
            button2.setBackgroundResource(R.drawable.circlegreen)
            button2.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button.setTextColor(resources.getColor(R.color.white))
            button3.setTextColor(resources.getColor(R.color.white))
            button.setBackgroundResource(R.drawable.circlepurple)
            button3.setBackgroundResource(R.drawable.circlepurple)
        }

        button3.setOnClickListener {
            level = "3"
            button3.setBackgroundResource(R.drawable.circlegreen)
            button3.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button.setTextColor(resources.getColor(R.color.white))
            button2.setTextColor(resources.getColor(R.color.white))
            button2.setBackgroundResource(R.drawable.circlepurple)
            button.setBackgroundResource(R.drawable.circlepurple)
        }

        mulai.setOnClickListener {
            when (level) {
                "" -> {
                    Toast.makeText(this, "Pilih salah satu level!", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    clear()
                    val intent = Intent(this, Quiz::class.java)
                    intent.putExtra("Level", level)
                    startActivity(intent)
                }
            }
        }
    }

    fun clear(){
        button3.setBackgroundResource(R.drawable.circlepurple)
        button3.setTextColor(resources.getColor(R.color.white))
        button.setTextColor(resources.getColor(R.color.white))
        button2.setTextColor(resources.getColor(R.color.white))
        button2.setBackgroundResource(R.drawable.circlepurple)
        button.setBackgroundResource(R.drawable.circlepurple)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}
