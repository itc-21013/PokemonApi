package jp.ac.it_college.std.s21013.pokemonapi.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService {
    @GET("api/v2/pokemon/{id}")
    fun fetchPokemon(
        @Path("id") id: Int
    ): Call<PokemonInfo>

    @GET("api/v2/type/{id}/")
    fun fetchType(
        @Path("id") id: Int
    ): Call<TypeInfo>

    @GET("api/v2/pokemon-species/{id}/")
    fun fetchSpecies(
        @Path("id") id: Int
    ): Call<SpeciesInfo>
}