package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository;

import android.content.Context;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;
import com.orm.SugarContext;
import com.orm.SugarRecord;
import java.util.List;

/**
 * Created by Vori on 2017-04-23.
 */

public class SugarOrmRepository implements Repository {

    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Pub> getAllPubs() {
        return SugarRecord.listAll(Pub.class);
    }

    @Override
    public List<User> getAllUsers() {
        return SugarRecord.listAll(User.class);
    }

    @Override
    public Pub getPub(Long id) {
        return SugarRecord.findById(Pub.class, id);
    }

    @Override
    public User getUser(Long id) {
        return SugarRecord.findById(User.class, id);
    }

    @Override
    public void save(Pub pub) {
        SugarRecord.saveInTx(pub);
    }

    @Override
    public void update(Pub pub) {
        Pub pubToUpdate = getPub(pub.getId());
        pubToUpdate.setName(pub.getName());
        pubToUpdate.setFeeling(pub.getFeeling());
        pubToUpdate.setBeerPrice(pub.getBeerPrice());

        SugarRecord.saveInTx(pubToUpdate);
    }

    @Override
    public void remove(Pub pub) {
        SugarRecord.deleteInTx(pub);
    }

    @Override
    public void save(User user) {
        SugarRecord.saveInTx(user);
    }

    @Override
    public void update(User user) {
        User userToUpdate = getUser(user.getId());
        userToUpdate.setPhone(user.getPhone());
        userToUpdate.setUsername(user.getUsername());
        SugarRecord.saveInTx(userToUpdate);
    }

    @Override
    public void remove(User user) {
        SugarRecord.deleteInTx(user);
    }

    @Override
    public boolean isInDB(Pub pub) {
        return SugarRecord.findById(Pub.class, pub.getId()) != null;
    }

    @Override
    public boolean isInDB(User user) {
        return SugarRecord.findById(User.class, user.getId()) != null;
    }
}
