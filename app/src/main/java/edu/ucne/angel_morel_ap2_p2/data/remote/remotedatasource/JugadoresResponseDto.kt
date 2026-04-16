package edu.ucne.angel_morel_ap2_p2.data.remote.remotedatasource

//import edu.ucne.angel_morel_ap2_p2.domain.model.JugadoresCharacter

data class JugadoresResponseDto(
    val items: List<JugadoresResponseDto>
)

data class CharacterDto(
    val id: Int,
    val name: String,
    val ki: String,
    val race: String,
    val gender: String,
    val description: String,
    val image: String,
    val maxKi: String,
) {
//    fun toDomain() = JugadoresCharacter(
//        id, name, ki, race, gender, description, image, maxKi,
//    )
}