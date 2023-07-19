package com.example.ejercicio15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio15.databinding.ActivityMainBinding
import com.example.ejercicio15.databinding.ItemBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

    private fun initAdapter() {
        var adapter = Adapter()
        var pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.recyclerView.adapter = adapter

    }
}