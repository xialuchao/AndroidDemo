package com.example.shylock.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private EditText editText_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText_info = (EditText) findViewById(R.id.editText_info);
    }


    public void sendObjClick(View b){//去新建一个类   Cat
        //要传递的对象
        Cat cat = new Cat();
        cat.name = "pi";
        cat.age = 2;
        cat.type = "JJ";

        Intent intent = new Intent(this,Main3Activity.class);
        intent.putExtra("cat",cat);
        startActivity(intent);

    }


    public void sendClick(View v){
        //第一步:意图的参数为:上下文,要跳转的字节码.class就是字节码
        Intent intent = new Intent(this,Main3Activity.class);//点击按钮跳转至某个activity(创建一个意图)

        String info = editText_info.getText().toString();//取得输入的值
        //封装要传递的数据
        Bundle data = new Bundle();
//        data.putString("info",info);//数据存到bundle-------|
//        intent.putExtra("data",data);//数据存到intent-------\>intent.putExtra("age",24)/("info",info)
        intent.putExtra("info",info);
        startActivity(intent);
    }
}
