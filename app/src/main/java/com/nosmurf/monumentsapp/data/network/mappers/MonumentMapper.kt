package com.nosmurf.monumentsapp.data.network.mappers

import com.nosmurf.monumentsapp.data.network.models.MonumentDto
import com.nosmurf.monumentsapp.domain.models.Monument
import java.net.URI

fun dataToModel(data: MonumentDto): Monument =
        Monument(data.name.value,
                data.lat.value.toDouble(),
                data.lng.value.toDouble(),
                data.om_tipoMonumento.value,
                URI(data.om_tieneEnlaceSIG.value))

fun modelToData(model: Monument): MonumentDto = TODO("not implemented")