package com.caparepa.companionfou.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity

class ServantGridAdapter(
    private val context: Context,
    private val servantList: List<ServantEntity>,
    private val onClick: (ServantEntity) -> Unit = { _ -> }
) : RecyclerView.Adapter<ServantGridAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val servantGraph = itemView.findViewById<ImageView>(R.id.ivServantGraphBackground)
        val classIcon = itemView.findViewById<ImageView>(R.id.ivClassIcon)
        val rarityIcon = itemView.findViewById<ImageView>(R.id.ivRarityIcon)
        val servantName = itemView.findViewById<TextView>(R.id.tvServantName)

        fun bind(servantItem: ServantEntity, onClick: (ServantEntity) -> Unit) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val servantItemView = inflater.inflate(R.layout.item_servant_grid, parent, false)
        return ViewHolder(servantItemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val servant: ServantEntity = servantList[position]
        holder.bind(servant, onClick)
    }

    override fun getItemCount(): Int {
        return servantList.size
    }
}