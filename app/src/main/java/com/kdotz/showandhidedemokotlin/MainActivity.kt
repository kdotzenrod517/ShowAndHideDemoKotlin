package com.kdotz.showandhidedemokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun show(view: View) {
        textView.visibility = View.VISIBLE
    }

    fun hide(view: View) {
        textView.visibility = View.INVISIBLE
    }
}
