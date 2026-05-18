package com.shilpakala.showcase.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.github.chrisbanes.photoview.PhotoView

class ZoomImageAdapter(private val urls: List<String>) :
    RecyclerView.Adapter<ZoomImageAdapter.ImageVH>() {

    inner class ImageVH(val photoView: PhotoView) : RecyclerView.ViewHolder(photoView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageVH {
        val photoView = PhotoView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
        return ImageVH(photoView)
    }

    override fun onBindViewHolder(holder: ImageVH, position: Int) {
        Glide.with(holder.photoView.context)
            .load(urls[position])
            .placeholder(android.R.drawable.ic_menu_gallery)
            .into(holder.photoView)
    }

    override fun getItemCount() = urls.size

    private fun getDrawableRes(context: Context, name: String): Int {
        val cleanName = name.removePrefix("res_")
        val id = context.resources.getIdentifier(cleanName, "drawable", context.packageName)
        return if (id != 0) id else android.R.drawable.ic_menu_gallery
    }
}