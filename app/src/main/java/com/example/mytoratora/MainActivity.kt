package com.example.mytoratora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        old_woman.setOnClickListener{onJankenButtonTapped(it)}
        kato.setOnClickListener{onJankenButtonTapped(it)}
        tiger.setOnClickListener{onJankenButtonTapped(it)}
    }
    fun onJankenButtonTapped(view: View?){
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("MY_TORATORA",view?.id)
        startActivity(intent)
    }
}
