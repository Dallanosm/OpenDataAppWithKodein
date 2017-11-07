package com.nosmurf.monumentsapp.domain

import com.nosmurf.monumentsapp.domain.models.Monument
import io.reactivex.Flowable

interface Repository {

    fun getMonuments(): Flowable<Monument>

}