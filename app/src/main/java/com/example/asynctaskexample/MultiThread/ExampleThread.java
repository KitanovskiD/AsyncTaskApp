package com.example.asynctaskexample.MultiThread;

import android.util.Log;

public class ExampleThread extends Thread {

    private int seconds;

    public ExampleThread(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        for (int i=0; i < seconds; i++){
            Log.d("ExampleThread", "StartThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
