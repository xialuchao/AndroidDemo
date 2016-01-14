package com.example.shylock.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver5 extends BroadcastReceiver {
    public MyReceiver5() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "receive a sticky broadcast", Toast.LENGTH_SHORT).show();
    }
}
