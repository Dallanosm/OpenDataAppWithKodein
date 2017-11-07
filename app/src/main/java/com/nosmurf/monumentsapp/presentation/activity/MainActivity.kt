package com.nosmurf.monumentsapp.presentation.activity

import com.github.salomonbrys.kodein.instance
import com.nosmurf.monumentsapp.R
import com.nosmurf.monumentsapp.presentation.extensions.showToast
import com.nosmurf.monumentsapp.presentation.presenter.MainPresenter


class MainActivity : RootActivity<MainPresenter.View>(), MainPresenter.View {

    override val layoutResourceId: Int = R.layout.activity_main

    override val presenter: MainPresenter by kodein.instance()

    override fun initializeUI() {

    }

    override fun initializePresenter() {
        presenter.start(this)
    }

    override fun showError(messageId: Int) {
        showToast(messageId)
    }

    override fun showError(message: String) {
        showToast(message)
    }

    override fun showTestText(text: String) {
        showToast(text)
    }

}
