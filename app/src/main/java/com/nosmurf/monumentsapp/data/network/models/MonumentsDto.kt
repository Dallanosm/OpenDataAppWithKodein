package com.nosmurf.monumentsapp.data.network.models


data class MonumentsDto(
        val head: HeadDto,
        val results: ResultsDto
)

data class ResultsDto(
        val distinct: Boolean, //false
        val ordered: Boolean, //true
        val bindings: List<MonumentDto>
)

data class MonumentDto(
        val lng: LngDto,
        val lat: LatDto,
        val om_tipoMonumento: OmTipoMonumentoDto,
        val name: NameDto,
        val om_tieneEnlaceSIG: OmTieneEnlaceSIGDto
)

data class OmTieneEnlaceSIGDto(
        val type: String, //uri
        val value: String //http://sig.caceres.es/serweb/fichasig/fichatoponimia.php?mslink=1163
)

data class OmTipoMonumentoDto(
        val type: String, //literal
        val value: String //Concatedral
)

data class NameDto(
        val type: String, //literal
        val value: String //Concatedral de Santa Maria
)

data class LngDto(
        val type: String, //typed-literal
        val datatype: String, //http://www.w3.org/2001/XMLSchema#decimal
        val value: String //-6.37004029561
)

data class LatDto(
        val type: String, //typed-literal
        val datatype: String, //http://www.w3.org/2001/XMLSchema#decimal
        val value: String //39.4745659792
)

data class HeadDto(
        val link: List<Any>,
        val vars: List<String>
)