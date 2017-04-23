package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.events;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.User;

/**
 * Created by Vori on 2017-04-23.
 */


public class GetUserEvent {
    private int code;
    private User user;
    private Throwable throwable;

    public GetUserEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User u) {
        this.user = user;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}