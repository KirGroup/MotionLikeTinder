package com.example.sfera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.adapter.MainScreenAdapter
import com.example.sfera.data.Account
import com.example.sfera.data.DetailAccount
import com.example.sfera.databinding.FfMainFragmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FfMainFragmentBinding
    private lateinit var mainScreenAdapter: MainScreenAdapter
    private var index: Int = 0
    private val items = listOf(
        Account(0, R.drawable.image_profile, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, "Ivanova Olga", "Friendship is a special relationship between people. People need this relationship because they expect help and comfort from each other. Those who have friends have less stress and live longer. Friendship is usually based on common interests and mutual understanding, true encouragement and sympathy.\n" +
                "They say “Friendship isn’t a big thing, it’s a million little things” and I agree. To me it means that friendship isn't always about one big gesture of help. Instead, true friendship is about millions", "Russian, English","Belarus, Minsk", "Woman, men, groupe of people", "My name is Anna, I’m 28 years old. I was born and currently live in Irkutsk. I’m living with my long-term boyfriend and our cat Fluffy. I’m the head of marketing department in a local web development company. Me and my boyfriend love traveling around Russia, we’ve been to 20 cities so far. I’m an open and outgoing person, and my friends say I’m a good conversationalist. "),
        Account(1, R.drawable.image2, R.drawable.image_profile, R.drawable.image3, R.drawable.image4, R.drawable.image5, "Antonova Katya", "Friendship is a special relationship between people. People need this relationship because they expect help and comfort from each other. Those who have friends have less stress and live longer. Friendship is usually based on common interests and mutual understanding, true encouragement and sympathy.\n" +
                "They say “Friendship isn’t a big thing, it’s a million little things” and I agree. To me it means that friendship isn't always about one big gesture of help. Instead, true friendship is about millions", "Russian, English","Belarus, Minsk", "Woman, men, groupe of people", "My name is Anna, I’m 28 years old. I was born and currently live in Irkutsk. I’m living with my long-term boyfriend and our cat Fluffy. I’m the head of marketing department in a local web development company. Me and my boyfriend love traveling around Russia, we’ve been to 20 cities so far. I’m an open and outgoing person, and my friends say I’m a good conversationalist. "),
        Account(2, R.drawable.image3, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, "Ivanova Olga", "Friendship is a special relationship between people. People need this relationship because they expect help and comfort from each other. Those who have friends have less stress and live longer. Friendship is usually based on common interests and mutual understanding, true encouragement and sympathy.\n" +
                "They say “Friendship isn’t a big thing, it’s a million little things” and I agree. To me it means that friendship isn't always about one big gesture of help. Instead, true friendship is about millions", "Russian, English","Belarus, Minsk", "Woman, men, groupe of people", "My name is Anna, I’m 28 years old. I was born and currently live in Irkutsk. I’m living with my long-term boyfriend and our cat Fluffy. I’m the head of marketing department in a local web development company. Me and my boyfriend love traveling around Russia, we’ve been to 20 cities so far. I’m an open and outgoing person, and my friends say I’m a good conversationalist. "),
        Account(3, R.drawable.image3, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, "Ivanova Olga", "Friendship is a special relationship between people. People need this relationship because they expect help and comfort from each other. Those who have friends have less stress and live longer. Friendship is usually based on common interests and mutual understanding, true encouragement and sympathy.\n" +
        "They say “Friendship isn’t a big thing, it’s a million little things” and I agree. To me it means that friendship isn't always about one big gesture of help. Instead, true friendship is about millions", "Russian, English","Belarus, Minsk", "Woman, men, groupe of people", "My name is Anna, I’m 28 years old. I was born and currently live in Irkutsk. I’m living with my long-term boyfriend and our cat Fluffy. I’m the head of marketing department in a local web development company. Me and my boyfriend love traveling around Russia, we’ve been to 20 cities so far. I’m an open and outgoing person, and my friends say I’m a good conversationalist. "),
        Account(4, R.drawable.image3, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, "Ivanova Olga", "Friendship is a special relationship between people. People need this relationship because they expect help and comfort from each other. Those who have friends have less stress and live longer. Friendship is usually based on common interests and mutual understanding, true encouragement and sympathy.\n" +
                "They say “Friendship isn’t a big thing, it’s a million little things” and I agree. To me it means that friendship isn't always about one big gesture of help. Instead, true friendship is about millions", "Russian, English","Belarus, Minsk", "Woman, men, groupe of people", "My name is Anna, I’m 28 years old. I was born and currently live in Irkutsk. I’m living with my long-term boyfriend and our cat Fluffy. I’m the head of marketing department in a local web development company. Me and my boyfriend love traveling around Russia, we’ve been to 20 cities so far. I’m an open and outgoing person, and my friends say I’m a good conversationalist. "))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FfMainFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainScreenAdapter = MainScreenAdapter({
            Log.i("TAG", "profile $it like")
            index++
            mainScreenAdapter.detailAccount = DetailAccount(items[index], items[index + 1])
        },{
            Log.i("TAG", "profile $it pass")
            index++
            mainScreenAdapter.detailAccount = DetailAccount(items[index], items[index + 1])
        })

        val mainScreenRc: RecyclerView = binding.rcCardsFeedSfera
        mainScreenRc.adapter = mainScreenAdapter

        mainScreenAdapter.detailAccount = DetailAccount(items[index], items[index + 1])
    }
}