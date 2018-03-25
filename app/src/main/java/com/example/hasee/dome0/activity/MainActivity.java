package com.example.hasee.dome0.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.hasee.dome0.R;
import com.example.hasee.dome0.fragment.FindFragment;
import com.example.hasee.dome0.fragment.MainFragment;
import com.example.hasee.dome0.fragment.MeFragment;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenuMe;

    protected MainFragment mainFragment = new MainFragment();
    protected MeFragment meFragment = new MeFragment();
    protected FindFragment findFragment = new FindFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //获取碎片的管理类
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content, mainFragment)
                .add(R.id.container_content, findFragment)
                .hide(findFragment)
                .add(R.id.container_content, meFragment)
                .hide(meFragment)
                .commit();


        // 碎片添加  默认显示首页  其他隐藏--        提交

    }

    /**
     * 初始化视图的
     */

    public void initView(){
        mMenuMain = (LinearLayout)this.findViewById(R.id.menu_main);
        mMenuFind = (LinearLayout)this.findViewById(R.id.menu_find);
        mMenuMe = (LinearLayout)this.findViewById(R.id.menu_me);

        mMenuMain.setOnClickListener(this);
        mMenuMe.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_main:  //首页
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(mainFragment)
                        .hide(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
            case R.id.menu_me:  //我的
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mainFragment)
                        .hide(findFragment)
                        .show(meFragment)
                        .commit();
                break;
            case R.id.menu_find: //发现
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mainFragment)
                        .show(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
        }
    }
}
