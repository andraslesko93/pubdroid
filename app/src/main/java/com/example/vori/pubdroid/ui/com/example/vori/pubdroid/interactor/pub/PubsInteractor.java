package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.GetPubEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.GetPubsEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.RemovePubEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.SavePubEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository.Repository;

/**
 * Created by Vori on 2017-04-23.
 */

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

public class PubsInteractor {
    @Inject
    Repository repository;
    @Inject
    EventBus bus;



    public PubsInteractor() {
        PubDroidApplication.injector.inject(this);
    }


    public void getPubs() {
        GetPubsEvent event = new GetPubsEvent();
        try {
            List<Pub> pubs = repository.getAllPubs();
            event.setPubs(pubs);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void getPub(Long id) {
        GetPubEvent event = new GetPubEvent();
        try {
            Pub pub = repository.getPub(id);
            event.setPub(pub);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void savePub(Pub pub) {

        SavePubEvent event = new SavePubEvent();
        event.setPub(pub);
        try {
            repository.save(pub);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

    public void updatePub(Pub pub) {
        try {
            repository.update(pub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removePub(Pub pub) {
        RemovePubEvent event = new RemovePubEvent();
        event.setPub(pub);
        try {
            repository.remove(pub);
            bus.post(event);
        } catch (Exception e) {
            event.setThrowable(e);
            bus.post(event);
        }
    }

}
