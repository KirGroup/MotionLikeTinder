package com.example.sfera.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.adapter.holders.*
import com.example.sfera.data.DetailAccount
import com.example.sfera.databinding.FfMainItemImageBinding
import com.example.sfera.databinding.FfMainItemProfileBinding
import com.example.sfera.databinding.FfMainItemRatingBinding
import com.example.sfera.databinding.FfMainItemTextBinding
import com.example.sfera.databinding.FfMainItemTextLinesBinding

class MainScreenAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var detailAccount: DetailAccount? = null
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ITEM_TYPE_PROFILE -> {
                ProfileItemViewHolder(FfMainItemProfileBinding.inflate(layoutInflater))
            }
            ITEM_TYPE_IMAGE -> {
                ImageItemViewHolder(FfMainItemImageBinding.inflate(layoutInflater))
            }
            ITEM_TYPE_RATING -> {
                RatingItemViewHolder(FfMainItemRatingBinding.inflate(layoutInflater))
            }
            ITEM_TYPE_TEXT -> {
                TextItemViewHolder(FfMainItemTextBinding.inflate(layoutInflater))
            }
            ITEM_TYPE_TEXT_LINES -> {
                TextLinesItemViewHolder(FfMainItemTextLinesBinding.inflate(layoutInflater))
            }
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileItemViewHolder -> holder.bind(detailAccount!!)
            is ImageItemViewHolder -> holder.bind(detailAccount!!)
            is RatingItemViewHolder -> holder.bind(detailAccount!!)
            is TextItemViewHolder -> holder.bind(detailAccount!!)
            is TextLinesItemViewHolder -> holder.bind(detailAccount!!)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
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

    override fun getItemCount(): Int {
        return if (detailAccount == null) 0 else 8
    }
}