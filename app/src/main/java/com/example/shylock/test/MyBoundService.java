package com.example.shylock.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * 绑定服务:
 * 通过绑定服务来实现功能的步骤:
 * 1客户端通过bindService方法来绑定一个服务对象,如果绑定成功,会回调ServiceConnection接口方法onServiceConnected
 * 2通过Service组件来暴露业务接口
 * 3服务端通过创建*.aidl文件来定义一个可以被客户端调用的业务接口
 *    一个aidl文件满足的条件:
 *      1)不能有修饰符,类似接口写法
 *      2)支持类型,8种基本数据类型.String,CharSquenence,List<string>,map,自定义类型
 * 4服务端需要提供一个业务接口的实现类,通常会继承extends Stub类
 * 5通过Service的onBind方法返回被绑定的业务对象
 * 6客户端如果绑定成功,就可以向调用自己的方法一样调用远程的业务对象方法
 *
 */

public class MyBoundService extends Service {
    public MyBoundService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new CatImpl();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
