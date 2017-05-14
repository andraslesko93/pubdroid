package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubDetails;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;

/**
 * Created by Vori on 2017-04-09.
 */

public interface PubDetailsScreen {
    void showMessage (String string);
    void showPub(Pub pub);
    void navigateToMain();
}
