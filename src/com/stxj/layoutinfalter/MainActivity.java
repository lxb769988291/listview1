package com.stxj.layoutinfalter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
//打气筒

public class MainActivity extends Activity {
private LinearLayout llparent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llparent=(LinearLayout) this.findViewById(R.id.llparent);
        LayoutInflater layoutInflater=LayoutInflater.from(this); //加载一个布局管理器      this上下文
//        View child=layoutInflater.inflate(R.layout.myview, null);//myview设置成了200  
        //这样简答，但是因为无条件把子view添加到父类容器中，子view的布局要服从父容器的布局。所以子view的宽度和高度设置没有任何效果了。
//        View child=layoutInflater.inflate(R.layout.myview, llparent, false);
        View child=layoutInflater.inflate(R.layout.myview, llparent, true);//重复添加则不用下面的add了
//        llparent.addView(child);
    }
 

}
