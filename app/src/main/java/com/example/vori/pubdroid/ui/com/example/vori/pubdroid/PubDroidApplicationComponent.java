package com.example.vori.pubdroid.ui.com.example.vori.pubdroid;

import javax.inject.Singleton;
import dagger.Component;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.UIModule;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.main.MainActivity;

/**
 * Created by Vori on 2017-03-27.
 */

@Singleton
@Component(modules = {UIModule.class})
public interface PubDroidApplicationComponent {
    void inject(MainActivity mainActivity);
}