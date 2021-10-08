package com.example.search11

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView

class adapter(private val dwarfsImageList: List<Int>, private val move: (position:Int)->Unit):RecyclerView.Adapter<adapter.itemHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_list_item, parent, false)
        return itemHolder(itemView, move)
    }

    override fun onBindViewHolder(holder: itemHolder, position: Int) {
        val image = holder.image
        image.setImageResource(dwarfsImageList[position])
        image.setOnClickListener { move(holder.adapterPosition) }


    }

    override fun getItemCount() = dwarfsImageList.size

    inner class itemHolder(itemView: View, private val move: (position:Int)->Unit):RecyclerView.ViewHolder(itemView){
         val image = itemView.findViewById<ImageView>(R.id.iv_rvImage)

    }
    init{

    }

}