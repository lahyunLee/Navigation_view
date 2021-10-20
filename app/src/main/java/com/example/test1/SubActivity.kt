package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.fragment_home.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        login_1.setOnClickListener {
            val intent = Intent(this, MainActivity_viewpager::class.java)
            startActivity(intent)

    }

    }
}
