package com.nosmurf.monumentsapp.presentation

import com.nosmurf.monumentsapp.domain.PostExecutionThread
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UIThread : PostExecutionThread {

    override fun ui(): Scheduler = AndroidSchedulers.mainThread()

    override fun io(): Scheduler = Schedulers.io()

    override fun computation(): Scheduler = Schedulers.computation()

}