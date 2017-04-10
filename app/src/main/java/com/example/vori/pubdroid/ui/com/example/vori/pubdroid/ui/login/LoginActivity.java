package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import javax.inject.Inject;

import com.example.vori.pubdroid.R;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;

/**
 * Created by Vori on 2017-04-09.
 */

public class LoginActivity extends AppCompatActivity implements LoginScreen {

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.);

        PubDroidApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        loginPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {

    }

    @Override
    public void navigateToMain() {

    }
}
