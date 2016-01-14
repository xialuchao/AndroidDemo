package com.example.shylock.test;
//检测电量变化
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

public class MyReceiver8 extends BroadcastReceiver {
    public MyReceiver8() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int curr = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
        int total = intent.getIntExtra(BatteryManager.EXTRA_SCALE,1);
        int percent = curr * 100 / total;
        Toast.makeText(context,"current battery"+percent+"%",Toast.LENGTH_SHORT).show();
    }
}
