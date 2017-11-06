package com.nosmurf.monumentsapp.data

import com.nosmurf.monumentsapp.data.network.NetworkRepository
import com.nosmurf.monumentsapp.domain.Repository
import com.nosmurf.monumentsapp.domain.models.Monument
import rx.Observable

class DataRepository(private val networkRepository: NetworkRepository) : Repository {

    override fun getMonuments(): Observable<Monument> {
        TODO("Call network repository and get Monuments, convert to iterable obvservable and map MonumentDto to Monument")
    }

}