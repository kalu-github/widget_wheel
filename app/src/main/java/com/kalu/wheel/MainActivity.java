package com.kalu.wheel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

import lib.kalu.wheel.WheelView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            list.add(String.valueOf(i));
        }

        final WheelView wheel1 = findViewById(R.id.wheel1);
        wheel1.setList(list);
        wheel1.setOnWheelChangeListener(new WheelView.OnWheelChangeListener() {
            @Override
            public void onChange(int index, String str) {
                final TextView text = findViewById(R.id.text1);
                text.setText("选中：" + str);
            }
        });

        final WheelView wheel2 = findViewById(R.id.wheel2);
        wheel2.setList(list);
        wheel2.setOnWheelChangeListener(new WheelView.OnWheelChangeListener() {
            @Override
            public void onChange(int index, String str) {
                final TextView text = findViewById(R.id.text2);
                text.setText("选中：" + str);
            }
        });
    }
}
