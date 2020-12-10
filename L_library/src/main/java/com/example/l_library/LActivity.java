package com.example.l_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.helper.ARouterHelper;

@Route(path = ARouterHelper.PATH_L_RUN)
public class LActivity extends BaseActivity {

    @Override
    protected int createView() {
        return R.layout.activity_l;
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