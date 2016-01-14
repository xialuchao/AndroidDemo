package com.example.shylock.test;

import android.app.IntentService;
import android.content.Intent;


/**
 * IntentService:
 * 1.内部有一个工作线程来完成耗时的操作,只需实现onhandleIntent方法即可
 *2.完成工作时后会自动停止服务
 * 3.如果同时执行多个任务时,会以工作队列的方式,一次执行
 * 4.通过该类来完成app中的耗时任务
 *
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        System.out.println(intent.getStringExtra("info"));
        for (int i = 0;i < 20;i++) {
            System.out.println("onstartcommand-" + i + "-" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
