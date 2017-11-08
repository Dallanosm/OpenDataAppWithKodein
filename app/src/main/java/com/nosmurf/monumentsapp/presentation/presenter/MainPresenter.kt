package com.nosmurf.monumentsapp.presentation.presenter

import com.nosmurf.monumentsapp.domain.interactor.GetMonumentsUseCase
import com.nosmurf.monumentsapp.domain.models.Monument

class MainPresenter(private val getMonumentsUseCase: GetMonumentsUseCase) : Presenter<MainPresenter.View>() {

    override fun initialize() {
        getMonumentsUseCase.execute({ view?.showMonument(it) }, { view?.showError(it.message!!) }, Unit)
    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun destroy() {
        getMonumentsUseCase.dispose()
    }

    interface View : Presenter.View {
        fun showMonument(monument: Monument)
    }
}