package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubCreate;

import android.drm.ProcessedData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.vori.pubdroid.R;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs.ListPubsActivity;

import javax.inject.Inject;

/**
 * Created by Vori on 2017-04-09.
 */

public class PubCreateActivity extends AppCompatActivity implements PubCreateScreen {
    @Inject
    PubCreatePresenter pubCreatePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_pub);
        PubDroidApplication.injector.inject(this);
        setCreatePubButton();

    }

    @Override
    protected void onStart() {
        super.onStart();
        pubCreatePresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        pubCreatePresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {

    }

    @Override
    public void navigateToMain() {
        finish();
    }

    @Override
    public void setCreatePubButton() {
        Button floatingActionButton = (Button) findViewById(R.id.createPubButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
                EditText feelingEditText = (EditText) findViewById(R.id.feelingEditText);
                EditText priceEditText = (EditText) findViewById(R.id.beerPriceEditText);

                String name = nameEditText.getText().toString();
                String feeling = feelingEditText.getText().toString();
                Integer beerPrice = Integer.parseInt(priceEditText.getText().toString());

                Pub pub = new Pub(name,feeling,beerPrice);

                ListPubsActivity.arrayAdapter.add(pub);
                navigateToMain();
            }
        });
    }
}
