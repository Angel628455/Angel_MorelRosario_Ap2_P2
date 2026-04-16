package edu.ucne.angel_morel_ap2_p2.domain.usecase

import edu.ucne.angel_morel_ap2_p2.domain.repository.JugadoresRepository

import javax.inject.Inject

class GetJugadorDetailUseCase @Inject constructor(
    private val repository: JugadoresRepository
) {
    suspend operator fun invoke(id: Int) = repository.getJugadoresDetail(id)
}
