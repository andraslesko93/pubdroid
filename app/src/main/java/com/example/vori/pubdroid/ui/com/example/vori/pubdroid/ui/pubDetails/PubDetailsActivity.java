package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubDetails;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.vori.pubdroid.R;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;

import javax.inject.Inject;

/**
 * Created by Vori on 2017-04-09.
 */

public class PubDetailsActivity  extends AppCompatActivity implements PubDetailsScreen{

    public static Pub SELECTED_PUB;

    @Inject
    PubDetailsPresenter pubDetailsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pub_details);
        PubDroidApplication.injector.inject(this);
        SELECTED_PUB=(Pub)getIntent().getSerializableExtra("SELECTED_PUB");
        showPub(SELECTED_PUB);
    }

    @Override
    protected void onStart() {
        super.onStart();
        pubDetailsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        pubDetailsPresenter.detachScreen();
    }

    @Override
    public void showMessage(String string) {

    }

    @Override
    public void showPub(Pub pub) {

        TextView name = (TextView) findViewById(R.id.nameTextView);
        TextView feeling = (TextView) findViewById(R.id.feelingTextView);
        TextView price = (TextView) findViewById(R.id.priceTextView);

        name.setText(SELECTED_PUB.getName());
        feeling.setText(SELECTED_PUB.getFeeling());
        price.setText(SELECTED_PUB.getBeerPrice().toString());

    }

    @Override
    public void navigateToMain() {

    }
}
