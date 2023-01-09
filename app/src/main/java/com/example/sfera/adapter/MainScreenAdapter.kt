package com.example.sfera.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.data.Account
import com.example.sfera.databinding.FfMainCardProfileBinding

class MainScreenAdapter: ListAdapter<Account, MainScreenAdapter.CardImageItemHolder>(
    ProfileListDiffCallBack()
){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardImageItemHolder {
            return CardImageItemHolder(FfMainCardProfileBinding.inflate(LayoutInflater.from(parent.context)))
        }

        override fun onBindViewHolder(holder: CardImageItemHolder, position: Int) {
//        holder.itemImage.setImageResource(R.drawable.first_item)
        }

        class CardImageItemHolder(binding: FfMainCardProfileBinding): RecyclerView.ViewHolder(binding.root){
//        val itemImage: ImageView = binding.firstItemImage
        }

        override fun getItemCount(): Int {
            return 4
        }
    }