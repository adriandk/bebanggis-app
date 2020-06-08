package com.example.bebanggis

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_learn_alfabeth.*

class LearnAlfabeth : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_alfabeth)

        buttonback.setOnClickListener {
            onBackPressed()
        }

        button_a.setOnClickListener {
            huruf.text = "Aa"
            bahasa_inggris.text = "Apple"
            bahasa_indo.text = "Apel"
            gambar.setImageResource(R.mipmap.a)
            soundOn()

            button_a.setBackgroundResource(R.drawable.clickedalfabeth)
            button_a.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_b.setOnClickListener {
            huruf.text = "Bb"
            bahasa_inggris.text = "Banana"
            bahasa_indo.text = "Pisang"
            gambar.setImageResource(R.mipmap.b)
            soundOn()

            button_b.setBackgroundResource(R.drawable.clickedalfabeth)
            button_b.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_c.setOnClickListener {
            huruf.text = "Cc"
            bahasa_inggris.text = "Cat"
            bahasa_indo.text = "Kucing"
            gambar.setImageResource(R.mipmap.a)
            soundOn()

            button_c.setBackgroundResource(R.drawable.clickedalfabeth)
            button_c.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_d.setOnClickListener {
            huruf.text = "Dd"
            bahasa_inggris.text = "Doctor"
            bahasa_indo.text = "Doktor"
            gambar.setImageResource(R.mipmap.d)
            soundOn()

            button_d.setBackgroundResource(R.drawable.clickedalfabeth)
            button_d.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_E.setOnClickListener {
            huruf.text = "Ee"
            bahasa_inggris.text = "Elephant"
            bahasa_indo.text = "Gajah"
            gambar.setImageResource(R.mipmap.e)
            soundOn()

            button_E.setBackgroundResource(R.drawable.clickedalfabeth)
            button_E.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_f.setOnClickListener {
            huruf.text = "Ff"
            bahasa_inggris.text = "Fire truck"
            bahasa_indo.text = "Mobil pemadam kebakaran"
            gambar.setImageResource(R.mipmap.f)
            soundOn()

            button_f.setBackgroundResource(R.drawable.clickedalfabeth)
            button_f.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_g.setOnClickListener {
            huruf.text = "Gg"
            bahasa_inggris.text = "Guitar"
            bahasa_indo.text = "Gitar"
            gambar.setImageResource(R.mipmap.g)
            soundOn()

            button_g.setBackgroundResource(R.drawable.clickedalfabeth)
            button_g.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_h.setOnClickListener {
            huruf.text = "Hh"
            bahasa_inggris.text = "Horse"
            bahasa_indo.text = "Kuda"
            gambar.setImageResource(R.mipmap.h)
            soundOn()

            button_h.setBackgroundResource(R.drawable.clickedalfabeth)
            button_h.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_i.setOnClickListener {
            huruf.text = "Ii"
            bahasa_inggris.text = "Ice cream"
            bahasa_indo.text = "Es krim"
            gambar.setImageResource(R.mipmap.i)
            soundOn()

            button_i.setBackgroundResource(R.drawable.clickedalfabeth)
            button_i.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_j.setOnClickListener {
            huruf.text = "Jj"
            bahasa_inggris.text = "Jar"
            bahasa_indo.text = "Toples"
            gambar.setImageResource(R.mipmap.j)
            soundOn()

            button_j.setBackgroundResource(R.drawable.clickedalfabeth)
            button_j.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_k.setOnClickListener {
            huruf.text = "Kk"
            bahasa_inggris.text = "Kite"
            bahasa_indo.text = "Layangan"
            gambar.setImageResource(R.mipmap.k)
            soundOn()

            button_k.setBackgroundResource(R.drawable.clickedalfabeth)
            button_k.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_l.setOnClickListener {
            huruf.text = "Ll"
            bahasa_inggris.text = "Ladder"
            bahasa_indo.text = "Tangga"
            gambar.setImageResource(R.mipmap.l)
            soundOn()

            button_l.setBackgroundResource(R.drawable.clickedalfabeth)
            button_l.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_m.setOnClickListener {
            huruf.text = "Mm"
            bahasa_inggris.text = "Mango"
            bahasa_indo.text = "Mangga"
            gambar.setImageResource(R.mipmap.m)
            soundOn()

            button_m.setBackgroundResource(R.drawable.clickedalfabeth)
            button_m.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_n.setOnClickListener {
            huruf.text = "Nn"
            bahasa_inggris.text = "Nest"
            bahasa_indo.text = "Sarang"
            gambar.setImageResource(R.mipmap.n)
            soundOn()

            button_n.setBackgroundResource(R.drawable.clickedalfabeth)
            button_n.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_o.setOnClickListener {
            huruf.text = "Oo"
            bahasa_inggris.text = "Owl"
            bahasa_indo.text = "Burung hantu"
            gambar.setImageResource(R.mipmap.o)
            soundOn()

            button_o.setBackgroundResource(R.drawable.clickedalfabeth)
            button_o.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_p.setOnClickListener {
            huruf.text = "Pp"
            bahasa_inggris.text = "Panda"
            bahasa_indo.text = "Panda"
            gambar.setImageResource(R.mipmap.p)
            soundOn()

            button_p.setBackgroundResource(R.drawable.clickedalfabeth)
            button_p.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_q.setOnClickListener {
            huruf.text = "Qq"
            bahasa_inggris.text = "Queen"
            bahasa_indo.text = "Ratu"
            gambar.setImageResource(R.mipmap.q)
            soundOn()

            button_q.setBackgroundResource(R.drawable.clickedalfabeth)
            button_q.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_r.setOnClickListener {
            huruf.text = "Rr"
            bahasa_inggris.text = "Rabbit"
            bahasa_indo.text = "Kelinci"
            gambar.setImageResource(R.mipmap.r)
            soundOn()

            button_r.setBackgroundResource(R.drawable.clickedalfabeth)
            button_r.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_s.setOnClickListener {
            huruf.text = "Ss"
            bahasa_inggris.text = "Socks"
            bahasa_indo.text = "Kaus Kaki"
            gambar.setImageResource(R.mipmap.s)
            soundOn()

            button_s.setBackgroundResource(R.drawable.clickedalfabeth)
            button_s.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_t.setOnClickListener {
            huruf.text = "Tt"
            bahasa_inggris.text = "Turtle"
            bahasa_indo.text = "Kura - kura"
            gambar.setImageResource(R.mipmap.t)
            soundOn()

            button_t.setBackgroundResource(R.drawable.clickedalfabeth)
            button_t.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_u.setOnClickListener {
            huruf.text = "Uu"
            bahasa_inggris.text = "Umbrella"
            bahasa_indo.text = "Payung"
            gambar.setImageResource(R.mipmap.u)
            soundOn()

            button_u.setBackgroundResource(R.drawable.clickedalfabeth)
            button_u.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_v.setOnClickListener {
            huruf.text = "Vv"
            bahasa_inggris.text = "Volleyball"
            bahasa_indo.text = "Bola voli"
            gambar.setImageResource(R.mipmap.v)
            soundOn()

            button_v.setBackgroundResource(R.drawable.clickedalfabeth)
            button_v.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_w.setOnClickListener {
            huruf.text = "Ww"
            bahasa_inggris.text = "Wolf"
            bahasa_indo.text = "Serigala"
            gambar.setImageResource(R.mipmap.w)
            soundOn()

            button_w.setBackgroundResource(R.drawable.clickedalfabeth)
            button_w.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_x.setOnClickListener {
            huruf.text = "Xx"
            bahasa_inggris.text = "Xylophone"
            bahasa_indo.text = "Gambang"
            gambar.setImageResource(R.mipmap.x)
            soundOn()

            button_x.setBackgroundResource(R.drawable.clickedalfabeth)
            button_x.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_y.setOnClickListener {
            huruf.text = "Yy"
            bahasa_inggris.text = "Yoyo"
            bahasa_indo.text = "Yoyo"
            gambar.setImageResource(R.mipmap.y)
            soundOn()

            button_y.setBackgroundResource(R.drawable.clickedalfabeth)
            button_y.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))

            button_z.setBackgroundResource(R.drawable.buttonalfabeth)
            button_z.setTextColor(resources.getColor(R.color.white))
        }

        button_z.setOnClickListener {
            huruf.text = "Zz"
            bahasa_inggris.text = "Zebra"
            bahasa_indo.text = "Zebra"
            gambar.setImageResource(R.mipmap.z)
            soundOn()

            button_z.setBackgroundResource(R.drawable.clickedalfabeth)
            button_z.setTextColor(resources.getColor(R.color.colorPrimaryDark))

            button_b.setBackgroundResource(R.drawable.buttonalfabeth)
            button_b.setTextColor(resources.getColor(R.color.white))

            button_c.setBackgroundResource(R.drawable.buttonalfabeth)
            button_c.setTextColor(resources.getColor(R.color.white))

            button_a.setBackgroundResource(R.drawable.buttonalfabeth)
            button_a.setTextColor(resources.getColor(R.color.white))

            button_E.setBackgroundResource(R.drawable.buttonalfabeth)
            button_E.setTextColor(resources.getColor(R.color.white))

            button_f.setBackgroundResource(R.drawable.buttonalfabeth)
            button_f.setTextColor(resources.getColor(R.color.white))

            button_g.setBackgroundResource(R.drawable.buttonalfabeth)
            button_g.setTextColor(resources.getColor(R.color.white))

            button_h.setBackgroundResource(R.drawable.buttonalfabeth)
            button_h.setTextColor(resources.getColor(R.color.white))

            button_i.setBackgroundResource(R.drawable.buttonalfabeth)
            button_i.setTextColor(resources.getColor(R.color.white))

            button_j.setBackgroundResource(R.drawable.buttonalfabeth)
            button_j.setTextColor(resources.getColor(R.color.white))

            button_k.setBackgroundResource(R.drawable.buttonalfabeth)
            button_k.setTextColor(resources.getColor(R.color.white))

            button_l.setBackgroundResource(R.drawable.buttonalfabeth)
            button_l.setTextColor(resources.getColor(R.color.white))

            button_m.setBackgroundResource(R.drawable.buttonalfabeth)
            button_m.setTextColor(resources.getColor(R.color.white))

            button_n.setBackgroundResource(R.drawable.buttonalfabeth)
            button_n.setTextColor(resources.getColor(R.color.white))

            button_o.setBackgroundResource(R.drawable.buttonalfabeth)
            button_o.setTextColor(resources.getColor(R.color.white))

            button_p.setBackgroundResource(R.drawable.buttonalfabeth)
            button_p.setTextColor(resources.getColor(R.color.white))

            button_q.setBackgroundResource(R.drawable.buttonalfabeth)
            button_q.setTextColor(resources.getColor(R.color.white))

            button_r.setBackgroundResource(R.drawable.buttonalfabeth)
            button_r.setTextColor(resources.getColor(R.color.white))

            button_s.setBackgroundResource(R.drawable.buttonalfabeth)
            button_s.setTextColor(resources.getColor(R.color.white))

            button_t.setBackgroundResource(R.drawable.buttonalfabeth)
            button_t.setTextColor(resources.getColor(R.color.white))

            button_d.setBackgroundResource(R.drawable.buttonalfabeth)
            button_d.setTextColor(resources.getColor(R.color.white))

            button_v.setBackgroundResource(R.drawable.buttonalfabeth)
            button_v.setTextColor(resources.getColor(R.color.white))

            button_w.setBackgroundResource(R.drawable.buttonalfabeth)
            button_w.setTextColor(resources.getColor(R.color.white))

            button_x.setBackgroundResource(R.drawable.buttonalfabeth)
            button_x.setTextColor(resources.getColor(R.color.white))

            button_y.setBackgroundResource(R.drawable.buttonalfabeth)
            button_y.setTextColor(resources.getColor(R.color.white))

            button_u.setBackgroundResource(R.drawable.buttonalfabeth)
            button_u.setTextColor(resources.getColor(R.color.white))
        }
    }

    private fun soundOn(){
        when(huruf.text){
            "Aa" -> {
                val player = MediaPlayer.create(this, R.raw.a)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Bb" -> {
                val player = MediaPlayer.create(this, R.raw.b)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Cc" -> {
                val player = MediaPlayer.create(this, R.raw.c)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Dd" -> {
                val player = MediaPlayer.create(this, R.raw.d)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ee" -> {
                val player = MediaPlayer.create(this, R.raw.e)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ff" -> {
                val player = MediaPlayer.create(this, R.raw.f)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Gg" -> {
                val player = MediaPlayer.create(this, R.raw.g)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Hh" -> {
                val player = MediaPlayer.create(this, R.raw.h)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ii" -> {
                val player = MediaPlayer.create(this, R.raw.i)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Jj" -> {
                val player = MediaPlayer.create(this, R.raw.j)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Kk" -> {
                val player = MediaPlayer.create(this, R.raw.k)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ll" -> {
                val player = MediaPlayer.create(this, R.raw.l)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Mm" -> {
                val player = MediaPlayer.create(this, R.raw.m)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Nn" -> {
                val player = MediaPlayer.create(this, R.raw.n)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Oo" -> {
                val player = MediaPlayer.create(this, R.raw.o)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Pp" -> {
                val player = MediaPlayer.create(this, R.raw.p)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Qq" -> {
                val player = MediaPlayer.create(this, R.raw.q)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Rr" -> {
                val player = MediaPlayer.create(this, R.raw.r)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ss" -> {
                val player = MediaPlayer.create(this, R.raw.s)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Tt" -> {
                val player = MediaPlayer.create(this, R.raw.t)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Uu" -> {
                val player = MediaPlayer.create(this, R.raw.u)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Vv" -> {
                val player = MediaPlayer.create(this, R.raw.v)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ww" -> {
                val player = MediaPlayer.create(this, R.raw.w)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Xx" -> {
                val player = MediaPlayer.create(this, R.raw.x)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Yy" -> {
                val player = MediaPlayer.create(this, R.raw.y)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else -> {
                val player = MediaPlayer.create(this, R.raw.z)
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