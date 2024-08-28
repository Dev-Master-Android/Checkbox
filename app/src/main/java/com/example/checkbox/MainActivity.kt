package com.example.checkbox

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var infoTextView: TextView
    private lateinit var rulesTextView: TextView
    private lateinit var checkBox: CheckBox

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView = findViewById(R.id.infoTextView)
        rulesTextView = findViewById(R.id.rulesTextView)
        checkBox = findViewById(R.id.checkBox)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                infoTextView.text = resources.getString(R.string.text)
                rulesTextView.text = resources.getString(R.string.info)
            } else {
                infoTextView.text = ""
                rulesTextView.text = ""
            }
        }
    }
}