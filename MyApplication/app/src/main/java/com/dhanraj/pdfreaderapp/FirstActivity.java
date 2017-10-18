package com.dhanraj.pdfreaderapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    String TAG = FirstActivity.class.getSimpleName();
    Context mContext = FirstActivity.this;
    Button btn_library1, btn_library2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn_library1 = (Button) findViewById(R.id.btn_library1);
        btn_library2 = (Button) findViewById(R.id.btn_library2);

        btn_library1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_library2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
