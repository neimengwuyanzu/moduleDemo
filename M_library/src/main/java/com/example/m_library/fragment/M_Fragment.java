package com.example.m_library.fragment;

import android.util.Log;
import android.widget.TextView;

import com.example.baselibrary.base.BaseFragment;
import com.example.m_library.R;
import com.example.m_library.R2;

import butterknife.BindView;

public class M_Fragment extends BaseFragment {

    @BindView(R2.id.tv_m_1)
    TextView tvM1;
    @BindView(R2.id.tv_m_2)
    TextView tvM2;
    @BindView(R2.id.tv_m_3)
    TextView tvM3;
    @BindView(R2.id.tv_m_4)
    TextView tvM4;

    @Override
    protected int createView() {
        return R.layout.fragment_m;
    }


    @Override
    protected void initView() {
        this.isResumed();
        this.isHidden();
        this.isVisible();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment 生命周期","M_onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment 生命周期","M_onPause");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d("fragment 生命周期","M_onHiddenChanged :  " + hidden);
    }

    @Override
    protected void initData() {
        tvM1.setText("N");
        tvM2.setText("M");
        tvM3.setText("S");
        tvM4.setText("L");
    }

    @Override
    protected void initListener() {

    }
}
