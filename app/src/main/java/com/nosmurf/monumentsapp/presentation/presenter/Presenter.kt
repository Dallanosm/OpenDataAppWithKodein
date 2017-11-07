package com.nosmurf.monumentsapp.presentation.presenter

abstract class Presenter<V : Presenter.View> {

    var view: V? = null

    fun start(v: V?) {
        this.view = v
        if (v == null) {
            throw RuntimeException()
        }
        this.initialize()
    }

    abstract fun initialize()

    abstract fun pause()

    abstract fun stop()

    abstract fun destroy()

    interface View {
        fun showError(messageId: Int)
        fun showError(message: String)
    }
}