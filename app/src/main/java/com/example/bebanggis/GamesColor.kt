package com.example.bebanggis

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_games_color.*
import kotlinx.android.synthetic.main.activity_games_color.button_help
import kotlinx.android.synthetic.main.activity_games_quiz.*
import kotlinx.android.synthetic.main.activity_learn_alfabeth.buttonback

class GamesColor : AppCompatActivity(){

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView
    lateinit var player : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_color)

        popup = Dialog(this)

        buttonback.setOnClickListener {
            onBackPressed()
        }

        button_help.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Pilih warna pada palet lalu tekan campurkan untuk melihat hasil campuran warna yang dipilih"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

        kuning.setOnClickListener {
            if (satu.text == "SATU"){
                satu.text = "1"
                satu.setBackgroundResource(R.drawable.kuning)
                kuning.setImageResource(R.drawable.ceklis)
            } else if (dua.text == "DUA" && satu.text != "1") {
                dua.text = "1"
                dua.setBackgroundResource(R.drawable.kuning)
                kuning.setImageResource(R.drawable.ceklis)
            } else if (tiga.text == "TIGA" && satu.text != "1" && dua.text != "1"){
                tiga.text = "1"
                tiga.setBackgroundResource(R.drawable.kuning)
                kuning.setImageResource(R.drawable.ceklis)
            }
        }

        biru.setOnClickListener {
            if (satu.text == "SATU"){
                satu.text = "2"
                satu.setBackgroundResource(R.drawable.biru)
                biru.setImageResource(R.drawable.ceklis)
            } else if (dua.text == "DUA" && satu.text != "2") {
                dua.text = "2"
                dua.setBackgroundResource(R.drawable.biru)
                biru.setImageResource(R.drawable.ceklis)
            } else if (tiga.text == "TIGA" && satu.text != "2" && dua.text != "2"){
                tiga.text = "2"
                tiga.setBackgroundResource(R.drawable.biru)
                biru.setImageResource(R.drawable.ceklis)
            }
        }

        merah.setOnClickListener {
            if (satu.text == "SATU"){
                satu.text = "3"
                satu.setBackgroundResource(R.drawable.merah)
                merah.setImageResource(R.drawable.ceklis)
            } else if (dua.text == "DUA" && satu.text != "3") {
                dua.text = "3"
                dua.setBackgroundResource(R.drawable.merah)
                merah.setImageResource(R.drawable.ceklis)
            } else if (tiga.text == "TIGA" && satu.text != "3" && dua.text != "3"){
                tiga.text = "3"
                tiga.setBackgroundResource(R.drawable.merah)
                merah.setImageResource(R.drawable.ceklis)
            }
        }

        hitam.setOnClickListener {
            if (satu.text == "SATU"){
                satu.text = "4"
                satu.setBackgroundResource(R.drawable.hitam)
                hitam.setImageResource(R.drawable.ceklis)
            } else if (dua.text == "DUA" && satu.text != "4") {
                dua.text = "4"
                dua.setBackgroundResource(R.drawable.hitam)
                hitam.setImageResource(R.drawable.ceklis)
            } else if (tiga.text == "TIGA" && satu.text != "4" && dua.text != "4"){
                tiga.text = "4"
                tiga.setBackgroundResource(R.drawable.hitam)
                hitam.setImageResource(R.drawable.ceklis)
            }
        }

        putih.setOnClickListener {
            if (satu.text == "SATU"){
                satu.text = "5"
                satu.setBackgroundResource(R.drawable.putih)
                putih.setImageResource(R.drawable.ceklis)
            } else if (dua.text == "DUA" && satu.text != "5") {
                dua.text = "5"
                dua.setBackgroundResource(R.drawable.putih)
                putih.setImageResource(R.drawable.ceklis)
            } else if (tiga.text == "TIGA" && satu.text != "5" && dua.text != "5"){
                tiga.text = "5"
                tiga.setBackgroundResource(R.drawable.putih)
                putih.setImageResource(R.drawable.ceklis)
            }
        }
//
        satu.setOnClickListener {
            if (satu.text == "1"){
                if (dua.text != "DUA"){
                    if (dua.text == "2"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.biru)
                            satu.text = "2"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "3"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.merah)
                            satu.text = "3"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "4"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.hitam)
                            satu.text = "4"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "5"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.putih)
                            satu.text = "5"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                }
                else {
                    satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    satu.text = "SATU"
                }
                kuning.setImageResource(0)
            }

            else if (satu.text == "2"){
                    if (dua.text != "DUA"){
                        if (dua.text == "1"){
                            if (tiga.text != "TIGA"){
                                if (tiga.text == "3"){
                                    satu.setBackgroundResource(R.drawable.kuning)
                                    satu.text = "1"
                                    dua.setBackgroundResource(R.drawable.merah)
                                    dua.text = "3"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "4"){
                                    satu.setBackgroundResource(R.drawable.kuning)
                                    satu.text = "1"
                                    dua.setBackgroundResource(R.drawable.hitam)
                                    dua.text = "4"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "5"){
                                    satu.setBackgroundResource(R.drawable.kuning)
                                    satu.text = "1"
                                    dua.setBackgroundResource(R.drawable.putih)
                                    dua.text = "5"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                            }
                            else {
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                dua.text = "DUA"
                            }
                        }
                        else if (dua.text == "3"){
                            if (tiga.text != "TIGA"){
                                if (tiga.text == "1"){
                                    satu.setBackgroundResource(R.drawable.merah)
                                    satu.text = "3"
                                    dua.setBackgroundResource(R.drawable.kuning)
                                    dua.text = "1"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "4"){
                                    satu.setBackgroundResource(R.drawable.merah)
                                    satu.text = "3"
                                    dua.setBackgroundResource(R.drawable.hitam)
                                    dua.text = "4"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "5"){
                                    satu.setBackgroundResource(R.drawable.merah)
                                    satu.text = "3"
                                    dua.setBackgroundResource(R.drawable.putih)
                                    dua.text = "5"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                            }
                            else {
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                dua.text = "DUA"
                            }
                        }
                        else if (dua.text == "4"){
                            if (tiga.text != "TIGA"){
                                if (tiga.text == "1"){
                                    satu.setBackgroundResource(R.drawable.hitam)
                                    satu.text = "4"
                                    dua.setBackgroundResource(R.drawable.kuning)
                                    dua.text = "1"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "3"){
                                    satu.setBackgroundResource(R.drawable.hitam)
                                    satu.text = "4"
                                    dua.setBackgroundResource(R.drawable.merah)
                                    dua.text = "3"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "5"){
                                    satu.setBackgroundResource(R.drawable.hitam)
                                    satu.text = "4"
                                    dua.setBackgroundResource(R.drawable.putih)
                                    dua.text = "5"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                            }
                            else {
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                dua.text = "DUA"
                            }
                        }
                        else if (dua.text == "5"){
                            if (tiga.text != "TIGA"){
                                if (tiga.text == "1"){
                                    satu.setBackgroundResource(R.drawable.putih)
                                    satu.text = "5"
                                    dua.setBackgroundResource(R.drawable.kuning)
                                    dua.text = "1"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "3"){
                                    satu.setBackgroundResource(R.drawable.putih)
                                    satu.text = "5"
                                    dua.setBackgroundResource(R.drawable.merah)
                                    dua.text = "3"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                                if (tiga.text == "4"){
                                    satu.setBackgroundResource(R.drawable.putih)
                                    satu.text = "5"
                                    dua.setBackgroundResource(R.drawable.hitam)
                                    dua.text = "4"
                                    tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    tiga.text = "TIGA"
                                }
                            }
                            else {
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                dua.text = "DUA"
                            }
                        }
                    }
                    else {
                        satu.setBackgroundResource(R.drawable.buttonmixcolor)
                        satu.text = "SATU"
                    }
                biru.setImageResource(0)
            }

            else if (satu.text == "3"){
                if (dua.text != "DUA"){
                    if (dua.text == "1"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.kuning)
                            satu.text = "1"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "2"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.biru)
                            satu.text = "2"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "4"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.hitam)
                            satu.text = "4"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "5"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.putih)
                            satu.text = "5"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                }
                else {
                    satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    satu.text = "SATU"
                }
                merah.setImageResource(0)
            }

            else if (satu.text == "4"){
                if (dua.text != "DUA"){
                    if (dua.text == "1"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.kuning)
                            satu.text = "1"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "2"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.biru)
                            satu.text = "2"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "3"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "5"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.putih)
                                dua.text = "5"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.merah)
                            satu.text = "3"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                    else if (dua.text == "5"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.putih)
                                satu.text = "5"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.putih)
                            satu.text = "5"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                }
                else {
                    satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    satu.text = "SATU"
                }
                hitam.setImageResource(0)
            }

            else if (satu.text == "5"){
                if (dua.text != "DUA"){
                    if (dua.text == "1"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.kuning)
                                satu.text = "1"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.kuning)
                            satu.text = "1"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }

                    else if (dua.text == "2"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.biru)
                                satu.text = "2"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.biru)
                            satu.text = "2"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }

                    else if (dua.text == "4"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "3"){
                                satu.setBackgroundResource(R.drawable.hitam)
                                satu.text = "4"
                                dua.setBackgroundResource(R.drawable.merah)
                                dua.text = "3"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.hitam)
                            satu.text = "4"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }

                    else if (dua.text == "3"){
                        if (tiga.text != "TIGA"){
                            if (tiga.text == "1"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.kuning)
                                dua.text = "1"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "2"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.biru)
                                dua.text = "2"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                            if (tiga.text == "4"){
                                satu.setBackgroundResource(R.drawable.merah)
                                satu.text = "3"
                                dua.setBackgroundResource(R.drawable.hitam)
                                dua.text = "4"
                                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                tiga.text = "TIGA"
                            }
                        }
                        else {
                            satu.setBackgroundResource(R.drawable.merah)
                            satu.text = "3"
                            dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            dua.text = "DUA"
                        }
                    }
                }
                else {
                    satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    satu.text = "SATU"
                }
                putih.setImageResource(0)
            }
        }

        dua.setOnClickListener {
            if (dua.text == "1"){
                if (tiga.text != "TIGA"){
                    if (tiga.text == "2"){
                        dua.setBackgroundResource(R.drawable.biru)
                        dua.text = "2"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "3"){
                        dua.setBackgroundResource(R.drawable.merah)
                        dua.text = "3"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "4"){
                        dua.setBackgroundResource(R.drawable.hitam)
                        dua.text = "4"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "5"){
                        dua.setBackgroundResource(R.drawable.putih)
                        dua.text = "5"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                }
                else {
                    dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    dua.text = "DUA"
                }
                kuning.setImageResource(0)
            }

            else if (dua.text == "2"){
                if (tiga.text != "TIGA"){
                    if (tiga.text == "1"){
                        dua.setBackgroundResource(R.drawable.kuning)
                        dua.text = "1"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "3"){
                        dua.setBackgroundResource(R.drawable.merah)
                        dua.text = "3"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "4"){
                        dua.setBackgroundResource(R.drawable.hitam)
                        dua.text = "4"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "5"){
                        dua.setBackgroundResource(R.drawable.putih)
                        dua.text = "5"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                }
                else {
                    dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    dua.text = "DUA"
                }
                biru.setImageResource(0)
            }

            else if (dua.text == "3"){
                if (tiga.text != "TIGA"){
                    if (tiga.text == "1"){
                        dua.setBackgroundResource(R.drawable.kuning)
                        dua.text = "1"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "2"){
                        dua.setBackgroundResource(R.drawable.biru)
                        dua.text = "2"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "4"){
                        dua.setBackgroundResource(R.drawable.hitam)
                        dua.text = "4"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "5"){
                        dua.setBackgroundResource(R.drawable.putih)
                        dua.text = "5"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                }
                else {
                    dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    dua.text = "DUA"
                }
                merah.setImageResource(0)
            }

            else if (dua.text == "4"){
                if (tiga.text != "TIGA"){
                    if (tiga.text == "2"){
                        dua.setBackgroundResource(R.drawable.biru)
                        dua.text = "2"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "3"){
                        dua.setBackgroundResource(R.drawable.merah)
                        dua.text = "3"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "1"){
                        dua.setBackgroundResource(R.drawable.kuning)
                        dua.text = "1"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "5"){
                        dua.setBackgroundResource(R.drawable.putih)
                        dua.text = "5"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                }
                else {
                    dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    dua.text = "DUA"
                }
                hitam.setImageResource(0)
            }

            else if (dua.text == "5"){
                if (tiga.text != "TIGA"){
                    if (tiga.text == "2"){
                        dua.setBackgroundResource(R.drawable.biru)
                        dua.text = "2"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "3"){
                        dua.setBackgroundResource(R.drawable.merah)
                        dua.text = "3"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "1"){
                        dua.setBackgroundResource(R.drawable.kuning)
                        dua.text = "1"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                    if (tiga.text == "4"){
                        dua.setBackgroundResource(R.drawable.hitam)
                        dua.text = "4"
                        tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        tiga.text = "TIGA"
                    }
                }
                else {
                    dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    dua.text = "DUA"
                }
                putih.setImageResource(0)
            }

        }

        tiga.setOnClickListener {
            if (tiga.text == "1"){
                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                kuning.setImageResource(0)
            }
            if (tiga.text == "2"){
                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                biru.setImageResource(0)
            }
            if (tiga.text == "3"){
                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                merah.setImageResource(0)
            }
            if (tiga.text == "4"){
                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                hitam.setImageResource(0)
            }
            if (tiga.text == "5"){
                tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                putih.setImageResource(0)
            }
            tiga.text = "TIGA"
        }

        mix.setOnClickListener {
            if (satu.text == "1"){
                if (dua.text == "2"){
                    if (tiga.text == "3"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        hijautua()
                    }
                    else if (tiga.text == "5"){
                        hijaumuda()
                    }
                    else{
                        hijau()
                    }
                }

                else if (dua.text == "3"){
                    if (tiga.text == "2"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        orangetua()
                    }
                    else if (tiga.text == "5"){
                        orangemuda()
                    }
                    else{
                        orange()
                    }
                }

                else if (dua.text == "4"){
                    if (tiga.text == "2"){
                        hijautua()
                    }
                    else if (tiga.text == "3"){
                        orangetua()
                    }
                    else if (tiga.text == "5"){
                        kuning()
                    }
                    else {
                        kuningtua()
                    }
                }

                else if (dua.text == "5"){
                    if (tiga.text == "2"){
                        hijaumuda()
                    }
                    else if (tiga.text == "3"){
                        orangemuda()
                    }
                    else if (tiga.text == "4"){
                        kuning()
                    }
                    else{
                        kuningmuda()
                    }
                }

                else{
                    kuning()
                }
            }

            else if (satu.text == "2"){

                if (dua.text == "1"){
                    if (tiga.text == "3"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        hijautua()
                    }
                    else if (tiga.text == "5"){
                        hijaumuda()
                    }
                    else{
                        hijau()
                    }
                }

                else if (dua.text == "3"){
                    if (tiga.text == "1"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        ungutua()
                    }
                    else if (tiga.text == "5"){
                        ungumuda()
                    }
                    else{
                        ungu()
                    }
                }

                else if (dua.text == "4"){
                    if (tiga.text == "1"){
                        hijautua()
                    }
                    else if (tiga.text == "3"){
                        ungutua()
                    }
                    else if (tiga.text == "5"){
                        biru()
                    }
                    else{
                        birutua()
                    }
                }

                else if (dua.text == "5"){
                    if (tiga.text == "1"){
                        hijaumuda()
                    }
                    else if (tiga.text == "3"){
                        ungumuda()
                    }
                    else if (tiga.text == "4"){
                        biru()
                    }
                    else{
                        birumuda()
                    }
                }

                else{
                    biru()
                }
            }

            else if (satu.text == "3"){
                if (dua.text == "1"){
                    if (tiga.text == "2"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        orangetua()
                    }
                    else if (tiga.text == "5"){
                        orangemuda()
                    }
                    else{
                        orange()
                    }
                }

                else if (dua.text == "2"){
                    if (tiga.text == "1"){
                        hitam()
                    }
                    else if (tiga.text == "4"){
                        ungutua()
                    }
                    else if (tiga.text == "5"){
                        ungumuda()
                    }
                    else{
                        ungu()
                    }
                }

                else if (dua.text == "4"){
                    if (tiga.text == "1"){
                        orangetua()
                    }
                    else if (tiga.text == "2"){
                        ungutua()
                    }
                    else if (tiga.text == "5"){
                        merah()
                    }
                    else {
                        merahtua()
                    }
                }

                else if (dua.text == "5"){
                    if (tiga.text == "2"){
                        ungumuda()
                    }
                    else if (tiga.text == "4"){
                        merah()
                    }
                    else if (tiga.text == "1"){
                        orangemuda()
                    }
                    else {
                        merahmuda()
                    }
                }

                else{
                    merah()
                }
            }

            else if (satu.text == "4"){
                if (dua.text == "1"){
                    if (tiga.text == "2"){
                        hijautua()
                    }
                    else if (tiga.text == "3"){
                        orangetua()
                    }
                    else if (tiga.text == "5"){
                        kuning()
                    }
                    else {
                        kuningtua()
                    }
                }

                else if (dua.text == "2"){
                    if (tiga.text == "1"){
                        hijautua()
                    }
                    else if (tiga.text == "3"){
                        ungutua()
                    }
                    else if (tiga.text == "5"){
                        biru()
                    }
                    else {
                        birutua()
                    }
                }

                else if (dua.text == "3"){
                    if (tiga.text == "2"){
                        ungutua()
                    }
                    else if (tiga.text == "1"){
                        orangetua()
                    }
                    else if (tiga.text == "5"){
                        merah()
                    }
                    else {
                        merahtua()
                    }
                }

                else if (dua.text == "5"){
                    if (tiga.text == "2"){
                        biru()
                    }
                    else if (tiga.text == "3"){
                        merah()
                    }
                    else if (tiga.text == "1"){
                        kuning()
                    }
                    else {
                        abu()
                    }
                }
                else{
                    hitam()
                }
            }

            else if (satu.text == "5"){
                if (dua.text == "1"){
                    if (tiga.text == "2"){
                        hijaumuda()
                    }
                    else if (tiga.text == "3"){
                        orangemuda()
                    }
                    else if (tiga.text == "4"){
                        kuning()
                    }
                    else{
                        kuningmuda()
                    }
                }
                else if (dua.text == "2"){
                    if (tiga.text == "1"){
                        hijaumuda()
                    }
                    else if (tiga.text == "3"){
                        ungumuda()
                    }
                    else if (tiga.text == "4"){
                        biru()
                    }
                    else {
                        birumuda()
                    }
                }
                else if (dua.text == "3"){
                    if (tiga.text == "2"){
                        ungumuda()
                    }
                    else if (tiga.text == "1"){
                        orangemuda()
                    }
                    else if (tiga.text == "4"){
                        merah()
                    }
                    else {
                        merahmuda()
                    }
                }
                else if (dua.text == "4"){
                    if (tiga.text == "2"){
                        biru()
                    }
                    else if (tiga.text == "3"){
                        merah()
                    }
                    else if (tiga.text == "1"){
                        kuning()
                    }
                    else{
                        abu()
                    }
                }
                else{
                    putih()
                }
            }
            else {
                Toast.makeText(this, "Ayo bermain warna", Toast.LENGTH_SHORT).show()
                warnabesar.setImageResource(R.color.putihkotor)
                namawarnaindo.text = ""
                namawarnaing.text = ""
            }
        }

        soundon.setOnClickListener {
            soundOn()
        }
    }

    fun soundOn(){
        if(namawarnaindo.text == "hitam"){
            player = MediaPlayer.create(this, R.raw.black)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "abu - abu"){
            player = MediaPlayer.create(this, R.raw.grey)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "putih"){
            player = MediaPlayer.create(this, R.raw.white)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "kuning"){
            player = MediaPlayer.create(this, R.raw.yellow)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "kuning tua"){
            player = MediaPlayer.create(this, R.raw.kuningtua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "kuning muda"){
            player = MediaPlayer.create(this, R.raw.kuningmuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "merah"){
            player = MediaPlayer.create(this, R.raw.red)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "merah tua"){
            player = MediaPlayer.create(this, R.raw.merahtua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "merah jambu"){
            player = MediaPlayer.create(this, R.raw.pink)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "biru"){
            player = MediaPlayer.create(this, R.raw.blue)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "biru tua"){
            player = MediaPlayer.create(this, R.raw.darkblue)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "biru muda"){
            player = MediaPlayer.create(this, R.raw.birumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "jingga"){
            player = MediaPlayer.create(this, R.raw.orange)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "jingga tua"){
            player = MediaPlayer.create(this, R.raw.oranyetua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "jingga muda"){
            player = MediaPlayer.create(this, R.raw.oranyemuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "hijau"){
            player = MediaPlayer.create(this, R.raw.green)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "hijau tua"){
            player = MediaPlayer.create(this, R.raw.hijautua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "hijau muda"){
            player = MediaPlayer.create(this, R.raw.hijaumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }

        else if (namawarnaindo.text == "ungu"){
            player = MediaPlayer.create(this, R.raw.purple)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "ungu tua"){
            player = MediaPlayer.create(this, R.raw.ungutua)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
        else if (namawarnaindo.text == "ungu muda"){
            player = MediaPlayer.create(this, R.raw.ungumuda)
            player.start()
            player.isLooping = false
            player.setOnCompletionListener {
                player.release()
            }
        }
    }

    fun hitam(){
        namawarnaindo.text = "hitam"
        namawarnaing.text = "Black"
        warnabesar.setImageResource(R.color.hitam)
    }

    fun merah(){
        namawarnaindo.text = "merah"
        namawarnaing.text = "Red"
        warnabesar.setImageResource(R.color.merah)
    }

    fun merahtua(){
        namawarnaindo.text = "merah tua"
        namawarnaing.text = "Dark Red"
        warnabesar.setImageResource(R.color.merahtua)
    }

    fun merahmuda(){
        namawarnaindo.text = "merah jambu"
        namawarnaing.text = "Pink"
        warnabesar.setImageResource(R.color.merahmuda)
    }

    fun kuning(){
        namawarnaindo.text = "kuning"
        namawarnaing.text = "Yellow"
        warnabesar.setImageResource(R.color.kuning)
    }

    fun kuningtua(){
        namawarnaindo.text = "kuning tua"
        namawarnaing.text = "Dark Yellow"
        warnabesar.setImageResource(R.color.kuningtua)
    }

    fun kuningmuda(){
        namawarnaindo.text = "kuningmuda"
        namawarnaing.text = "Light Yellow"
        warnabesar.setImageResource(R.color.kuningmuda)
    }

    fun hijau(){
        namawarnaindo.text = "hijau"
        namawarnaing.text = "Green"
        warnabesar.setImageResource(R.color.hijau)
    }

    fun hijautua(){
        namawarnaindo.text = "hijau tua"
        namawarnaing.text = "Dark Green"
        warnabesar.setImageResource(R.color.hijautua)
    }

    fun hijaumuda(){
        namawarnaindo.text = "hijau muda"
        namawarnaing.text = "Light Green"
        warnabesar.setImageResource(R.color.hijaumuda)
    }

    fun orange(){
        namawarnaindo.text = "jingga"
        namawarnaing.text = "Orange"
        warnabesar.setImageResource(R.color.orange)
    }

    fun orangetua(){
        namawarnaindo.text = "jingga tua"
        namawarnaing.text = "Dark Orange"
        warnabesar.setImageResource(R.color.orangetua)
    }

    fun orangemuda(){
        namawarnaindo.text = "jingga muda"
        namawarnaing.text = "Light Orange"
        warnabesar.setImageResource(R.color.orangemuda)
    }

    fun ungu(){
        namawarnaindo.text = "ungu"
        namawarnaing.text = "Purple"
        warnabesar.setImageResource(R.color.ungu)
    }

    fun ungumuda(){
        namawarnaindo.text = "ungu muda"
        namawarnaing.text = "Light Purple"
        warnabesar.setImageResource(R.color.ungumuda)
    }

    fun ungutua(){
        namawarnaindo.text = "ungu tua"
        namawarnaing.text = "Dark Purple"
        warnabesar.setImageResource(R.color.ungutua)
    }

    fun biru(){
        namawarnaindo.text = "biru"
        namawarnaing.text = "Blue"
        warnabesar.setImageResource(R.color.biru)
    }

    fun birumuda(){
        namawarnaindo.text = "biru muda"
        namawarnaing.text = "Light Blue"
        warnabesar.setImageResource(R.color.birumuda)
    }

    fun birutua(){
        namawarnaindo.text = "biru tua"
        namawarnaing.text = "Dark Blue"
        warnabesar.setImageResource(R.color.birutua)
    }

    fun abu(){
        namawarnaindo.text = "abu - abu"
        namawarnaing.text = "Grey"
        warnabesar.setImageResource(R.color.abuabu)
    }

    fun putih(){
        namawarnaindo.text = "putih"
        namawarnaing.text = "White"
        warnabesar.setImageResource(R.color.putih)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}