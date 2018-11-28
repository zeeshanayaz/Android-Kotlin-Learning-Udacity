package com.example.zeeshan.about_me

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }

    }

    private fun addNickName(view: View){
        val editText : EditText = findViewById(R.id.nickname_edit)
        val nickNameTextView : TextView = findViewById(R.id.nickname_text)

        nickNameTextView.text = editText.text
        editText.visibility = View.GONE         //Hiding EditText View
        view.visibility = View.GONE             //Hiding Button View
        nickNameTextView.visibility = View.VISIBLE
    }
}
