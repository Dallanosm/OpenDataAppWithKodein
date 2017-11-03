package com.nosmurf.monumentsapp.presenter

abstract class Presenter<V : Presenter.View> {

    var view: V? = null

    abstract fun initialize()

    abstract fun pause()

    abstract fun stop()

    abstract fun destroy()

    interface View {
        fun showError(messageId: Int)
        fun showError(message: String)
    }
}