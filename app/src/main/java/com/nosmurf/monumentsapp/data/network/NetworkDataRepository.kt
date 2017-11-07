package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import rx.Observable

class NetworkDataRepository(private val apiService: OpenDataService = ApiClient.createService(OpenDataService::class.java, OpenDataService.END_POINT)) : NetworkRepository {

    override fun getMonuments(): Observable<MonumentsDto> = apiService.getMonuments()

}