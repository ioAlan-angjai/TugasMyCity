package com.example.tugasmycity.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasmycity.ui.CategoryListScreen
import com.example.tugasmycity.ui.PlaceDetailScreen
import com.example.tugasmycity.ui.PlaceListScreen

/**
 * Komponen utama graf navigasi aplikasi Jogja Guide,
 * mengatur NavController, NavHost, dan animasi transisi antar layar.
 */
@Composable
fun JogjaGuideApp() {
    val navController = rememberNavController()

    val enterAnim = { slideInHorizontally(initialOffsetX = { fullWidth -> fullWidth }, animationSpec = tween(300)) + fadeIn(animationSpec = tween(300)) }
    val exitAnim = { slideOutHorizontally(targetOffsetX = { fullWidth -> -fullWidth }, animationSpec = tween(300)) + fadeOut(animationSpec = tween(300)) }
    val popEnterAnim = { slideInHorizontally(initialOffsetX = { fullWidth -> -fullWidth }, animationSpec = tween(300)) + fadeIn(animationSpec = tween(300)) }
    val popExitAnim = { slideOutHorizontally(targetOffsetX = { fullWidth -> fullWidth }, animationSpec = tween(300)) + fadeOut(animationSpec = tween(300)) }

    NavHost(
        navController = navController,
        startDestination = Screen.CategoryList.route,
        enterTransition = { enterAnim() },
        exitTransition = { exitAnim() },
        popEnterTransition = { popEnterAnim() },
        popExitTransition = { popExitAnim() }
    ) {
        composable(
            route = Screen.CategoryList.route,
            enterTransition = { enterAnim() },
            exitTransition = { exitAnim() },
            popEnterTransition = { popEnterAnim() },
            popExitTransition = { popExitAnim() }
        ) {
            CategoryListScreen(
                onCategoryClick = { categoryId ->
                    navController.navigate(Screen.PlaceList.createRoute(categoryId))
                }
            )
        }

        composable(
            route = Screen.PlaceList.route,
            arguments = listOf(
                navArgument(Screen.PlaceList.ARG_CATEGORY_ID) {
                    type = NavType.IntType
                }
            ),
            enterTransition = { enterAnim() },
            exitTransition = { exitAnim() },
            popEnterTransition = { popEnterAnim() },
            popExitTransition = { popExitAnim() }
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getInt(Screen.PlaceList.ARG_CATEGORY_ID) ?: 1
            PlaceListScreen(
                categoryId = categoryId,
                onPlaceClick = { placeId ->
                    navController.navigate(Screen.PlaceDetail.createRoute(placeId))
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }

        composable(
            route = Screen.PlaceDetail.route,
            arguments = listOf(
                navArgument(Screen.PlaceDetail.ARG_PLACE_ID) {
                    type = NavType.IntType
                }
            ),
            enterTransition = { enterAnim() },
            exitTransition = { exitAnim() },
            popEnterTransition = { popEnterAnim() },
            popExitTransition = { popExitAnim() }
        ) { backStackEntry ->
            val placeId = backStackEntry.arguments?.getInt(Screen.PlaceDetail.ARG_PLACE_ID) ?: 1
            PlaceDetailScreen(
                placeId = placeId,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
