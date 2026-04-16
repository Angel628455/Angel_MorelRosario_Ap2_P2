package edu.ucne.angel_morel_ap2_p2.presentation.tareas.list

import edu.ucne.angel_morel_ap2_p2.domain.model.Jugadores

data class ListJugadoresUiState(
    val isLoading: Boolean = false,
    val jugadores: List<Jugadores> = emptyList(),
    val error: String? = null,
    val filterName: String = ""
)