package com.nosmurf.monumentsapp.domain

import io.reactivex.Scheduler

interface PostExecutionThread {

    fun ui(): Scheduler

    fun io(): Scheduler

    fun computation(): Scheduler

}