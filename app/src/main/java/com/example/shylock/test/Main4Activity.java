package com.example.shylock.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    private static final int REQUESTCODE_1 = 0x1;
    private EditText editText_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editText_number = (EditText)findViewById(R.id.editText_number);//把值传过来
    }

    //选择一个号码


    public void clickSearch(View v){
        Intent intent = new Intent(this,Main5Activity.class);
        //intent ,请求编码
        startActivityForResult(intent,REQUESTCODE_1);

    }

    //重写方法来处理返回结果,就是收到动作该怎么做,像输入的一样

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    //拨打电话
    public void clickCall(View v){

    }

}
