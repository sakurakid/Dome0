package com.example.hasee.dome0.util;

import android.content.Context;
import android.widget.ImageView;

import com.example.hasee.dome0.entity.Menu;

import java.util.ArrayList;
import java.util.List;

/**数据来源
 * Created by hasee on 2018/3/27.
 */

public class DateUtil {

    public static List<ImageView> getHeaderAddInfo(Context context,int icons[]){
        List<ImageView> datas = new ArrayList<>();
       for(int i = 0;i < icons.length;i++){
           ImageView icon = new ImageView(context);
           icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
           icon.setImageResource(icons[i]);
           datas.add(icon);
       }

        return datas;
    }

    /**
     *
     * @param icons
     * @param names
     * @return
     */
    public static List<Menu> getMainMenu(int icons[], String names[]){
        List<Menu>  menus=new ArrayList<>();

        for (int i = 0; i <icons.length ; i++) {
            Menu menu=new Menu(icons[i],names[i]);
            menus.add(menu);
        }
        return menus;
    }
}
