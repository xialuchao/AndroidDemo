package com.example.shylock.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * 自定义广播接收器
 */

public class MyReceiver1 extends BroadcastReceiver {
    public MyReceiver1() {
    }



    //接收广播
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String info = intent.getStringExtra("info");
        Toast.makeText(context,info, Toast.LENGTH_SHORT).show();
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
