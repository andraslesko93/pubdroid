package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs;

import android.util.Log;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.PubsInteractor;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events.GetPubsEvent;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.Presenter;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

import static com.example.vori.pubdroid.ui.com.example.vori.pubdroid.PubDroidApplication.injector;

/**
 * Created by Vori on 2017-04-09.
 */

public class ListPubsPresenter extends Presenter<ListPubsScreen> {


    @Inject
    PubsInteractor pubsInteractor;

    @Inject
    Executor executor;

    @Inject
    EventBus bus;

    public ListPubsPresenter() {
    }



    @Override
    public void attachScreen(ListPubsScreen screen) {
        super.attachScreen(screen);
        injector.inject(this);
        bus.register(this);
    }

    @Override
    public void detachScreen() {
        bus.unregister(this);
        super.detachScreen();
    }

    public void getPubs() {

        executor.execute(new Runnable() {
            @Override
            public void run() {
                pubsInteractor.getPubs();
            }
        });
    }
    public void onEventMainThread(GetPubsEvent event) {
        Log.d("test","test");
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
                screen.showMessage("error");
            }
            Log.e("Networking", "Error reading favourites", event.getThrowable());
        } else {
            if (screen != null) {
                for(Pub t : event.getPubs()){
                    screen.showMessage(t.getName());
                }
            }
        }
    }

}
