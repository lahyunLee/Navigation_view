package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub_account.*
import kotlinx.android.synthetic.main.fragment_my.*

class SubActivity_account : AppCompatActivity(), PassData {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_account)

        account_1.setOnClickListener {
            val intent = Intent(this, MainActivity_viewpager::class.java)
            startActivity(intent)

            val bundle = Bundle()
            val fragment_my_Activity = Fragment()
            bundle.putString("key", "value")
            fragment_my_Activity.arguments = bundle

            supportFragmentManager.beginTransaction()
                .replace(R.id.tv_email_1, fragment_my_Activity)
                .commit()




            save.setOnClickListener {
                Toast.makeText(this, "저장안되고 테스트니까 믿지마세요", Toast.LENGTH_SHORT).show()
            }


        }
    }

    override fun passData(editTextInput: String) {

    }

}