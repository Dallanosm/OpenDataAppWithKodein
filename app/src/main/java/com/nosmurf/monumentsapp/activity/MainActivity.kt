package com.nosmurf.monumentsapp.activity

import com.nosmurf.monumentsapp.R
import com.nosmurf.monumentsapp.presenter.MainPresenter
import com.nosmurf.monumentsapp.presenter.Presenter


class MainActivity : RootActivity<MainPresenter.View>() {

    override val layoutResourceId: Int = R.layout.activity_main

    override val presenter: Presenter<MainPresenter.View>
        get() = MainPresenter() // TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun initializeInjector() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initializeUI() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initializePresenter() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(messageId: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}