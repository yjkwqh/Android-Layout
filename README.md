# Android-Layout
LinearLayout、ConstraintLayout、TableLayout的使用
@[TOC](Second Test)

# 第二个实验
## Android布局实验 
运行主界面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319230240591.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)
核心代码：
```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/B1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Linear_layout"/>
    <Button
        android:id="@+id/B2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Constraint_layout"
        />
    <Button
        android:id="@+id/B3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="table_layout"
        />
</LinearLayout>
```

各个页面跳转功能的代码：
```java
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
```

1.利用线性布局实现如下界面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190316221925594.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)
核心代码(布局文件)：
```java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="One,One"

            />
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="One,Two"

            />
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="One,Three"

            />
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="One,Four"

            />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Two,One"
          />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="4"
            android:text="Two,Two"

            />

        <Button

            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="Two,Three"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Two,Four"
           />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="Three,One"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="4"
            android:text="Three,Two"

            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Three,Three"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="4"
            android:text="Three,Four"
            />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="Four,One"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Four,Two"

            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="4"
            android:text="Four,Three"
            />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="4"
            android:text="Four,Four"

            />
    </LinearLayout>
</LinearLayout>
```
运行截图：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319230416350.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)


2.利用ConstraintLayout实现如下界面：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190316233058543.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)
核心代码：
```java
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    >
    <Button
        android:id="@+id/B1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="RED"
        android:background="#DC143C"

        />
    <Button
        android:id="@+id/B2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Orange"
        android:background="#FFA500"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        />
    <Button
        android:id="@+id/B3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Yellow"
        android:background="#FFFF00"

        app:layout_constraintRight_toRightOf="parent"
        />

    <Button
        android:id="@+id/B4"
        android:layout_width="60dp"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toBottomOf="@id/B2"
        app:layout_constraintBottom_toTopOf="@+id/B7"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:text="Blue"
        android:textColor="#FFFFFF"
        android:background="#0000FF"
        />

    <Button
        android:id="@+id/B5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#008000"
        android:text="GREEN"
        app:layout_constraintRight_toLeftOf="@+id/B4"
        app:layout_constraintBaseline_toBaselineOf="@+id/B4"
        android:layout_margin="10dp"/>
    <Button
        android:id="@+id/B6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#4B0082"
        android:text="Indigo"
        android:textColor="#FFFFFF"
        app:layout_constraintLeft_toRightOf="@+id/B4"
        app:layout_constraintBaseline_toBaselineOf="@+id/B4"
        android:layout_margin="10dp"/>
    <Button
        android:id="@+id/B7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#EE82EE"
        android:text="Violet"
        app:layout_constraintBottom_toBottomOf="parent"
        />
</android.support.constraint.ConstraintLayout>
```
运行截图：![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319230430983.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)

3.利用表格布局实现如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019031623423555.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)
核心代码：
```java
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:stretchColumns="*"
    >

    <TableRow>
        <TextView
            android:textColor="#000000"
            android:layout_marginLeft="10dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Open..." />
        <TextView
            android:textColor="#000000"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="right"
            android:text="Ctrl-O" />


    </TableRow>

    <TableRow>

        <TextView
            android:textColor="#000000"
            android:layout_marginLeft="10dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="left"
            android:text="Save..." />

        <TextView
            android:textColor="#000000"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="right"
            android:text="Ctrl-S" />
    </TableRow>

    <TableRow>

        <TextView
            android:textColor="#000000"
            android:layout_marginLeft="10dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="left"
            android:text="Save As..." />

        <TextView
            android:textColor="#000000"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="right"
            android:text="Ctrl-Shift-S" />
    </TableRow>
    <View
        android:layout_width="match_parent"
        android:layout_height="5px"
        android:background="#000000"/>
    <TableRow>

        <TextView
            android:textColor="#000000"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="left"
            android:text="X Import..." />
    </TableRow>
    <TableRow>

        <TextView
            android:textColor="#000000"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="left"
            android:text="X Emport..." />

        <TextView
            android:textColor="#000000"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="right"
            android:text="Ctrl-E" />
    </TableRow>
    <View
        android:layout_width="match_parent"
        android:layout_height="5px"
        android:background="#000000"/>
    <TableRow>

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="left"
            android:layout_margin="10dp"
            android:text="Quit"
            android:textColor="#000000" />
    </TableRow>
</TableLayout>
```

运行截图：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319230856341.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZhZ2Fib25kXw==,size_16,color_FFFFFF,t_70)
