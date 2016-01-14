package com.example.shylock.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver3 extends BroadcastReceiver {
    public MyReceiver3() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context,"receive order broadcast-1",Toast.LENGTH_SHORT).show();

//        Bundle data = new Bundle();
//        data.putString("info","broadcast-1");
//        this.setResultExtras(data);
        //中断有序广播
        //this.abortBroadcast();

    }
}
