package com.caparepa.companionfou.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity

class ServantGridAdapter(
    private val context: Context,
    private val servantList: List<ServantEntity>,
    private val onClick: (ServantEntity) -> Unit = { _ -> }
) : RecyclerView.Adapter<ServantGridAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}