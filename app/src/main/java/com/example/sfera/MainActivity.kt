package com.example.sfera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.sfera.adapter.MainScreenAdapter
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
    }
}