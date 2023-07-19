package com.example.ejercicio15

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio15.databinding.ItemBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    private val  pokemones = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
    val binding = ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int
    {
        return pokemones.size

    }
    class ViewHolder(itemBinding: ItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {

    }
}

