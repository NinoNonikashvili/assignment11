package com.example.search11

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.search11.databinding.FragmentMainBinding



class mainFragment : Fragment() {
    private lateinit var binding:FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dwarfsList:List<Int> = listOf(
            R.mipmap.blashful,
            R.mipmap.doc,
            R.mipmap.dopey,
            R.mipmap.sleepy,
            R.mipmap.sneezy,
            R.mipmap.happy,
            R.mipmap.grumpy
        )
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.rvDwarfsWrapper.adapter = adapter(dwarfsList, {position ->moveToDisplay(position)})
        binding.rvDwarfsWrapper.layoutManager = GridLayoutManager(activity, 2)
        return binding.root
    }

    fun moveToDisplay(position:Int){
        val bundle = bundleOf("positon" to position)
        findNavController().navigate(R.id.action_mainFragment_to_displayImageInfo, bundle)

    }

}