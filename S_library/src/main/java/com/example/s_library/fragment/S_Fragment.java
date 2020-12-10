package com.example.s_library.fragment;

import android.util.Log;
import android.widget.TextView;

import com.example.baselibrary.base.BaseFragment;
import com.example.s_library.R;
import com.example.s_library.R2;

import butterknife.BindView;

public class S_Fragment extends BaseFragment {

    @BindView(R2.id.tv_s_1)
    TextView tvS1;
    @BindView(R2.id.tv_s_2)
    TextView tvS2;
    @BindView(R2.id.tv_s_3)
    TextView tvS3;
    @BindView(R2.id.tv_s_4)
    TextView tvS4;

    @Override
    protected int createView() {
        return R.layout.fragment_s;
    }

    @Override
    protected void initView() {

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment 生命周期","S_onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment 生命周期","S_onPause");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d("fragment 生命周期","S_onHiddenChanged :  " + hidden);
    }

    @Override
    protected void initData() {
        tvS1.setText("N");
        tvS2.setText("M");
        tvS3.setText("S");
        tvS4.setText("L");
    }

    @Override
    protected void initListener() {

    }
}
