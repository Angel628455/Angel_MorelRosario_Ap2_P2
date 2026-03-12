package edu.ucne.angel_morel_ap2_p2.presentation

sealed interface ListEvent {

    data class UpdateFilters(
        val name: String,
        val gender: String,
        val race: String
    ) : ListEvent

    data object Search : ListEvent
}