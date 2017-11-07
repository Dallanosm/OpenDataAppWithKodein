package com.nosmurf.monumentsapp.domain.interactor

import com.nosmurf.monumentsapp.domain.PostExecutionThread
import com.nosmurf.monumentsapp.domain.Repository
import com.nosmurf.monumentsapp.domain.models.Monument
import io.reactivex.Flowable

class GetMonumentsUseCase(postExecutionThread: PostExecutionThread,
                          private val repository: Repository) : FlowableUseCase<Monument, Unit>(postExecutionThread) {

    override fun buildUseCase(parameters: Unit): Flowable<Monument> {
        return repository.getMonuments()
    }


}