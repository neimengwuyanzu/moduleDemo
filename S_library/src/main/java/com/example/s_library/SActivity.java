package com.example.s_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.helper.ARouterHelper;

@Route(path = ARouterHelper.PATH_S_RUN)
public class SActivity extends BaseActivity {

    @Override
    protected int createView() {
        return R.layout.activity_s;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

}