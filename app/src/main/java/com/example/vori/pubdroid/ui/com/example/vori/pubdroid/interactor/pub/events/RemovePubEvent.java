package com.example.vori.pubdroid.ui.com.example.vori.pubdroid.interactor.pub.events;

import com.example.vori.pubdroid.ui.com.example.vori.pubdroid.model.Pub;

/**
 * Created by Vori on 2017-04-23.
 */

public class RemovePubEvent{
        private int code;
        private Pub pub;
        private Throwable throwable;

        public RemovePubEvent() {
        }

        public RemovePubEvent(int code, Pub pub, Throwable throwable) {
            this.code = code;
            this.pub = pub;
            this.throwable = throwable;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public Pub getPub() {
            return pub;
        }

        public void setPub(Pub pub) {
            this.pub = pub;
        }

        public Throwable getThrowable() {
            return throwable;
        }

        public void setThrowable(Throwable throwable) {
            this.throwable = throwable;
        }
}
