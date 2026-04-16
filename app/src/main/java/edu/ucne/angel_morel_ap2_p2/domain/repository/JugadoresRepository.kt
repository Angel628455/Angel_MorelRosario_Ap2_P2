package edu.ucne.angel_morel_ap2_p2.domain.repository

import edu.ucne.angel_morel_ap2_p2.data.remote.remotedatasource.Resource
import edu.ucne.angel_morel_ap2_p2.domain.model.Jugadores

interface JugadoresRepository {
    suspend fun getJugadores(
        nombres: String?,
        email: String?
    ): Resource<List<Jugadores>>

    suspend fun getJugadoresDetail(id: Int): Resource<Jugadores>
}