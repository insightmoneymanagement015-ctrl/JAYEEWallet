package com.jayee.wallet

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)

        textView.text = "JAYEE Wallet"
        textView.textSize = 28f
        textView.setTextColor(Color.BLACK)
        textView.gravity = Gravity.CENTER
        textView.setPadding(40, 40, 40, 40)

        setContentView(textView)
    }
}
