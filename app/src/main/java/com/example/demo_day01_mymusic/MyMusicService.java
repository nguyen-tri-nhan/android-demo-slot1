package com.example.demo_day01_mymusic;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MyMusicService extends Service {
    MediaPlayer mpObject;

    public MyMusicService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mpObject = MediaPlayer.create(this, R.raw.nhac);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mpObject.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mpObject.release();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
}