package com.developersoul.emojidictionary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var lm: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lm = LinearLayoutManager(this)
        myRecyclerView.layoutManager = lm
        var emojis: ArrayList<String> = arrayListOf("⚡️", "😱", "😀")
        emojis.add("🤣")
        emojis.add("😇")
        myRecyclerView.adapter = EmojiAdapter(emojis)
    }
}
