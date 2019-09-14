package com.gloria.september14;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {

    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
            Log.d("Place", "Rosarium");
            Log.d("Place", "Botanical Garden");
            Log.d("Place", "UST Hospital");
            Log.d("Place", "QPAV");
    }
}
