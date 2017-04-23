package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository;

import android.content.Context;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;

import java.util.List;

/**
 * Created by Vori on 2017-04-23.
 */

public interface Repository {

    void open(Context context);

    void close();

    List<Pub> getAllPubs();

    List<User> getAllUsers();

    Pub getPub(Long id);

    User getUser(Long id);

    void save(Pub pub);

    void update(Pub pub);

    void remove(Pub pub);

    void save(User user);

    void update(User user);

    void remove(User user);

    boolean isInDB(Pub pub);

    boolean isInDB(User user);
}
