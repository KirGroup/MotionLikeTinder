package com.example.sfera.adapter.holders

import android.util.Log
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.R
import com.example.sfera.data.DetailAccount
import com.example.sfera.databinding.FfMainItemProfileBinding

class ProfileItemViewHolder(
    binding: FfMainItemProfileBinding,

) : RecyclerView.ViewHolder(binding.root) {

//    private val motionLayout = binding.root
//    private val image = binding.firstAccountPhoto
//    private val name = binding.nameFriend
//    private val goals = binding.friendshipGoals
//
//    private val imageBottom = binding.bottomFirstAccountPhoto
//    private val nameBottom = binding.bottomNameFriend
//    private val goalsBottom = binding.bottomFriendshipGoals
//
    fun bind(detailAccount: DetailAccount) {
//
//        image.setImageResource(detailAccount.imageProfile)
//        name.text = detailAccount.name
//        goals.text = detailAccount.goals
//
//        imageBottom.setImageResource(detailAccount.imageProfile2)
//        nameBottom.text = detailAccount.name2
//        goalsBottom.text = detailAccount.goals2
//
//        motionLayout.setTransitionListener(object : TransitionAdapter() {
//            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
//                when (currentId) {
//                    R.id.pass -> {
//                        pass.invoke(detailAccount.id)
////                        motionLayout.progress = 0f
////                        motionLayout.setTransition(R.id.rest, R.id.pass)
//                    }
//                    R.id.like -> {
//                        like.invoke(detailAccount.id)
//
//                    }
//                }
//            }
//        })
    }
}