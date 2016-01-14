package com.example.shylock.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver4 extends BroadcastReceiver {
    public MyReceiver4() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        Bundle data =  getResultExtras(false);
//        String info = data.getString("info");

        Toast.makeText(context,"receive order broadcast-2---",Toast.LENGTH_SHORT).show();





    }
}
