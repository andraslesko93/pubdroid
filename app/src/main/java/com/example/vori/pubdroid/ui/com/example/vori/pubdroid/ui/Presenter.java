package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui;

/**
 * Created by Vori on 2017-03-27.
 */

public abstract class Presenter <S>{

    protected S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}
