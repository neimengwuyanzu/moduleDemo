package com.example.baselibrary.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    //视图
    protected View mView;

    //创建View
    protected abstract int createView();

    //初始化View
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //初始化监听
    protected abstract void initListener();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(createView(),null);
        ButterKnife.bind(this,mView);
        initView();
        initData();
        initListener();
        return mView;
    }
}
