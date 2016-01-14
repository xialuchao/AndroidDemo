package com.example.shylock.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * 网络状态改变
 */
public class MyReceiver7 extends BroadcastReceiver {
    public MyReceiver7() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info != null) {
            String name = info.getType() + "";
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
        }
    }
}
