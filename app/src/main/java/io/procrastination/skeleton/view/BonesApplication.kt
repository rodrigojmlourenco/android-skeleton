package io.procrastination.skeleton.view

import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BonesApplication : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}