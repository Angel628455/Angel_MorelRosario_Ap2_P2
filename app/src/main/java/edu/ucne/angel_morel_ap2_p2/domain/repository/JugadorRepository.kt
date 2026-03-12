package edu.ucne.angel_morel_ap2_p2.domain.repository

import edu.ucne.angel_morel_ap2_p2.data.remote.remotedatasource.Resource
import edu.ucne.angel_morel_ap2_p2.domain.model.JugadoresCharacter

interface JugadoresRepository {
    class GetJugadores(page: Int, limit: Int, name: String?, gender: String?, race: String?) {

    }

    suspend fun getCharacters(
        page: Int,
        limit: Int,
        name: String?,
        gender: String?,
        race: String?,
    ): Resource<List<JugadoresCharacter>>

    suspend fun getJugadoresDetail(id: Int): Resource<JugadoresCharacter>
}