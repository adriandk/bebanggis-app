package com.example.bebanggis

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about.*


class ActivityAbout : AppCompatActivity() {

    private lateinit var popUpDetail: Dialog
    private lateinit var devPhoto: ImageView
    private lateinit var namaDev: TextView
    private lateinit var profDev: TextView
    private lateinit var descDev: TextView
    private lateinit var exitButtonPopUp: ImageButton
    private lateinit var kerjaIcon: ImageButton
    private lateinit var buttonkerja1: TextView
    private lateinit var buttonkerja2: ImageButton
    private lateinit var buttonkerja3: ImageButton
    private lateinit var buttonkerja4: ImageButton
    private lateinit var buttonkontak: Button

    private lateinit var popupdonate : Dialog
    private lateinit var textdonate : TextView
    private lateinit var xButton : ImageButton

    var nama = ""
    var photo = ""
    var profesi = ""
    var desc = ""
    var kerja = ""
    var link1 = ""
    var link2 = ""
    var link3 = ""
    var link4 = ""
    var kontak = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        popUpDetail = Dialog(this)
        popupdonate = Dialog(this)

        button_back.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
        }

        profilesadam.setOnClickListener {
            nama = "Shaddam Amru Hasibuan"
            photo = "sadam"
            profesi = "Designer"
            desc =
                "Saya adalah seorang desainer asal kota kecil Cimahi yang tertarik untuk belajar dan meng-explore hal baru demi meningkatkan skill saya"
            kerja = "bh"
            link1 = "https://www.linkedin.com/in/shaddamah/"
            link2 = "https://www.behance.net/shaddzgn"
            link3 = "https://github.com/shaddamah"
            link4 = "https://instagram.com/shaddamah?igshid=19vo8nv0rio7a"
            kontak = "shaddam.a.h@gmail.com"
            dialog()
        }
        profiledeka.setOnClickListener {
            nama = "Adrian Daniel"
            photo = "deka"
            profesi = "Programmer"
            desc =
                "Saya adalah seorang android developers yang ingin terus belajar hal - hal baru untuk terus mengasah skill saya"
            kerja = "fb"
            link1 = "https://www.linkedin.com/in/adrian-daniel-23a0ba1a1/"
            link2 = "https://wa.me/+628818117213"
            link3 = "https://github.com/adriandk"
            link4 = "https://www.instagram.com/adriandk_/?hl=en"
            kontak = "adriandaniel1803@gmail.com"
            dialog()
        }

        donate.setOnClickListener {
            popupdonate.setContentView(R.layout.helpdialog)
            textdonate = popupdonate.findViewById(R.id.help)
            xButton = popupdonate.findViewById(R.id.button_xhelp)
            xButton.setOnClickListener {
                popupdonate.dismiss()
            }
            textdonate.text = "Kamu bisa menghubungi developer untuk berdonasi (kontak bisa ditemukan di Profil developer diatas)"
            popupdonate.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popupdonate.show()
        }
    }

    fun dialog() {
        popUpDetail.setContentView(R.layout.popupdetailabout)
        devPhoto = popUpDetail.findViewById(R.id.devphoto)
        namaDev = popUpDetail.findViewById(R.id.namadev)
        profDev = popUpDetail.findViewById(R.id.profesidev)
        descDev = popUpDetail.findViewById(R.id.descdev)
        exitButtonPopUp = popUpDetail.findViewById(R.id.exit_button_popup)
        kerjaIcon = popUpDetail.findViewById(R.id.kerja2)
        buttonkerja1 = popUpDetail.findViewById(R.id.kerja1)
        buttonkerja2 = popUpDetail.findViewById(R.id.kerja2)
        buttonkerja3 = popUpDetail.findViewById(R.id.kerja3)
        buttonkerja4 = popUpDetail.findViewById(R.id.kerja4)
        buttonkontak = popUpDetail.findViewById(R.id.kontak)
//

        buttonkerja1.setOnClickListener {
            val kerja = Intent(Intent.ACTION_VIEW)
            kerja.data = Uri.parse(link1)
            startActivity(kerja)
        }
        buttonkerja2.setOnClickListener {
            val kerja = Intent(Intent.ACTION_VIEW)
            kerja.data = Uri.parse(link2)
            startActivity(kerja)
        }
        buttonkerja3.setOnClickListener {
            val kerja = Intent(Intent.ACTION_VIEW)
            kerja.data = Uri.parse(link3)
            startActivity(kerja)
        }
        buttonkerja4.setOnClickListener {
            val kerja = Intent(Intent.ACTION_VIEW)
            kerja.data = Uri.parse(link4)
            startActivity(kerja)
        }
        buttonkontak.setOnClickListener {
            val i = Intent(Intent.ACTION_SENDTO)
            i.data = Uri.parse("mailto:$kontak")
            try {
                startActivity(i)
            } catch (ex: ActivityNotFoundException) {
                Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show()
            }
        }

        when (photo) {
            "sadam" -> {
                devPhoto.setImageResource(R.drawable.potoaing)

            }
            else -> {
                devPhoto.setImageResource(R.drawable.adrian)
            }
        }

        when (kerja) {
            "bh" -> {
                kerjaIcon.setImageResource(R.mipmap.behance)
            }
            else -> {
                kerjaIcon.setImageResource(R.mipmap.whatsapp)
            }
        }

        namaDev.text = nama
        profDev.text = profesi
        descDev.text = desc
        exitButtonPopUp.setOnClickListener {
            popUpDetail.dismiss()
        }
//
        popUpDetail.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        popUpDetail.show()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
    }
}
