package com.nosmurf.monumentsapp.data.network.mappers

import com.nosmurf.monumentsapp.data.network.models.MonumentDto
import com.nosmurf.monumentsapp.domain.models.Monument
import java.net.URI

fun dataToModel(data: MonumentDto): Monument =
        Monument(data.nameDto.value,
                data.latDto.value.toDouble(),
                data.lngDto.value.toDouble(),
                data.om_tipoMonumentoDto.value,
                URI(data.om_tieneEnlaceSIGDto.value))

fun modelToData(model: Monument): MonumentDto = TODO("not implemented")