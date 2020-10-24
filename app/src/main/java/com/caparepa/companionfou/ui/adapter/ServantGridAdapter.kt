package com.caparepa.companionfou.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.utils.*

class ServantGridAdapter(
    private val context: Context,
    private val servantList: List<ServantEntity>,
    private val onClick: (ServantEntity) -> Unit = { _ -> }
) : RecyclerView.Adapter<ServantGridAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val flContainer: FrameLayout = itemView as FrameLayout
        val ivServantGraph = itemView.findViewById<ImageView>(R.id.ivServantGraphBackground)
        val ivClassIcon = itemView.findViewById<ImageView>(R.id.ivClassIcon)
        val ivRarityIcon = itemView.findViewById<ImageView>(R.id.ivRarityIcon)
        val tvServantName = itemView.findViewById<TextView>(R.id.tvServantName)

        fun bind(servantItem: ServantEntity, onClick: (ServantEntity) -> Unit) {

            val unknownServantDrawable =
                ContextCompat.getDrawable(context, R.drawable.listframe_bg_blank)
            val servantRarity = context.getRarityDrawable(servantItem.rarity!!)
            val servantClass =
                context.getClassDrawable(servantItem.className!!, servantItem.rarity!!)
            val servantGraph = servantItem.getExtraAssetsObj()?.faces?.ascension?.get(1)
            val servantName = servantItem.name

            tvServantName.text = servantName ?: servantItem.className.getPrettyClassName()
            ivServantGraph.loadImage(context, servantGraph!!, unknownServantDrawable!!)
            ivRarityIcon.setImageDrawable(servantRarity)
            ivClassIcon.setImageDrawable(servantClass)

            flContainer.setOneOffClickListener {
                onClick.invoke(servantItem)
            }
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