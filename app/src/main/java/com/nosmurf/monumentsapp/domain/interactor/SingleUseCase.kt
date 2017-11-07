package com.nosmurf.monumentsapp.domain.interactor

import com.nosmurf.monumentsapp.domain.PostExecutionThread
import io.reactivex.Single

abstract class SingleUseCase<T, in Parameters>(private val schedulerProvider: PostExecutionThread) : UseCase<T>() {

    abstract fun buildUseCase(parameters: Parameters): Single<T>

    fun execute(onNext: (T) -> Unit, onError: (Throwable) -> Unit = {}, params: Parameters) {
        val single = buildUseCase(params).subscribeOn(schedulerProvider.io()).observeOn(schedulerProvider.ui())
        val disposable = single.subscribeWith(getDisposableSingleObserver(onNext, onError))
        disposables.add(disposable)
    }

}