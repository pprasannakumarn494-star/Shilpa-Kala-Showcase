package com.shilpakala.showcase

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.shilpakala.showcase.adapter.SculptureAdapter
import com.shilpakala.showcase.data.SampleData
import com.shilpakala.showcase.ui.DetailActivity

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: SculptureAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sculptures = SampleData.getSculptures()
        SculptureAdapter.SampleDataRef = sculptures

        adapter = SculptureAdapter(sculptures) { sculpture ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("sculpture_id", sculpture.id)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter

        // Filter chips
        val styles = listOf("All", "Hoysala", "Dravidian", "Vijayanagara", "Chalukya")
        val chipGroup = findViewById<ChipGroup>(R.id.chipGroup)

        styles.forEach { style ->
            val chip = Chip(this).apply {
                text = style
                isCheckable = true
                setChipBackgroundColorResource(android.R.color.white)
                setTextColor(resources.getColor(R.color.stone_black, theme))
                isChecked = style == "All"
            }
            chip.setOnClickListener { adapter.filter(style) }
            chipGroup.addView(chip)
        }
    }
}