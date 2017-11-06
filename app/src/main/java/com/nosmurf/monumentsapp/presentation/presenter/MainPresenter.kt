package com.nosmurf.monumentsapp.presenter

class MainPresenter : Presenter<MainPresenter.View>() {

    override fun initialize() {
        view?.showTestText("lorem ipsum")
    }

    override fun pause() {

    }

    override fun stop() {

    }

    override fun destroy() {

    }

    interface View : Presenter.View {
        fun showTestText(text: String)
    }
}