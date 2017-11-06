package com.nosmurf.monumentsapp.presentation

import android.app.Application
import com.github.salomonbrys.kodein.*
import com.github.salomonbrys.kodein.android.autoAndroidModule
import com.nosmurf.monumentsapp.presenter.MainPresenter

class OpenDataAppWithKodeinApplication : Application(), KodeinAware {

    override val kodein by Kodein.lazy {
        import(autoAndroidModule(this@OpenDataAppWithKodeinApplication))

        bind<MainPresenter>() with provider { MainPresenter() }
    }

}