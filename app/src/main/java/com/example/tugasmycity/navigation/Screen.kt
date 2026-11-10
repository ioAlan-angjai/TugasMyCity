package com.example.tugasmycity.navigation

/**
 * Sealed class untuk mendefinisikan rute navigasi antar layar dalam aplikasi Jogja Guide.
 */
sealed class Screen(val route: String) {
    /** Rute layar daftar kategori wisata. */
    object CategoryList : Screen("category_list")

    /** Rute layar daftar tempat berdasarkan kategori. */
    object PlaceList : Screen("place_list/{categoryId}") {
        const val ARG_CATEGORY_ID = "categoryId"
        fun createRoute(categoryId: Int): String = "place_list/$categoryId"
    }

    /** Rute layar detail tempat wisata. */
    object PlaceDetail : Screen("place_detail/{placeId}") {
        const val ARG_PLACE_ID = "placeId"
        fun createRoute(placeId: Int): String = "place_detail/$placeId"
    }
}
