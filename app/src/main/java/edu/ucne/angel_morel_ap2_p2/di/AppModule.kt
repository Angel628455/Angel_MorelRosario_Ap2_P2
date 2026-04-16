package edu.ucne.angel_morel_ap2_p2.di

//import com.google.android.datatransport.runtime.dagger.Module
//import com.google.android.datatransport.runtime.dagger.Provides
//import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.ucne.angel_morel_ap2_p2.data.remote.Dto.JugadorRemoteDataSource
import edu.ucne.angel_morel_ap2_p2.data.remote.Dto.JugadoresApi
import edu.ucne.angel_morel_ap2_p2.domain.model.Jugadores
import edu.ucne.angel_morel_ap2_p2.domain.repository.JugadoresRepository
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton
import kotlin.jvm.java
import kotlin.jvm.java as java

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(moshi: Moshi): JugadoresApi {
        return Retrofit.Builder()
            .baseUrl("https://gestionhuacalesapi.azurewebsites.net/swagger/index.html")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(JugadoresApi::class.java)
    }

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi
            .Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

//    @Provides
//    @Singleton
//    fun provideJugadoresRepository(remoteDataSource: JugadorRemoteDataSource): JugadoresRepository{
//        return Jugadores(remoteDataSource)
//    }
}