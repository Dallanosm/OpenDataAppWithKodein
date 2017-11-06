package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import rx.Single

interface NetworkRepository {

    fun getMonuments(): Single<MonumentsDto>

}