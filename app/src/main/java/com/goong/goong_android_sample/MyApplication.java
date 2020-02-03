package com.goong.goong_android_sample;

import android.app.Application;

import io.goong.goongsdk.Goong;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Goong.getInstance(this, "YOUR_ACCESS_TOKEN");
    }
}
