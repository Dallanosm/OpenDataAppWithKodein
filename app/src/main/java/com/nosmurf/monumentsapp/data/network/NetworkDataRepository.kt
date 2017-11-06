package com.nosmurf.monumentsapp.data.network

import com.nosmurf.monumentsapp.data.network.models.MonumentsDto
import rx.Single

//fixme: Cannot call to static class method in kotlin? Why need a instance of ApiClient?
class NetworkDataRepository(private val apiService: OpenDataService = ApiClient().createService(OpenDataService::class.java, OpenDataService.END_POINT)) : NetworkRepository {

    override fun getMonuments(): Single<MonumentsDto> = apiService.getMonuments()

}