package com.example.bebanggis

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nilai = intent.getIntExtra("nilai", 0)
        val level = intent.getStringExtra("level")

        if (nilai <= 60){
            predikat.text = "Skor quiz kamu masih terlalu kecil :("
        }
        else {
            predikat.text = "Selamat! Skor quiz kamu..."
        }

        when (level) {
            "1" -> {
                textlevel.text = "Beginner Level"
            }
            "2" -> {
                textlevel.text = "Advanced Level"
            }
            else -> {
                textlevel.text = "Professional Level"
            }
        }

        val hasil = nilai.toString()

        grade.text = "$hasil/100"
        bagikan.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Wow nilai ku diquiz Bebanggis $hasil, ayo download aplikasinya sekarang di Play Store!")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Bagikan ke...")
            startActivity(shareIntent)
        }

        back.setOnClickListener {
            finish()
        }

    }
}
