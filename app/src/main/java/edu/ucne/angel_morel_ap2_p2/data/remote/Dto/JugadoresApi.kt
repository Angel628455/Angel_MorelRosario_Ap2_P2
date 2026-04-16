package edu.ucne.angel_morel_ap2_p2.data.remote.Dto

import retrofit2.Response
import retrofit2.http.*
interface JugadoresApi {

    @GET("api/Jugadores")
    suspend fun getJugadores(
        @Query("nombres") nombres: String?,
        @Query("email") email: String?,
    ): Response<JugadorResponseDto>

    @GET("api/Jugadores/{id}")
    suspend fun getJugadorDetail(
        @Path("id") id: Int
    ): Response<JugadorDto>

    @POST("api/Jugadores")
    suspend fun createJugador(
        @Body request: JugadoresRequest
    ): Response<JugadorResponse>

    @PUT("api/Jugadores/{id}")
    suspend fun updateJugador(
        @Path("id") id: Int,
        @Body request: JugadoresRequest
    ): Response<JugadorResponse>
}