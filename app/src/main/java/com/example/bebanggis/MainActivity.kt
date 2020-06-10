package com.example.bebanggis

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_learn_alfabeth.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val player = MediaPlayer.create(this, R.raw.splash2)
            player.start()
            val pindah = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(pindah)
            overridePendingTransition(R.anim.fadein, R.anim.fadeout)
            finish()
        }, 1000)
    }
}
