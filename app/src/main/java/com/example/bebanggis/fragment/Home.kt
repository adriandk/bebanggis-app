package com.example.bebanggis.fragment

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.example.bebanggis.GamesColor
import com.example.bebanggis.GamesQuiz
import com.example.bebanggis.LearnAlfabeth
import com.example.bebanggis.LearnColor
import com.example.bebanggis.R
import kotlinx.android.synthetic.main.fragment_home.*

class Home : Fragment() {

    private lateinit var epicDialog: Dialog
    private lateinit var btnxPopUP: ImageButton
    private lateinit var btnLearnXGames: Button
    private lateinit var btnLearnXGames2: Button
    private lateinit var player: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        epicDialog = Dialog(view.context)

        button_about.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_home2_to_about)
        )

        buttongames.setOnClickListener {
            epicDialog.setContentView(R.layout.gamesdialog)
            btnxPopUP = epicDialog.findViewById(R.id.button_xgames)

            btnLearnXGames = epicDialog.findViewById(R.id.button_quiz)
            btnLearnXGames.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_home2_to_gamesQuiz)
            )

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_home2_to_gamesColor)
            )

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        buttonlearn.setOnClickListener {

        }


    }

}