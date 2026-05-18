package com.shilpakala.showcase.data

data class Sculpture(
    val id: String,
    val name: String,
    val shilpiName: String,
    val style: String,
    val material: String,
    val price: String,
    val imageUrls: List<String>,
    val timelineImages: List<String>,
    val description: String,
    val isAvailable: Boolean
)