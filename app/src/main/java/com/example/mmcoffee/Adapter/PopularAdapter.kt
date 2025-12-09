package com.example.mmcoffee.Adapter

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mmcoffee.Domain.ItemsModel
import com.example.mmcoffee.R
import com.example.mmcoffee.databinding.ViewholderPopularBinding

class PopularAdapter(val items: MutableList<ItemsModel>):
    RecyclerView.Adapter<PopularAdapter.Viewholder>() {

    lateinit var context: Context

    class Viewholder(val binding: ViewholderPopularBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder (
        parent: ViewGroup,
        viewType: Int
    ): PopularAdapter.Viewholder {
        context = parent.context
        val binding = ViewholderPopularBinding.inflate(LayoutInflater.from(context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: PopularAdapter.Viewholder, position: Int) {
        holder.binding.titleTxt.text = items[position].title
        holder.binding.priceTxt.text = "R"+items[position].price.toString()
        holder.binding.subtitleTxt.text = items[position].extra.toString()


        Glide.with(context)
            .load(items[position].picUrl[0])
            .into(holder.binding.pic)

        holder.binding.imageView6.setOnClickListener {

        }
    }

    override fun getItemCount(): Int= items.size
}