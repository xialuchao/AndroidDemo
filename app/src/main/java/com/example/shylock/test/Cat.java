package com.example.shylock.test;

import java.io.Serializable;

/**
 * Created by shylock on 3/1/16.
 */
public class Cat implements Serializable{

    String name;
    int age;
    String type;

    @Override
    //右击----generate----to string
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
