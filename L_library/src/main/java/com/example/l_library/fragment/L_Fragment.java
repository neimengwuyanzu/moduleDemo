package com.example.l_library.fragment;

import android.util.Log;
import android.widget.TextView;

import com.example.baselibrary.base.BaseFragment;
import com.example.l_library.R;
import com.example.l_library.R2;

import butterknife.BindView;

public class L_Fragment extends BaseFragment {

    @BindView(R2.id.tv_title)
    TextView tvTitle;
    @BindView(R2.id.tv_l_1)
    TextView tvL1;
    @BindView(R2.id.tv_l_2)
    TextView tvL2;
    @BindView(R2.id.tv_l_3)
    TextView tvL3;
    @BindView(R2.id.tv_l_4)
    TextView tvL4;
    @BindView(R2.id.tv_l_5)
    TextView tvL5;
    @BindView(R2.id.tv_l_6)
    TextView tvL6;


    @Override
    protected int createView() {
        return R.layout.fragment_l;
    }

    @Override
    protected void initView() {

    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment 生命周期","L_onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment 生命周期","L_onPause");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d("fragment 生命周期","L_onHiddenChanged :  " + hidden);
    }

    @Override
    protected void initData() {
        tvTitle.setText("???");
        tvL1.setText("?");
        tvL2.setText("??");
        tvL3.setText("???");
        tvL4.setText("????");
        tvL5.setText("?????");
        tvL6.setText("??????");
    }

    @Override
    protected void initListener() {

    }
}
