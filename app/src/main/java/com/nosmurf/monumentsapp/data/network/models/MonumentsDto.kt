package com.nosmurf.monumentsapp.data.network.models


data class MonumentsDto(
        val head: Head,
        val results: Results
)

data class Results(
        val distinct: Boolean, //false
        val ordered: Boolean, //true
        val bindings: List<Binding>
)

data class Binding(
        val lng: Lng,
        val lat: Lat,
        val om_tipoMonumento: OmTipoMonumento,
        val name: Name,
        val om_tieneEnlaceSIG: OmTieneEnlaceSIG
)

data class OmTieneEnlaceSIG(
        val type: String, //uri
        val value: String //http://sig.caceres.es/serweb/fichasig/fichatoponimia.php?mslink=1163
)

data class OmTipoMonumento(
        val type: String, //literal
        val value: String //Concatedral
)

data class Name(
        val type: String, //literal
        val value: String //Concatedral de Santa Maria
)

data class Lng(
        val type: String, //typed-literal
        val datatype: String, //http://www.w3.org/2001/XMLSchema#decimal
        val value: String //-6.37004029561
)

data class Lat(
        val type: String, //typed-literal
        val datatype: String, //http://www.w3.org/2001/XMLSchema#decimal
        val value: String //39.4745659792
)

data class Head(
        val link: List<Any>,
        val vars: List<String>
)