package com.example.android_layout;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        button1 = findViewById(R.id.B1);
        button2 = findViewById(R.id.B2);
        button3 = findViewById(R.id.B3);
        button1.setOnClickListener(new myOnclick(1));
        button2.setOnClickListener(new myOnclick(2));
        button3.setOnClickListener(new myOnclick(3));
//        myOnclick listener = new myOnclick();
//        button1.setTag(1);         //给button设置标记
//        button1.setOnClickListener(listener);
//        button2.setTag(2);
//        button2.setOnClickListener(listener);
//        button3.setTag(3);
//        button3.setOnClickListener(listener);

    }
    class myOnclick implements View.OnClickListener {
        private int id;
        public myOnclick(int id){
            this.id=id;
        }
        @Override
        public void onClick(View v) {
//            int tag = (Integer)v.getTag();
            Intent intent = new Intent();
            switch (id){
                case 1:
                    intent.setClass(MainActivity.this, LinearLayout.class);
                    break;
                case 2:
                    intent.setClass(MainActivity.this, Constraint_layout.class);
                    break;
                case 3:
                    intent.setClass(MainActivity.this,TableLayout.class);
                    break;
            }
            MainActivity.this.startActivity(intent);
        }
    }
}

