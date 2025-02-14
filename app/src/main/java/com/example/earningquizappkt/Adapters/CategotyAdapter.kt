package com.example.earningquizappkt.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.earningquizappkt.Models.CategoryModel
import com.example.earningquizappkt.databinding.CategoryItemBinding

class CategotyAdapter (var categoryList:ArrayList<CategoryModel>) : RecyclerView.Adapter<CategotyAdapter.MyCategoryViewHolder>() {

    class MyCategoryViewHolder(var categoryItemBinding: CategoryItemBinding) : RecyclerView.ViewHolder(categoryItemBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCategoryViewHolder {
        return MyCategoryViewHolder(CategoryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = categoryList.size

    override fun onBindViewHolder(holder: MyCategoryViewHolder, position: Int) {
        var dataList = categoryList[position]
        holder.categoryItemBinding.categoryImg.setImageResource(dataList.catImage)
        holder.categoryItemBinding.categoryRecyclerTv.text = dataList.catText
    }
}