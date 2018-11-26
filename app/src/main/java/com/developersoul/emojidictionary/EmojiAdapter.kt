package com.developersoul.emojidictionary

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.rv_item.view.*

class EmojiAdapter(val emojis: ArrayList<String>) : RecyclerView.Adapter<EmojiAdapter.TextHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TextHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return TextHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return emojis.size
    }

    override fun onBindViewHolder(holder: EmojiAdapter.TextHolder, position: Int) {
        holder.bindEmoji(emojis[position])
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        var view: View = v
        var emoji: String = ""

        init {
            v.setOnClickListener(this)
        }

        fun bindEmoji(emoji: String) {
            this.emoji = emoji
            view.itemTextView.text = emoji
        }

        override fun onClick(v: View?) {
            val bundle = Bundle()
            bundle.putString("emoji", v?.itemTextView.toString())
            val detailIntent = Intent(v?.context, EmojiDetailActivity::class.java)
            detailIntent.putExtra("emoji", this.emoji)
            startActivity(view.context, detailIntent, bundle)
        }
    }
}