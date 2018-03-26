package com.example.hasee.dome0.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hasee.dome0.R;
import com.example.hasee.dome0.activity.LoginActivity;

/**
 * Created by hasee on 2018/3/25.
 */

public class MeFragment extends Fragment {
    protected Button button;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button=getView().findViewById(R.id.bt_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(getActivity(), LoginActivity.class);
                startActivity(login);
            }
        });
    }
}
