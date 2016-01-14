package com.example.shylock.test;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 通过组建名称
     * @param v
     */
    public void clickComp(View v){
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(this,Main2Activity.class);
        intent.setComponent(componentName);
        startActivity(intent);

        //2
        //Intent intent = new Intent(this,Main2Activity.class);

    }
    public void clickAction(View v){
        Intent intent = new Intent();
        intent.setAction("com.shylock.action.MY_ACTION");
        intent.addCategory("com.shylock.category.MY_CATEGORY");
        startActivity(intent);
    }


    //data与action配合使用
    public void clickData(View v){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        Uri data = Uri.parse("http://www.baidu.com");
//        intent.setData(data);
//        intent.setType();
        intent.setDataAndType(data,"text/html");
        startActivity(intent);
    }

    public void clickFlat(View v){
        Intent intent = new Intent(this,Main3Activity.class);
        //设置activity的启动模式
        //Intent.FLAG_ACTIVITY_NEW_TASK  在新的任务栈中启动activity,如果有,就在本任务中启动
        //Intent.FLAG_ACTIVITY_CLEAR_TASK   相当于singleTask
        //Intent.FLAG_ACTIVITY_CLEAR_TOP    相当于singleTop
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
