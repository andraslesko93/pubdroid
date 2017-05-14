package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository;

import android.content.Context;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vori on 2017-04-23.
 */

public class MemoryRepository implements Repository {

    public static List<Pub> pubs;
    public static List<User> users;

    @Override
    public void open(Context context) {
        Pub pub1 = new Pub((long)1, "akacfa", "kesdobalo", 300);
        Pub pub2 = new Pub((long)1, "andersen", "beszelgetos", 350);

        pubs = new ArrayList<>();
        pubs.add(pub1);
        pubs.add(pub2);

        users= new ArrayList<>();
    }

    @Override
    public void close() {

    }

    @Override
    public List<Pub> getAllPubs() {
        return pubs;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public Pub getPub(Long id) {
        for(Pub pub : pubs){
            if(pub.getId().equals(id)) return pub;
        }
        return null;
    }

    @Override
    public User getUser(Long id) {
        for(User u : users){
            if(u.getId().equals(id)) return u;
        }
        return null;
    }

    @Override
    public void save(Pub pub) {
        pubs.add(pub);
    }

    @Override
    public void update(Pub pub) {
        for (int i = 0; i < this.pubs.size(); i++) {
            if(pubs.get(i).getId().equals(pub.getId())) this.pubs.set(i, pub);
        }
    }

    @Override
    public void remove(Pub pub) {
        pubs.remove(pub);
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        for (int i = 0; i < this.users.size(); i++) {
            if(users.get(i).getId().equals(user.getId())) this.users.set(i, user);
        }
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }

    @Override
    public boolean isInDB(Pub pub) {
        return pubs.contains(pub);
    }

    @Override
    public boolean isInDB(User user) {
        return users.contains(user);
    }
}
