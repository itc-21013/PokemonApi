package jp.ac.it_college.std.s21013.pokemonapi.service

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PokemonInfo(
    val sprites: Sprites,
    val types: List<Type>,
    val species: NamedAPIResource,
    val weight: Int
)

@JsonClass(generateAdapter = true)
data class Sprites(
    val other: Other
)

@JsonClass(generateAdapter = true)
data class Other(
    @Json(name = "official-artwork") val officialArtwork: OfficialArtwork
)

@JsonClass(generateAdapter = true)
data class OfficialArtwork(
    @Json(name = "front_default") val frontDefault: String
)

@JsonClass(generateAdapter = true)
data class TypeInfo(
    val names: List<Name>
)

@JsonClass(generateAdapter = true)
data class Name(
    val name: String,
    val language: NamedAPIResource
)

@JsonClass(generateAdapter = true)
data class Type(
    val slot: Int,
    val type: NamedAPIResource
)

@JsonClass(generateAdapter = true)
data class SpeciesInfo(
    @Json(name = "flavor_text_entries") val flavorTexts: List<FlavorText>,
    val genera: List<Genus>
)

@JsonClass(generateAdapter = true)
data class FlavorText(
    @Json(name = "flavor_text") val flavorText: String,
    val language: NamedAPIResource
)

@JsonClass(generateAdapter = true)
data class Genus(
    val genus: String,
    val language: NamedAPIResource
)

@JsonClass(generateAdapter = true)
data class NamedAPIResource(
    val name: String,
    val url: String
)