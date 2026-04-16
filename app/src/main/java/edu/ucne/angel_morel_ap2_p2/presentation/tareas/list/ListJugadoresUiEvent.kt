package edu.ucne.angel_morel_ap2_p2.presentation.tareas.list

sealed interface ListJugadoresUiEvent {
    data class UpdateFilterName(val nombres: String) : ListJugadoresUiEvent
    data object Search : ListJugadoresUiEvent
}