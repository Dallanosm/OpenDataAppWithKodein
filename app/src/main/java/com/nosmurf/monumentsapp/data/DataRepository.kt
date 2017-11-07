package com.nosmurf.monumentsapp.data

import com.nosmurf.monumentsapp.data.network.NetworkRepository
import com.nosmurf.monumentsapp.data.network.mappers.dataToModel
import com.nosmurf.monumentsapp.domain.Repository
import com.nosmurf.monumentsapp.domain.models.Monument
import io.reactivex.Flowable

class DataRepository(private val networkRepository: NetworkRepository) : Repository {

    override fun getMonuments(): Flowable<Monument> {
        return networkRepository.getMonuments()
                .flatMapIterable { it.results.bindings }
                .map { dataToModel(it) }
    }

}