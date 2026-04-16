package edu.ucne.angel_morel_ap2_p2.data.remote.Dto



import edu.ucne.angel_morel_ap2_p2.domain.model.Jugadores

data class JugadorResponseDto(
    val items: List<JugadorDto>
)
data class JugadorDto(
    val id: Int,
    val nombres: String,
    val email: String,
) {
    fun toDomain() = Jugadores(
        id, nombres, email,
    )
}