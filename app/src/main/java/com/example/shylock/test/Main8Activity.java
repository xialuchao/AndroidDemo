package com.example.shylock.test;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main8Activity extends AppCompatActivity {

    private MyReceiver5 myReceiver5 = new MyReceiver5();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter = new IntentFilter("com.shylock.MY_BROADCAST4");
        registerReceiver(myReceiver5,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(myReceiver5);
    }
}
