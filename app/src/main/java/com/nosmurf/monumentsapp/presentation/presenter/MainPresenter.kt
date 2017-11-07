package com.nosmurf.monumentsapp.presentation.presenter

import com.nosmurf.monumentsapp.domain.interactor.GetMonumentsUseCase

class MainPresenter(private val getMonumentsUseCase: GetMonumentsUseCase) : Presenter<MainPresenter.View>() {

    override fun initialize() {
        getMonumentsUseCase.execute({ view?.showTestText(it.name) }, { view?.showError(it.message!!) }, Unit)
    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun destroy() {
        getMonumentsUseCase.dispose()
    }

    interface View : Presenter.View {
        fun showTestText(text: String)
    }
}