package com.my.practice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.my.practice.R
import com.my.practice.model.ImageS
import kotlinx.android.synthetic.main.image_layout.view.*

class ImageAdapter(private val banner: ImageS) : RecyclerView.Adapter<ImageAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: ImageS) {
            Glide.with(itemView.imageViewBanner.context)
                .load(banner.bannerImage)
                .into(itemView.imageViewBanner)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.image_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(banner)

}