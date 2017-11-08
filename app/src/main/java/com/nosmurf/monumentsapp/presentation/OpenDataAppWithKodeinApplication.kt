package com.nosmurf.monumentsapp.presentation

import android.app.Application
import com.github.salomonbrys.kodein.*
import com.github.salomonbrys.kodein.android.autoAndroidModule
import com.nosmurf.monumentsapp.data.DataRepository
import com.nosmurf.monumentsapp.data.network.NetworkDataRepository
import com.nosmurf.monumentsapp.data.network.NetworkRepository
import com.nosmurf.monumentsapp.data.network.OpenDataService
import com.nosmurf.monumentsapp.data.network.createService
import com.nosmurf.monumentsapp.domain.PostExecutionThread
import com.nosmurf.monumentsapp.domain.Repository
import com.nosmurf.monumentsapp.domain.interactor.GetMonumentsUseCase
import com.nosmurf.monumentsapp.presentation.presenter.MainPresenter

class OpenDataAppWithKodeinApplication : Application(), KodeinAware {

    override val kodein by Kodein.lazy {
        import(autoAndroidModule(this@OpenDataAppWithKodeinApplication))

        bind<MainPresenter>() with provider { MainPresenter(instance()) }

        bind<PostExecutionThread>() with singleton { UIThread() }

        bind<GetMonumentsUseCase>() with singleton { GetMonumentsUseCase(instance(), instance()) }

        bind<Repository>() with singleton { DataRepository(instance()) }
        bind<NetworkRepository>() with singleton { NetworkDataRepository(createService(OpenDataService.END_POINT)) }
    }

}