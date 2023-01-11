package com.example.sfera.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.R
import com.example.sfera.adapter.diff.ProfileListDiffCallBack
import com.example.sfera.adapter.holders.ImageItemViewHolder
import com.example.sfera.adapter.holders.ProfileItemViewHolder
import com.example.sfera.data.Account

class MainScreenAdapter: ListAdapter<Account, RecyclerView.ViewHolder>(
    ProfileListDiffCallBack()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View
        return when(viewType) {
            ITEM_TYPE_PROFILE -> {
                view = layoutInflater.inflate(R.layout.ff_main_item_profile, parent, false)
                ProfileItemViewHolder(view)
            }
            ITEM_TYPE_IMAGE -> {
                view = layoutInflater.inflate(R.layout.ff_main_item_image, parent, false)
                ImageItemViewHolder(view)
            }
            ITEM_TYPE_RATING -> {
                view = layoutInflater.inflate(R.layout.ff_main_item_rating, parent, false)
                ImageItemViewHolder(view)
            }
            ITEM_TYPE_TEXT -> {
                view = layoutInflater.inflate(R.layout.ff_main_item_text, parent, false)
                ImageItemViewHolder(view)
            }
            ITEM_TYPE_TEXT_LINES -> {
                view = layoutInflater.inflate(R.layout.ff_main_item_text_lines, parent, false)
                ImageItemViewHolder(view)
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileItemViewHolder -> holder.bind(getItem(position) as Account)
            is ImageItemViewHolder -> holder.bind(getItem(position) as Account)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position).id) {
            0 -> ITEM_TYPE_PROFILE
            1 -> ITEM_TYPE_IMAGE
            2 -> ITEM_TYPE_TEXT_LINES
            3 -> ITEM_TYPE_IMAGE
            4 -> ITEM_TYPE_TEXT
            5 -> ITEM_TYPE_IMAGE
            6 -> ITEM_TYPE_IMAGE
            7 -> ITEM_TYPE_RATING
            else -> throw IllegalArgumentException("Invalid item type")
        }
    }

    companion object {
        private const val ITEM_TYPE_PROFILE = 0
        private const val ITEM_TYPE_IMAGE = 1
        private const val ITEM_TYPE_RATING = 2
        private const val ITEM_TYPE_TEXT = 3
        private const val ITEM_TYPE_TEXT_LINES = 4

    }
}