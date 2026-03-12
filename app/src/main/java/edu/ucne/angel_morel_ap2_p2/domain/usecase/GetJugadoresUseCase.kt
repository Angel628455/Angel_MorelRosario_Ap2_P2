package edu.ucne.angel_morel_ap2_p2.domain.usecase

import edu.ucne.angel_morel_ap2_p2.domain.repository.JugadoresRepository

class GetCharactersUseCase @Inject constructor(
    private val repository: JugadoresRepository
) {
    operator fun invoke(
        page: Int = 1,
        limit: Int = 10,
        name: String? = null,
        gender: String? = null,
        race: String? = null
    ) = repository.getJugadores(page, limit, name, gender, race)
}

