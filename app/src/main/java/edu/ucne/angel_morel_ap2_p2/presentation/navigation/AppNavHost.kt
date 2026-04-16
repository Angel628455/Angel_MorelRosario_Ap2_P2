package edu.ucne.angel_morel_ap2_p2.presentation.navigation
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.graphics.BlendMode.Companion.Screen
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//
//@Composable
//fun AppNavHost(
//    navHostController: NavHostController
//) {
//    NavHost(
//        navController = navHostController,
//        startDestination = Screen.JugadoresList
//    ) {
//        composable<Screen.JugadorList> {
//            ListJugadoresScreen(
//                onJugadorClick = { Id ->
//                    navHostController.navigate(Screen.JugadoresDetail(Id))
//                }
//            )
//        }
//
//        composable<Screen.JugadorDetail> {
//            DetailJugadoresScreen(
//                onBack = {
//                    navHostController.navigateUp()
//                }
//            )
//        }
//    }
//}