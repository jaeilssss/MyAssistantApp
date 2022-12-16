package com.example.myassistantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myassistantapp.databinding.DataItemBinding

class adapter () : RecyclerView.Adapter<adapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {


        return viewHolder(DataItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

        return 20
    }



    inner class viewHolder(binding : DataItemBinding) : RecyclerView.ViewHolder(binding.root) {


    }

}