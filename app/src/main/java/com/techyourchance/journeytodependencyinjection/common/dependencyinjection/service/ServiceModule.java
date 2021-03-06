package com.techyourchance.journeytodependencyinjection.common.dependencyinjection.service;

import android.app.Service;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service mService) {
        this.mService = mService;
    }

    @Provides
    Service service() {
        return mService;
    }

    @Provides
    Context context(Service service) {
        return service;
    }
}
