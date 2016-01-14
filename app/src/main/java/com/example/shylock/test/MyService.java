package com.example.shylock.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/**
 * started serice:
 * 1服务同时只会被创建一次,可以通过外部调用stopService或调用stopSelf来终止服务
 * 2当执行一个已启动的服务,会直接调用onStartCommand方法来执行业务
 * 3在默认情况下,服务与主线程在同一个进程中的同一个线程中执行,如果服务执行比较耗时,我们必须使用子线程来完成工作
 * 避免阻塞主线程
 * 4使用started service 启动的一个服务,在没有关闭之前会一直在后台运行
 *
 */

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("service create");
    }
    //实现业务
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //新建线程,来完成长时间的工作
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i < 20;i++){
                    System.out.println("onstartcommand-"+i+"-"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    if (i == 19);{
//                        MyService.this.stopSelf();//终止服务
//                        break;
//                    }
                }
            }
        }).start();


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("destory");
    }
}
