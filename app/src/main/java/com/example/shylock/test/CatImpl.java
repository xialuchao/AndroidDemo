package com.example.shylock.test;

import android.os.RemoteException;

/**
 * description:业务接口具体实现类
 * company:
 *
 * Created by shylock on 6/1/16.
 */
public class CatImpl extends ICat.Stub {
    private String name;
    public void setName(String name) throws RemoteException {
        this.name = name;
    }

    @Override
    public String desc() throws RemoteException {
        return "My name is "+name+",I am a cat" ;
    }

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

    }
}
