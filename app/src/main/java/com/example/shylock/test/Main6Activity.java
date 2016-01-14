package com.example.shylock.test;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private  ICat cat;
    private boolean mBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    public void clickStart(View v) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void clickStop(View v) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }

    public void clickIntentService(View v) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra("info", "hello shylock");
        startService(intent);
    }

    public  void clickRecall(View v){
        if (cat == null){
            return;
        }
        try {
            cat.setName("miao");
            Toast.makeText(this,cat.desc(),Toast.LENGTH_LONG).show();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    //绑定服务的连接回调接口
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            //绑定成功后回调的方法
            cat = ICat.Stub.asInterface(service);
            System.out.println(cat);
            mBound = true;
            Toast.makeText(Main6Activity.this,"successful",Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            //服务异常时被调用
            mBound = false;
        }
    };

    public void clickBound(View v){
        Intent intent = new Intent(this,MyBoundService.class);
        //异步绑定,绑定成功后会回调ONServiceConnected
        bindService(intent,conn, Context.BIND_AUTO_CREATE);

    }

    public void clickUnBound(View v){
        if (mBound){
            unbindService(conn);
            Toast.makeText(Main6Activity.this,"jiechu successful",Toast.LENGTH_SHORT).show();
        }
    }
}
