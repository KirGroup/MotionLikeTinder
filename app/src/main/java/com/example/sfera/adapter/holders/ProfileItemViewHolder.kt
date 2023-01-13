package com.example.sfera.adapter.holders

import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.data.Account
import com.example.sfera.data.DetailAccount
import com.example.sfera.databinding.FfMainItemProfileBinding
import com.example.sfera.databinding.FfMainItemTextBinding

class ProfileItemViewHolder(
    binding: FfMainItemProfileBinding,
    private val like: (Int) -> Unit,
    private val pass: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {


    val image = binding.firstAccountPhoto
    val name = binding.nameFriend
    val goals = binding.friendshipGoals

    val imageBottom = binding.bottomFirstAccountPhoto
    val nameBottom = binding.bottomNameFriend
    val goalsBottom = binding.bottomFriendshipGoals

    fun bind(detailAccount: DetailAccount) {

        image.setImageResource(detailAccount.imageProfile)
        name.text = detailAccount.name
        goals.text = detailAccount.goals

        imageBottom.setImageResource(detailAccount.imageProfile2)
        nameBottom.text = detailAccount.name2
        goalsBottom.text = detailAccount.goals2


    }
}