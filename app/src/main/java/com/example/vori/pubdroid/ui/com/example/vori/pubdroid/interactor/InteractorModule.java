package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.PubsInteractor;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.UsersInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Vori on 2017-04-23.
 */

@Module
public class InteractorModule {

    @Provides
    public PubsInteractor providePubs() {
        return new PubsInteractor();
    }

    @Provides
    public UsersInteractor provideUsers() {
        return new UsersInteractor();
    }

}
