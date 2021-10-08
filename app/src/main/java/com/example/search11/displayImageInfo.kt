package com.example.search11

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.search11.databinding.FragmentDisplayImageInfoBinding
import com.example.search11.databinding.FragmentMainBinding


class displayImageInfo : Fragment() {
   private lateinit var binding:FragmentDisplayImageInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDisplayImageInfoBinding.inflate(inflater, container, false)
        val position =arguments?.getInt("position")
        if (position != null) {
            display(position)
        }
        return binding.root
    }
    fun display(position:Int){
        Log.d("position", "$position")
        val infoList:List<imageInfo>  = listOf(
            imageInfo(R.mipmap.blashful, "Blashful", "this dwarf is called Blashful"),
            imageInfo(R.mipmap.doc, "Doc", "this dwarf is called Doc"),
            imageInfo(R.mipmap.dopey, "Dopey", "this dwarf is called Dopey"),
            imageInfo(R.mipmap.sleepy, "Sleepy", "this dwarf is called Sleepy"),
            imageInfo(R.mipmap.sneezy, "Sneezy", "this dwarf is called Sneezy"),
            imageInfo(R.mipmap.happy, "Happy", "this dwarf is called Happy"),
            imageInfo(R.mipmap.grumpy, "Grumpy", "this dwarf is called Grumpy")
        )
        binding.ivImage.setImageResource(infoList[position].image)
        binding.tvTitle.text = infoList[position].title
        binding.tvDescription.text = infoList[position].description
    }


}