package com.example.bebanggis

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz.*

class Quiz : AppCompatActivity() {

    lateinit var dialog : Dialog
    lateinit var buttonYes : Button
    lateinit var buttonNo : Button
    lateinit var buttonX : ImageButton

    var questions = arrayOf(
        "1. Apa bahasa inggrisnya merah?",
        "2. Bahasa inggrisnya kucing adalah?",
        "3. Penulisan yang benar dari wortel dalam bahasa inggris adalah?",
        "4. \"Yellow\" dan \"red\" bila dicampur akan menghasilkan warna?",
        "5. Penulisan yang benar adalah?",
        "6. Warna hijau merupakan campuran dari warna?",
        "7. Buah dalam bahasa inggris yang berawalan huruf A adalah?",
        "8. Dalam bahasa inggris, bunga matahari berwarna?",
        "9. Dalam bahasa inggris, sayur sayuran biasanya berwarna?",
        "10. Bahasa inggrisnya ungu adalah?",
        "11. Cabbage dalam bahasa indonesia artinya?",
        "12. Warna apa saja yang ada dimiliki oleh Zebra?",
        "13. Car dalam bahasa indonesia memiliki arti?",
        "14. Warna dari bendera Indonesia adalah?",
        "15. Bahasa indonesianya dolphin adalah?"
    )
    var answers = arrayOf(
        "Red",
        "Cat",
        "Carrot",
        "Orange",
        "Xylophone",
        "Blue and Yellow",
        "Apple",
        "Yellow",
        "Green",
        "Purple",
        "Kol",
        "White and Black",
        "Mobil",
        "Red and White",
        "Lumba - Lumba"
    )
    var opt = arrayOf(
        "Red", "Black", "Pink", "Orange",
        "Dinosaur", "Eagle", "Dog", "Cat",
        "Carrot", "Caarot", "Carot", "Caroot",
        "Green", "Black", "Brown", "Orange",
        "Xylophone", "Xilophone", "Xilofone", "Xylofone",
        "White & Blue", "Blue & Red", "Blue & Yellow", "Yellow & Red",
        "Mango", "Carrot", "Banana", "Apple",
        "Yellow", "Black", "Red", "White",
        "Red", "Yellow", "Green", "White",
        "Blue", "Yellow", "Red", "Purple",
        "Kol", "Wortel", "Buncis", "Brokoli",
        "White & Black", "Black & Red", "Black & Grey", "White & Blue",
        "Mobil", "Motor", "Pesawat", "Perahu",
        "Blue & Red", "Red & Black", "White & Blue", "Red & White",
        "Kucing", "Lumba - lumba", "Jerapah", "Gajah"
    )
    var flag = 0
    var marks : Int = 0
    var correct : Int = 0
    var ans : String = ""
    var no = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        dialog = Dialog(this)

        val level = intent.getStringExtra("Level").toString()
        if (level == "1"){
            nomorlevel.text = "/5"
        }
        else if (level == "2"){
            nomorlevel.text = "/10"
        }
        else {
            nomorlevel.text = "/15"
        }
        textView7.text = no.toString()

        soal.text = questions[flag]
        option_a.text = opt[0]
        option_b.text = opt[1]
        option_c.text = opt[2]
        option_d.text = opt[3]

        buttonjawab_a.setOnClickListener {
            ans = option_a.text.toString()
            buttona.setBackgroundResource(R.drawable.circlegreen)
            buttona.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            buttonb.setBackgroundResource(R.drawable.circlepurple)
            buttonb.setTextColor(resources.getColor(R.color.white))

            buttonc.setBackgroundResource(R.drawable.circlepurple)
            buttonc.setTextColor(resources.getColor(R.color.white))

            buttond.setBackgroundResource(R.drawable.circlepurple)
            buttond.setTextColor(resources.getColor(R.color.white))
        }
        buttonjawab_b.setOnClickListener {
            ans = option_b.text.toString()

            buttonb.setBackgroundResource(R.drawable.circlegreen)
            buttonb.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            buttona.setBackgroundResource(R.drawable.circlepurple)
            buttona.setTextColor(resources.getColor(R.color.white))

            buttonc.setBackgroundResource(R.drawable.circlepurple)
            buttonc.setTextColor(resources.getColor(R.color.white))

            buttond.setBackgroundResource(R.drawable.circlepurple)
            buttond.setTextColor(resources.getColor(R.color.white))
        }
        buttonjawab_c.setOnClickListener {
            ans = option_c.text.toString()

            buttonc.setBackgroundResource(R.drawable.circlegreen)
            buttonc.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            buttonb.setBackgroundResource(R.drawable.circlepurple)
            buttonb.setTextColor(resources.getColor(R.color.white))

            buttona.setBackgroundResource(R.drawable.circlepurple)
            buttona.setTextColor(resources.getColor(R.color.white))

            buttond.setBackgroundResource(R.drawable.circlepurple)
            buttond.setTextColor(resources.getColor(R.color.white))
        }
        buttonjawab_d.setOnClickListener {
            ans = option_d.text.toString()

            buttond.setBackgroundResource(R.drawable.circlegreen)
            buttond.setTextColor(resources.getColor(R.color.colorPrimaryDark))
//
            buttonb.setBackgroundResource(R.drawable.circlepurple)
            buttonb.setTextColor(resources.getColor(R.color.white))

            buttonc.setBackgroundResource(R.drawable.circlepurple)
            buttonc.setTextColor(resources.getColor(R.color.white))

            buttona.setBackgroundResource(R.drawable.circlepurple)
            buttona.setTextColor(resources.getColor(R.color.white))
        }

        buttonback.setOnClickListener {
            onBackPressed()
        }

        next.setOnClickListener {
            if (ans == ""){
                Toast.makeText(this, "SELECT ONE BUTTON", Toast.LENGTH_SHORT).show()
            }
            else if (ans == answers[flag]){
                correct++
            }

            if (ans != ""){
                flag++
                ans = ""
                if (level == "1" && flag == 5){
                    marks = correct*20
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "1")
                    startActivity(intent)
                    finish()
                }
                else if (level == "2" && flag == 10){
                    marks = correct*10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "2")
                    startActivity(intent)
                    finish()
                }
                else if (level== "3" && flag == 15){
                    marks = (correct*6) + 10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "3")
                    startActivity(intent)
                    finish()
                } else {
                    soal.text = questions[flag]
                    option_a.text = opt[flag*4]
                    option_b.text = opt[flag*4+1]
                    option_c.text = opt[flag*4+2]
                    option_d.text = opt[flag*4+3]
                    textView7.text = no++.toString()
                    clear()
                }
            }
        }

    }

    fun clear(){
        buttona.setBackgroundResource(R.drawable.circlepurple)
        buttona.setTextColor(resources.getColor(R.color.white))
//
        buttonb.setBackgroundResource(R.drawable.circlepurple)
        buttonb.setTextColor(resources.getColor(R.color.white))

        buttonc.setBackgroundResource(R.drawable.circlepurple)
        buttonc.setTextColor(resources.getColor(R.color.white))

        buttond.setBackgroundResource(R.drawable.circlepurple)
        buttond.setTextColor(resources.getColor(R.color.white))
    }

    override fun onBackPressed() {
        dialog.setContentView(R.layout.alertdialog)
        buttonYes = dialog.findViewById(R.id.button_ya)
        buttonNo = dialog.findViewById(R.id.button_tidak)
        buttonX = dialog.findViewById(R.id.button_x)
        buttonYes.setOnClickListener {
            super.onBackPressed()
            finish()
        }
        buttonNo.setOnClickListener {
            dialog.dismiss()
        }
        buttonX.setOnClickListener {
            dialog.dismiss()
        }
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }


}