package com.stxj.layoutinfalter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
//����Ͳ

public class MainActivity extends Activity {
private LinearLayout llparent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llparent=(LinearLayout) this.findViewById(R.id.llparent);
        LayoutInflater layoutInflater=LayoutInflater.from(this); //����һ�����ֹ�����      this������
//        View child=layoutInflater.inflate(R.layout.myview, null);//myview���ó���200  
        //������𣬵�����Ϊ����������view��ӵ����������У���view�Ĳ���Ҫ���Ӹ������Ĳ��֡�������view�Ŀ�Ⱥ͸߶�����û���κ�Ч���ˡ�
//        View child=layoutInflater.inflate(R.layout.myview, llparent, false);
        View child=layoutInflater.inflate(R.layout.myview, llparent, true);//�ظ�������������add��
//        llparent.addView(child);
    }
 

}
