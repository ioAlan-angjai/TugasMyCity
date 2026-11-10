package com.example.tugasmycity.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Merepresentasikan kategori wisata utama di Yogyakarta.
 */
data class Category(
    val id: Int,
    val name: String,
    val description: String,
    val icon: ImageVector,
    @get:DrawableRes val imageRes: Int
)

/**
 * Merepresentasikan detail destinasi tempat wisata di Yogyakarta.
 */
data class Place(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val shortInfo: String,
    val description: String,
    val area: String,
    val address: String,
    val rating: Double,
    val reviewCount: Int,
    val openHours: String,
    val ticketPrice: String,
    val tags: List<String>,
    val tips: List<String>,
    @get:DrawableRes val imageRes: Int
)
