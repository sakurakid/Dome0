package com.example.hasee.dome0.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by hasee on 2018/3/27.
 */

public class MainHeaderAdApter extends PagerAdapter{
    protected Context context;
    protected List<ImageView>imageViews;

     public MainHeaderAdApter(Context context, List<ImageView>imageViews){
         this.context = context;
         this.imageViews = imageViews;
     }
    @Override
    public int getCount() {
        return null!=imageViews?imageViews.size():0;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(imageViews.get(position));
        return imageViews.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
         container.removeView(imageViews.get(position));

    }
}
