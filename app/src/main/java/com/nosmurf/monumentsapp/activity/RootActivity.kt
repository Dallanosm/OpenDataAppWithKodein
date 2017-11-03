package com.nosmurf.monumentsapp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.nosmurf.monumentsapp.presenter.Presenter

abstract class RootActivity<V : Presenter.View> : AppCompatActivity(), Presenter.View {

    protected abstract val layoutResourceId: Int
    protected abstract val presenter: Presenter<V>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResourceId)

        initializeInjector()
        initializeUI()
        initializePresenter()
    }

    protected abstract fun initializeInjector()

    protected abstract fun initializeUI()

    protected abstract fun initializePresenter()

    override fun onPause() {
        super.onPause()
        presenter.pause()
    }

    override fun onStop() {
        super.onStop()
        presenter.stop()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

}
