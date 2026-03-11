package edu.ucne.angel_morel_ap2_p2.domain.model

data class JugadoresCharacter(
    val id: Int,
    val name: String,
    val ki: String,
    val race: String,
    val gender: String,
    val description: String,
    val image: String,
    val maxKi: String
)