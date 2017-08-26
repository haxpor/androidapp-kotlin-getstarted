package io.wasin.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // get the intent that started this activity and extract the string
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

        // capture the layout's TextView and set the string as its text
        val textView = findViewById(R.id.textView) as TextView
        textView.text = message
    }
}
