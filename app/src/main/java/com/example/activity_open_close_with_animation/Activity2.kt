package com.example.activity_open_close_with_animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        bt_OpenActivity3.setOnClickListener {
            var i = Intent(this, Activity3::class.java)
            startActivity(i)
            overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_right)
        }

    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_left)
    }
}
