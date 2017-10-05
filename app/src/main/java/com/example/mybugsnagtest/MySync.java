package com.example.mybugsnagtest;

import android.os.AsyncTask;
import android.util.Log;

import com.bugsnag.android.Bugsnag;


/**
 * All work and no play makes Jack a dull boy.  (10/4/17)
 */
public class MySync extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... voids) {
        Log.v(MySync.class.getSimpleName(), "Error!");
        Bugsnag.notify(new RuntimeException("Non-fatal"));
        return null;
    }
}
