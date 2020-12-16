package com.example.asynctaskexample.MultiThread;

import android.os.AsyncTask;
import android.util.Log;

public class ExampleAsyncTask extends AsyncTask<Void, Void, Void> {

    private int seconds;

    public ExampleAsyncTask(int seconds) {
        this.seconds = seconds;
    }

    @Override
    protected Void doInBackground(Void... voids) {

        for (int i=0; i < seconds; i++){
            Log.d("ExampleAsyncTask", "StartThread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
