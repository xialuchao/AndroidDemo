package com.example.shylock.test;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {

    private MyReceiver2 receiver2 = new MyReceiver2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }

    //在该方法中进行广播注册
    @Override
    protected void onResume() {
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.shylock.MY_BROADCAST");
        registerReceiver(receiver2,filter);
        super.onResume();


    }

    //在该方法中接触广播注册
    @Override
    protected void onPause() {
        unregisterReceiver(receiver2);
        super.onPause();
    }

    //发送一个普通广播
    public void clickNormal(View v){
        Intent intent = new Intent("com.shylock.MY_BROADCAST");
        intent.putExtra("info","We are friendly");
        this.sendBroadcast(intent);
    }

    //发送一个有序广播
    public void clickOrder(View v){
        Intent intent = new Intent("com.shylock.MY_BROADCAST3");
        //参数:intent 接收权限
        this.sendOrderedBroadcast(intent,null);
    }
    //发送一个粘性广播
    public void clickSticky(View v){
        Intent intent  = new Intent("com.shylock.MY_BROADCAST4");
        this.sendStickyBroadcast(intent);
    }

    //打开粘性广播
    public void openSticky(View v){
        Intent intent = new Intent(this,Main8Activity.class);
        startActivity(intent);




    }
}
