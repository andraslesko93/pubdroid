package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.login.LoginPresenter;

import javax.inject.Inject;

/**
 * Created by Vori on 2017-04-09.
 */

public class ListPubsActivity  extends AppCompatActivity implements ListPubsScreen {
    @Inject
    ListPubsPresenter listPubsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.);

        PubDroidApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listPubsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        listPubsPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {

    }

    @Override
    public void navigateToMain() {

    }
}
