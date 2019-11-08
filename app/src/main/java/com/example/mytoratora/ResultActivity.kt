package com.example.mytoratora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    val tiger = 0
    val oldwoman = 1
    val kato = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val id = intent.getIntExtra("MY_TORATORA",0)
        val myHand:Int
        myHand = when(id){
            R.id.tiger -> {
                myHandImage.setImageResource(R.drawable.o102407171264484715931)
                tiger
            }
            R.id.old_woman->{
                myHandImage.setImageResource(R.drawable.keirou_obaachan_smile2)
                oldwoman
            }
            R.id.kato->{
                myHandImage.setImageResource(R.drawable.a3902f795a67d7e23e146978c0ae98dc)
                kato
            }
            else->tiger
        }
        val comHand = (Math.random()*3).toInt()
        when(comHand){
            tiger -> comHandImage.setImageResource(R.drawable.o102407171264484715931)
            oldwoman->comHandImage.setImageResource(R.drawable.keirou_obaachan_smile2)
            kato->comHandImage.setImageResource(R.drawable.a3902f795a67d7e23e146978c0ae98dc)
        }

        val gameResult = (comHand - myHand + 3)%3
        when(gameResult){
            0->resultlabel.setText(R.string.result_draw)
            1->resultlabel.setText(R.string.result_win)
            2->resultlabel.setText(R.string.result_lose)
        }
        backButton.setOnClickListener{finish()}
    }
}
