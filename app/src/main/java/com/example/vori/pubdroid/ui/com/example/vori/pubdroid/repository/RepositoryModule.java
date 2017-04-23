package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by Vori on 2017-04-23.
 */
@Module
public class RepositoryModule {

    @Singleton
    @Provides
    public Repository provideRepository() {
        return new SugarOrmRepository();
    }
}
