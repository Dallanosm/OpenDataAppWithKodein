package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import io.reactivex.Flowable

interface NetworkRepository {

    fun getMonuments(): Flowable<MonumentsDto>

}