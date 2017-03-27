package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui;

/**
 * Created by Vori on 2017-03-27.
 */

import android.content.Context;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.main.MainPresenter;
@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }
}
