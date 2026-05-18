package com.shilpakala.showcase.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.shilpakala.showcase.R
import com.shilpakala.showcase.adapter.TimelineAdapter
import com.shilpakala.showcase.adapter.ZoomImageAdapter
import com.shilpakala.showcase.data.SampleData

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getStringExtra("sculpture_id")
        val sculpture = SampleData.getSculptures().find { it.id == id } ?: return

        // Back button
        findViewById<TextView>(R.id.btnBack).setOnClickListener { finish() }

        // Bind text views
        findViewById<TextView>(R.id.tvProductId).text = "Product ID: ${sculpture.id}"
        findViewById<TextView>(R.id.tvStyle).text = sculpture.style
        findViewById<TextView>(R.id.tvName).text = sculpture.name
        findViewById<TextView>(R.id.tvPrice).text = sculpture.price
        findViewById<TextView>(R.id.tvMaterial).text = sculpture.material
        findViewById<TextView>(R.id.tvShilpi).text = "✦ By ${sculpture.shilpiName}"
        findViewById<TextView>(R.id.tvDescription).text = sculpture.description
        findViewById<TextView>(R.id.tvHeritage).text = SampleData.getHeritageText(sculpture.style)

        // ViewPager2 with zoom
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        viewPager.adapter = ZoomImageAdapter(sculpture.imageUrls)

        // Dot indicators
        setupDots(sculpture.imageUrls.size, viewPager)

        // Timeline
        val rvTimeline = findViewById<RecyclerView>(R.id.rvTimeline)
        rvTimeline.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvTimeline.adapter = TimelineAdapter(sculpture.timelineImages)

        // WhatsApp button
        findViewById<Button>(R.id.btnInquire).setOnClickListener {
            val message = """
                🙏 Namaste! I found your work on Shilpa-Kala Showcase.
                
                I am interested in:
                🏛 *${sculpture.name}*
                🆔 Product ID: *${sculpture.id}*
                🪨 Material: ${sculpture.material}
                🎨 Style: ${sculpture.style}
                💰 Price: ${sculpture.price}
                
                Please share availability and delivery details. Thank you! 🙏
            """.trimIndent()

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://wa.me/?text=${Uri.encode(message)}"))
            startActivity(intent)
        }

        // Share button
        findViewById<Button>(R.id.btnShare).setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT,
                    "Check out '${sculpture.name}' by ${sculpture.shilpiName} " +
                            "on Shilpa-Kala Showcase! Product: ${sculpture.id}")
            }
            startActivity(Intent.createChooser(shareIntent, "Share Artwork"))
        }
    }

    private fun setupDots(count: Int, viewPager: ViewPager2) {
        val dotsLayout = findViewById<LinearLayout>(R.id.dotsLayout)
        val dots = Array(count) { TextView(this).apply { text = "●"; textSize = 10f; setPadding(4, 0, 4, 0) } }
        dots.forEach { dotsLayout.addView(it) }

        fun updateDots(pos: Int) = dots.forEachIndexed { i, dot ->
            dot.setTextColor(if (i == pos) 0xFFC8922A.toInt() else 0xFFCCCCCC.toInt())
        }
        updateDots(0)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) = updateDots(position)
        })
    }
}