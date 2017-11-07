package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import io.reactivex.Flowable

class NetworkDataRepository(private val apiService: OpenDataService) : NetworkRepository {

    override fun getMonuments(): Flowable<MonumentsDto> = apiService.getMonuments()

}