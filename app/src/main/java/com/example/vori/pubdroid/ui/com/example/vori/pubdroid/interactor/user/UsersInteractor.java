package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user;

/**
 * Created by Vori on 2017-04-23.
 */

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events.GetUserEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events.GetUsersEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events.RemoveUserEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events.SaveUserEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository.Repository;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

/**
 * Created by mobsoft on 2017. 04. 10..
 */

public class UsersInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;

    public UsersInteractor() {
        PubDroidApplication.injector.inject(this);
    }


    public void getUsers() {
        GetUsersEvent event = new GetUsersEvent();
        try {
            List<User> users = repository.getAllUsers();
            event.setUsers(users);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void getEvent(Long id) {
        GetUserEvent event = new GetUserEvent();
        try {
            User ev = repository.getUser(id);
            event.setUser(ev);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void saveUser(User user) {

        SaveUserEvent event = new SaveUserEvent();
        event.setEvent(user);
        try {
            repository.save(user);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updateUser(User user) {
        try {
            repository.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeUser(User user) {
        RemoveUserEvent event = new RemoveUserEvent();
        event.setEvent(user);
        try {
            repository.remove(user);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }
}