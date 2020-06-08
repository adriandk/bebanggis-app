package com.example.bebanggis

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(){

    private lateinit var epicDialog : Dialog
    private lateinit var btnxPopUP : ImageButton
    private lateinit var btnLearnXGames : Button
    private lateinit var btnLearnXGames2 : Button
    private lateinit var player: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//
//        player = MediaPlayer.create(this, R.raw.music)
//        player.isLooping = true
//        player.setVolume(20F, 20F)
//        Handler().postDelayed({
//            player.start()
//        }, 500)
//
//        volume.setOnClickListener {
//            if (volume.text == "0"){
//                volume.setBackgroundResource(R.drawable.volon)
//                player.pause()
//                volume.text = "1"
//            }
//            else if (volume.text == "1"){
//                volume.setBackgroundResource(R.drawable.voloff)
//                player.start()
//                volume.text = "0"
//            }
//        }

        epicDialog = Dialog(this)

        buttonabout.setOnClickListener {
            val pindah = Intent(this, ActivityAbout::class.java)
            startActivity(pindah)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        buttonlearn.setOnClickListener{
            epicDialog.setContentView(R.layout.learndialog)
            btnxPopUP= epicDialog.findViewById(R.id.button_xlearn)

            btnLearnXGames = epicDialog.findViewById(R.id.button_alfabeth)
            btnLearnXGames.setOnClickListener {
                val pindah = Intent(this, LearnAlfabeth::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener {
                val pindah = Intent(this, LearnColor::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        button_help.setOnClickListener {
            epicDialog.setContentView(R.layout.helpdialog)
            btnxPopUP= epicDialog.findViewById(R.id.button_xhelp)
            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        buttongames.setOnClickListener {
            epicDialog.setContentView(R.layout.gamesdialog)
            btnxPopUP= epicDialog.findViewById(R.id.button_xgames)

            btnLearnXGames = epicDialog.findViewById(R.id.button_quiz)
            btnLearnXGames.setOnClickListener {
                val pindah = Intent(this, GamesQuiz::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener {
                val pindah = Intent(this, GamesColor::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }
    }
}
