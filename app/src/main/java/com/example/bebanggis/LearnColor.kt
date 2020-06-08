package com.example.bebanggis

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_games_color.*
import kotlinx.android.synthetic.main.activity_learn_alfabeth.*
import kotlinx.android.synthetic.main.activity_learn_alfabeth.buttonback
import kotlinx.android.synthetic.main.activity_learn_color.*
import kotlinx.android.synthetic.main.activity_learn_color.button_help

class LearnColor : AppCompatActivity() {

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView
    var color = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_color)

        popup = Dialog(this)

        buttonback.setOnClickListener {
            onBackPressed()
        }

        cardView4.setOnClickListener {
            color = "Green"
            soundOn()
        }

        cardviewMerah.setOnClickListener {
            color = "Red"
            soundOn()
        }

        blue.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        yellow.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        green.setOnClickListener {
            color = "Green"
            soundOn()
        }

        kuaci.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        imageView3.setOnClickListener {
            color = "Red"
            soundOn()
        }

        imageView5.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        soundblue.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        soundgreen.setOnClickListener {
            color = "Green"
            soundOn()
        }

        soundred.setOnClickListener {
            color = "Red"
            soundOn()
        }

        soundyellow.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        button_help.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Tekan warna yang ingin dipilih untuk mendengarkan cara pelafalan warna dalam bahasa inggris beserta contoh gambar disampingnya"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

    }

    fun soundOn(){
        when (color) {
            "Blue" -> {
                val player = MediaPlayer.create(this, R.raw.blue)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            "Red" -> {
                val player = MediaPlayer.create(this, R.raw.red)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            "Green" -> {
                val player = MediaPlayer.create(this, R.raw.green)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else -> {
                val player = MediaPlayer.create(this, R.raw.yellow)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}
