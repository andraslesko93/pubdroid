package com.example.vori.pubdroid.ui.com.example.vori.pubdroid;

import javax.inject.Singleton;
import dagger.Component;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.InteractorModule;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.PubsInteractor;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.user.UsersInteractor;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.repository.RepositoryModule;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.UIModule;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.listPubs.ListPubsActivity;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.login.LoginActivity;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.main.MainActivity;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubCreate.PubCreateActivity;
import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.ui.pubDetails.PubDetailsActivity;

/**
 * Created by Vori on 2017-03-27.
 */

@Singleton
@Component(modules = {UIModule.class, RepositoryModule.class, InteractorModule.class})
public interface PubDroidApplicationComponent {
    void inject(MainActivity mainActivity);
    void inject(LoginActivity loginActivity);
    void inject(ListPubsActivity listPubsActivity);
    void inject(PubDetailsActivity pubDetailsActivity);
    void inject(PubCreateActivity pubCreateActivity);

    void inject(UsersInteractor usersInteractor);
    void inject(PubsInteractor pubsInteractor);
}