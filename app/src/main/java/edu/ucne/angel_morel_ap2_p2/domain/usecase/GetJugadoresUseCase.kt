package edu.ucne.angel_morel_ap2_p2.domain.usecase

import edu.ucne.angel_morel_ap2_p2.domain.repository.JugadoresRepository
import javax.inject.Inject

class GetJugadoresUseCase @Inject constructor(
    private val repository: JugadoresRepository
) {
    suspend operator fun invoke(
        nombres: String? = null,
        email: String? = null
    ) = repository.getJugadores(nombres, email)
}