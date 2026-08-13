package com.jayee.wallet

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "JAYEE Wallet"
        textView.textSize = 28f
        textView.setPadding(40, 40, 40, 40)

        setContentView(textView)
    }
}
