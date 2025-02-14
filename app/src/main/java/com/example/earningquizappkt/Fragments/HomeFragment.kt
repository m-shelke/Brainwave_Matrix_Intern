package com.example.earningquizappkt.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.earningquizappkt.Adapters.CategotyAdapter
import com.example.earningquizappkt.Models.CategoryModel
import com.example.earningquizappkt.R
import com.example.earningquizappkt.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    private var categoryList = ArrayList<CategoryModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryList.add(CategoryModel(R.drawable.user,"Users"))
        categoryList.add(CategoryModel(R.drawable.user,"Users"))
        categoryList.add(CategoryModel(R.drawable.user,"Users"))
        categoryList.add(CategoryModel(R.drawable.user,"Users"))
        categoryList.add(CategoryModel(R.drawable.user,"Users"))
        categoryList.add(CategoryModel(R.drawable.user,"Users"))

        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        var adapter = CategotyAdapter(categoryList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }

    companion object {

    }
}