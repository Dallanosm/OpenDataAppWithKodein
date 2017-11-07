package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import rx.Observable

interface NetworkRepository {

    fun getMonuments(): Observable<MonumentsDto>

}