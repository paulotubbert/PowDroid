package com.tubbert.powdroid.events

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

/**
 *
 */
object TaskScheduler {

    fun createSingleTaskScheduler(
            delayMs: Long,
            subscribeScheduler: Scheduler = AndroidSchedulers.mainThread(),
            observeScheduler: Scheduler = AndroidSchedulers.mainThread())
            : Observable<Unit> {

        return Observable.just(Unit).delay(delayMs, TimeUnit.MILLISECONDS)
                .subscribeOn(subscribeScheduler)
                .observeOn(observeScheduler)

    }

}