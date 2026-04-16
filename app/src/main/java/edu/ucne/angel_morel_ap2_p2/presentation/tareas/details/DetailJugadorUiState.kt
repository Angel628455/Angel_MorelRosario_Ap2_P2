package edu.ucne.angel_morel_ap2_p2.presentation.tareas.details

import edu.ucne.angel_morel_ap2_p2.domain.model.Jugadores

data class DetailJugadoresUiState(
    val isLoading: Boolean = false,
    val jugador: Jugadores? = null,
    val error: String? = null
)