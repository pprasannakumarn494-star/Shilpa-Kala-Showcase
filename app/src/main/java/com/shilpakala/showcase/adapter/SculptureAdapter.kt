package com.shilpakala.showcase.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.shilpakala.showcase.data.Sculpture
import com.shilpakala.showcase.R

class SculptureAdapter(
    private var items: List<Sculpture>,
    private val onClick: (Sculpture) -> Unit
) : RecyclerView.Adapter<SculptureAdapter.ViewHolder>() {

    companion object {
        var SampleDataRef: List<Sculpture> = emptyList()
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.imgSculpture)
        val name: TextView = view.findViewById(R.id.tvName)
        val price: TextView = view.findViewById(R.id.tvPrice)
        val badge: TextView = view.findViewById(R.id.tvAvailable)
        val shilpi: TextView = view.findViewById(R.id.tvShilpi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_sculpture, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val s = items[position]
        holder.name.text = s.name
        holder.price.text = s.price
        holder.shilpi.text = s.shilpiName
        holder.badge.text = if (s.isAvailable) "Available" else "Sold"
        holder.badge.setBackgroundColor(
            if (s.isAvailable) Color.parseColor("#C8922A") else Color.parseColor("#888888")
        )
        Glide.with(holder.itemView.context)
            .load(s.imageUrls.firstOrNull())
            .apply(RequestOptions()
                .placeholder(R.drawable.placeholder_stone)
                .centerCrop())
            .into(holder.image)
        holder.itemView.setOnClickListener { onClick(s) }
    }

    override fun getItemCount() = items.size

    fun filter(style: String) {
        items = if (style == "All") SampleDataRef
        else SampleDataRef.filter { it.style == style }
        notifyDataSetChanged()
    }

    private fun getDrawableRes(context: Context, name: String?): Int {
        if (name == null) return android.R.drawable.ic_menu_gallery
        val cleanName = name.removePrefix("res_")
        val id = context.resources.getIdentifier(cleanName, "drawable", context.packageName)
        return if (id != 0) id else android.R.drawable.ic_menu_gallery
    }
}