package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;

import java.util.List;

/**
 * Created by Vori on 2017-04-23.
 */

public class GetPubsEvent {
    private int code;
    private List<Pub> pubs;
    private Throwable throwable;

    public GetPubsEvent() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Pub> getPubs() {
        return pubs;
    }

    public void setPubs(List<Pub> pubs) {
        this.pubs = pubs;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
