package com.example.vori.pubdroid.ui.com.example.vori.pubdroid;

import android.app.Application;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.UIModule;
/**
 * Created by Vori on 2017-03-27.
 */

public class PubDroidApplication extends Application{
    public static PubDroidApplicationComponent injector;
    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerPubDroidApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}