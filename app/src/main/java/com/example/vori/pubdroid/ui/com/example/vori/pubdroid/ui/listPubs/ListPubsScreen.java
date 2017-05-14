package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;

import java.util.List;

/**
 * Created by Vori on 2017-04-09.
 */

public interface ListPubsScreen {


    void showPubsList(List<Pub> pubList);
    void showMessage(String text);
    void navigateToMain();

    void setFloatingActionButton();
}
