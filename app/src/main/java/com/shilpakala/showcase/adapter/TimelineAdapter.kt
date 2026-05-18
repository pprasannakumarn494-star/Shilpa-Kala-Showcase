package com.shilpakala.showcase.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TimelineAdapter(private val urls: List<String>) :
    RecyclerView.Adapter<TimelineAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(com.shilpakala.showcase.R.id.imgTimeline)
        val step: TextView = view.findViewById(com.shilpakala.showcase.R.id.tvStep)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(LayoutInflater.from(parent.context)
            .inflate(com.shilpakala.showcase.R.layout.item_timeline, parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.step.text = "Stage ${position + 1}"
        Glide.with(holder.image.context)
            .load(urls[position])
            .apply(RequestOptions()
                .placeholder(android.R.drawable.ic_menu_gallery)
                .centerCrop())
            .into(holder.image)
    }

    override fun getItemCount() = urls.size

    private fun getDrawableRes(context: Context, name: String): Int {
        val cleanName = name.removePrefix("res_")
        val id = context.resources.getIdentifier(cleanName, "drawable", context.packageName)
        return if (id != 0) id else android.R.drawable.ic_menu_gallery
    }
}