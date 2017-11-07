package com.nosmurf.monumentsapp.domain.interactor

import com.nosmurf.monumentsapp.domain.PostExecutionThread
import io.reactivex.Flowable

abstract class FlowableUseCase<T, in Parameters>(private val schedulerProvider: PostExecutionThread) : UseCase<T>() {

    abstract fun buildUseCase(parameters: Parameters): Flowable<T>

    fun execute(onNext: (T) -> Unit, onError: (Throwable) -> Unit = {}, params: Parameters) {
        val flowable = buildUseCase(params).subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.ui())
        val disposable = flowable.subscribeWith(getDisposableSubscriber(onNext, onError))
        disposables.add(disposable)
    }

}