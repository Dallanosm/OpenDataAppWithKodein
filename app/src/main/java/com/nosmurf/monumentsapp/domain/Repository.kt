package com.nosmurf.monumentsapp.domain

import com.nosmurf.monumentsapp.domain.models.Monument
import rx.Observable

interface Repository {

    fun getMonuments(): Observable<Monument>

}