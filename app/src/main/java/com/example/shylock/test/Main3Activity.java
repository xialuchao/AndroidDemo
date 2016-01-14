package com.example.shylock.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView textView2;//添加私有

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView2 = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();
//        Bundle data = intent.getBundleExtra("data");
//        String info = data.getString("info");
        String info = intent.getStringExtra("info");
//        int age = intent.getIntExtra("age",18);


//        Cat cat = (Cat) intent.getSerializableExtra("cat");
//        String text = info+"-"+"\n"+cat.toString();/////null
        textView2.setText(info);
    }
}
