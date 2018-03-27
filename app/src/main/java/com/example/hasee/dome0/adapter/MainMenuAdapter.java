package com.example.hasee.dome0.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hasee.dome0.R;
import com.example.hasee.dome0.entity.Menu;

import java.util.List;

/**
 * Created by hasee on 2018/3/27.
 */

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewholder> {
    protected Context context;
    protected List<Menu> menus;
    //通过构造方法将上下文和 东西传过去
    public MainMenuAdapter(Context context, List<Menu> menus){
        this.context = context;
        this.menus = menus;
    }
    //创建一个ViewHolder并返回  绑定子布局
    @Override
    public MainMenuViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));
    }


   //将数据和界面绑定
    @Override
    public void onBindViewHolder(MainMenuViewholder holder, int position) {
        Menu menu=menus.get(position);
        holder.mImgMenuIcon.setImageResource(menu.icon);
        holder.mTxtMenuName.setText(menu.menuName);

    }

  //获取的数量
    @Override
    public int getItemCount() {
        return null!=menus?menus.size():0;
    }
}
/**
 * 这个是自定义的ViewHolder 持有每个Item的界面元素
 * 获取控件的实例
 */
class MainMenuViewholder extends RecyclerView.ViewHolder {
        public ImageView mImgMenuIcon;
        public TextView mTxtMenuName;
        public MainMenuViewholder(View itemView) {
            super(itemView);
            mImgMenuIcon = (ImageView) itemView.findViewById(R.id.img_menu_icon);
            mTxtMenuName = (TextView) itemView.findViewById(R.id.text_menu_name);
        }
    }
