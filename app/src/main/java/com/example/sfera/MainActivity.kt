package com.example.sfera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.adapter.MainScreenAdapter
import com.example.sfera.data.Account
import com.example.sfera.databinding.FfMainFragmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: FfMainFragmentBinding
    private lateinit var mainScreenAdapter: MainScreenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FfMainFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainScreenAdapter = MainScreenAdapter()
        val mainScreenRc: RecyclerView = binding.rcCardsFeedSfera
        mainScreenRc.adapter = mainScreenAdapter

        val items = listOf(
            Account(0),
            Account(1),
            Account(2),
            Account(3),
            Account(4),
            Account(5),
            Account(6),
            Account(7)
        )
        mainScreenAdapter.submitList(items)
    }
}