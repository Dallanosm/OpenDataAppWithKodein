package com.nosmurf.monumentsapp.data

import com.nosmurf.monumentsapp.data.network.NetworkRepository
import com.nosmurf.monumentsapp.data.network.mappers.dataToModel
import com.nosmurf.monumentsapp.domain.Repository
import com.nosmurf.monumentsapp.domain.models.Monument
import rx.Observable

class DataRepository(private val networkRepository: NetworkRepository) : Repository {

    override fun getMonuments(): Observable<Monument> {
        return networkRepository.getMonuments()
                .flatMapIterable { it.resultsDto.monumentDtos }
                .map { dataToModel(it) }
    }

}