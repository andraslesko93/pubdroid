package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui;

/**
 * Created by Vori on 2017-03-27.
 */

import android.content.Context;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs.ListPubsPresenter;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.login.LoginPresenter;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.main.MainPresenter;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubCreate.PubCreatePresenter;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubDetails.PubDetailsPresenter;

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

    @Provides
    @Singleton
    public LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }
    @Provides
    @Singleton
    public ListPubsPresenter provideListPubsPresenter() {
        return new ListPubsPresenter();
    }

    @Provides
    @Singleton
    public PubDetailsPresenter providePubDetailsPresenter() {
        return new PubDetailsPresenter();
    }

    @Provides
    @Singleton
    public PubCreatePresenter providePubCreatePresenter() {
        return new PubCreatePresenter();
    }
}
