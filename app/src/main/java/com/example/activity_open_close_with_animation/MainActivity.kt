package com.example.activity_open_close_with_animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_OpenActivity2.setOnClickListener {
            var i = Intent(this,Activity2::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.enter_from_right,R.anim.exit_to_right)
        }
    }
}
