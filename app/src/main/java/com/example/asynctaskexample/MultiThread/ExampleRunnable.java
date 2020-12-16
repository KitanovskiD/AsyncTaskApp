package com.example.asynctaskexample.MultiThread;

import android.util.Log;

public class ExampleRunnable implements Runnable {

    private int seconds;

    public ExampleRunnable(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        for (int i=0; i < seconds; i++){
            Log.d("ExampleRunnable", "StartThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
