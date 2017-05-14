package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.vori.pubdroid.R;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository.SugarOrmRepository;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubCreate.PubCreateActivity;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubDetails.PubDetailsActivity;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by Vori on 2017-04-09.
 */

public class ListPubsActivity  extends AppCompatActivity implements ListPubsScreen {
    @Inject
    public ListPubsPresenter listPubsPresenter;

    public ListView list;
    public static ArrayAdapter<Pub> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pubs);
        PubDroidApplication.injector.inject(this);


        List<Pub> pubList = new ArrayList<>();
        pubList.add(new Pub("Akácfa", "késdobáló", 200));
        pubList.add(new Pub("Gong", "bulizós", 350));
        pubList.add(new Pub("Hauzol", "késdobáló", 300));
        pubList.add(new Pub("Gong 1", "bulizós", 350));
        pubList.add(new Pub("Gong 2", "bulizós", 350));
        pubList.add(new Pub("Fahéj", "beszélgetős", 400));
        pubList.add(new Pub("Baráti kávézó", "beszélgetős", 300));
        pubList.add(new Pub("Andersen 1", "beszélgetős", 250));
        pubList.add(new Pub("Andersen 2", "beszélgetős", 250));
        pubList.add(new Pub("Krúdy", "késdobáló", 300));
        pubList.add(new Pub("Ördög gödör", "késdobáló", 200));

        showPubsList(pubList);
        setFloatingActionButton();
       // listPubsPresenter.getPubs();
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
    public void showPubsList(final List<Pub> pubList) {
        arrayAdapter = new ArrayAdapter<Pub>(this, android.R.layout.simple_list_item_1,pubList);
        list=(ListView)findViewById(R.id.listView1);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(ListPubsActivity.this, PubDetailsActivity.class);
                intent.putExtra("SELECTED_PUB", pubList.get(position));
                startActivity(intent);
            }
        });
    }


    @Override
    public void showMessage(String text) {

    }

    @Override
    public void navigateToMain() {

    }

    @Override
    public void setFloatingActionButton() {
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ListPubsActivity.this, PubCreateActivity.class);
                startActivity(intent);
            }
        });
    }

}
