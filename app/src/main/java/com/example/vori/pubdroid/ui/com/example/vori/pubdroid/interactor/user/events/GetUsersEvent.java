package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;

import java.util.List;

/**
 * Created by Vori on 2017-04-23.
 */

public class GetUsersEvent {
    private int code;
    private List<User> users;
    private Throwable throwable;

    public GetUsersEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> u) {
        this.users = u;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}