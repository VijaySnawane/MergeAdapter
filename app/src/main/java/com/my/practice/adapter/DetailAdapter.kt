package com.my.practice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.practice.R
import com.my.practice.model.Detail
import kotlinx.android.synthetic.main.details_layout.view.*

class DetailAdapter(
    private val myDetail: Detail
) : RecyclerView.Adapter<DetailAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: Detail) {

            itemView.textViewUser.text = user.name
            itemView.textViewAboutMe.text = user.aboutMe
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.details_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(myDetail)

}