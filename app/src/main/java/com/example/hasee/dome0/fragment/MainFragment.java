package com.example.hasee.dome0.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import com.example.hasee.dome0.R;
import com.example.hasee.dome0.adapter.MainHeaderAdApter;
import com.example.hasee.dome0.adapter.MainMenuAdapter;
import com.example.hasee.dome0.util.DateUtil;

/**主界面的
 * Created by hasee on 2018/3/25.
 */

public class MainFragment extends Fragment {
    protected  int [] icons={R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,R.mipmap.header_pic_ad1};

    protected ViewPager mViewPager;
    //菜单的图标
    protected  int [] menuIons={R.mipmap.menu_airport,R.mipmap.menu_car
            ,R.mipmap.menu_course,R.mipmap.menu_hatol,
            R.mipmap.menu_nearby,R.mipmap.menu_trav,
            R.mipmap.menu_ticket,R.mipmap.menu_train};
    protected  String [] menus;
    protected RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus = this.getActivity().getResources().getStringArray(R.array.main_menu);
        mViewPager= (ViewPager) getView().findViewById(R.id.vpager_main_header_ad);
        recyclerView = (RecyclerView)getView().findViewById(R.id.recycleview_main_menu);
        MainHeaderAdApter adApter = new MainHeaderAdApter(getActivity(), DateUtil.getHeaderAddInfo(getActivity(),icons));
        mViewPager.setAdapter(adApter);
        //菜单
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter = new MainMenuAdapter(getActivity(),DateUtil.getMainMenu(menuIons,menus));
        recyclerView.setAdapter(mainMenuAdapter);
    }
}
