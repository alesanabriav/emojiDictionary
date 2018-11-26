package com.developersoul.emojidictionary

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.util.Log

import kotlinx.android.synthetic.main.activity_emoji_detail.*

class EmojiDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emoji_detail)
//        Log.e("EMOJI", savedInstanceState?.getString("emoji"))
    }

    override fun onStart() {
        super.onStart()
        val emoji = intent.getStringExtra("emoji")
        emojiText.text = emoji
    }

}
