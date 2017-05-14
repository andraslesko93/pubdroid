package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubCreate;

import android.util.Log;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.PubsInteractor;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.GetPubEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.GetPubsEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.Presenter;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication.injector;

/**
 * Created by Vori on 2017-04-09.
 */

public class PubCreatePresenter extends Presenter<PubCreateScreen> {

    @Inject
    PubsInteractor pubsInteractor;
    @Inject
    Executor executor;
    @Inject
    EventBus bus;

    @Override
    public void attachScreen(PubCreateScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen(){
        bus.unregister(this);
        super.detachScreen();
    }

    public void getPub(final Long id) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                pubsInteractor.getPub(id);
            }
        });
    }


    public void onEventMainThread(GetPubEvent event) {
        Log.d("test", "test");
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading pubs", event.getThrowable());
        } else {
            if (screen != null)
            {
                Pub pub = event.getPub();
                screen.showMessage(pub.getName());
                screen.showMessage(pub.getFeeling());
                screen.showMessage(pub.getBeerPrice().toString());

            }
        }
    }
}
