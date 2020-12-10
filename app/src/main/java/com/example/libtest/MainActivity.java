package com.example.libtest;


import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.baselibrary.base.BaseActivity;
import com.example.baselibrary.helper.ARouterHelper;
import com.example.l_library.fragment.L_Fragment;
import com.example.m_library.fragment.M_Fragment;
import com.example.n_library.fragment.N_Fragment;
import com.example.s_library.fragment.S_Fragment;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.iv_n)
    ImageView ivN;
    @BindView(R.id.tv_n)
    TextView tvN;
    @BindView(R.id.ll_n)
    LinearLayout llN;

    @BindView(R.id.iv_m)
    ImageView ivM;
    @BindView(R.id.tv_m)
    TextView tvM;
    @BindView(R.id.ll_m)
    LinearLayout llM;

    @BindView(R.id.iv_s)
    ImageView ivS;
    @BindView(R.id.tv_s)
    TextView tvS;
    @BindView(R.id.ll_s)
    LinearLayout llS;

    @BindView(R.id.iv_l)
    ImageView ivL;
    @BindView(R.id.tv_l)
    TextView tvL;
    @BindView(R.id.ll_l)
    LinearLayout llL;


    //N
    private N_Fragment mNFragment;
    private FragmentTransaction mNTransaction;

    //M
    private M_Fragment mMFragment;
    private FragmentTransaction mMTransaction;

    //S
    private S_Fragment mSFragment;
    private FragmentTransaction mSTransaction;

    //L
    private L_Fragment mLFragment;
    private FragmentTransaction mLTransaction;

    @Override
    protected int createView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initFragment();
        switchMainTab(0);
    }

    @Override
    protected void initData() {
        tvN.setText("N");
        tvM.setText("M");
        tvS.setText("S");
        tvL.setText("L");
    }

    @Override
    protected void initListener() {

    }

    @OnLongClick({R.id.ll_n,
            R.id.ll_m,
            R.id.ll_s,
            R.id.ll_l})
    public void onViewLongClick(View v) {
        switch (v.getId()) {
            case R.id.ll_n:
                showToast("n");
                Log.d("fragment 生命周期", "N长按");
                break;
            case R.id.ll_m:
                showToast("m");
                Log.d("fragment 生命周期", "M长按");
                break;
            case R.id.ll_s:
                showToast("s");
                Log.d("fragment 生命周期", "S长按");
                break;
            case R.id.ll_l:
                showToast("l");
                Log.d("fragment 生命周期", "L长按");
                break;
        }
    }

    private void showToast(String n) {
        Toast.makeText(MainActivity.this, n, Toast.LENGTH_SHORT).show();
    }

    @OnClick({R.id.ll_n,
            R.id.ll_m,
            R.id.ll_s,
            R.id.ll_l})
    public void onViewClick(View v) {
        switch (v.getId()) {
            case R.id.ll_n:
                switchMainTab(0);
                break;
            case R.id.ll_m:
                switchMainTab(1);
                break;
            case R.id.ll_s:
                switchMainTab(2);
                break;
            case R.id.ll_l:
                switchMainTab(3);
                break;
        }
    }


    /**
     * 初始化Fragment
     */
    private void initFragment() {

        if (mNFragment == null) {
            mNFragment = new N_Fragment();
            mNTransaction = getSupportFragmentManager().beginTransaction();
            mNTransaction.add(R.id.mContentLayout, mNFragment);
            mNTransaction.commit();
        }

        if (mMFragment == null) {
            mMFragment = new M_Fragment();
            mMTransaction = getSupportFragmentManager().beginTransaction();
            mMTransaction.add(R.id.mContentLayout, mMFragment);
            mMTransaction.commit();
        }

        if (mSFragment == null) {
            mSFragment = new S_Fragment();
            mSTransaction = getSupportFragmentManager().beginTransaction();
            mSTransaction.add(R.id.mContentLayout, mSFragment);
            mSTransaction.commit();
        }

        if (mLFragment == null) {
            mLFragment = new L_Fragment();
            mLTransaction = getSupportFragmentManager().beginTransaction();
            mLTransaction.add(R.id.mContentLayout, mLFragment);
            mLTransaction.commit();
        }
    }


    /**
     * 切换Tab
     *
     * @param index
     */
    private void switchMainTab(int index) {
        switch (index) {
            case 0:
                showFragment(mNFragment);

                ivN.setImageResource(R.drawable.img_wechat_p);
                ivM.setImageResource(R.drawable.img_contact);
                ivS.setImageResource(R.drawable.img_find);
                ivL.setImageResource(R.drawable.img_me);

                tvN.setTextColor(getResources().getColor(R.color.colorMain));
                tvM.setTextColor(Color.BLACK);
                tvS.setTextColor(Color.BLACK);
                tvL.setTextColor(Color.BLACK);

                setTitleBarName("N");

                break;
            case 1:
                showFragment(mMFragment);

                ivN.setImageResource(R.drawable.img_wechat);
                ivM.setImageResource(R.drawable.img_contact_p);
                ivS.setImageResource(R.drawable.img_find);
                ivL.setImageResource(R.drawable.img_me);

                tvN.setTextColor(Color.BLACK);
                tvM.setTextColor(getResources().getColor(R.color.colorMain));
                tvS.setTextColor(Color.BLACK);
                tvL.setTextColor(Color.BLACK);

                setTitleBarName("M");

                break;
            case 2:
                showFragment(mSFragment);

                ivN.setImageResource(R.drawable.img_wechat);
                ivM.setImageResource(R.drawable.img_contact);
                ivS.setImageResource(R.drawable.img_find_p);
                ivL.setImageResource(R.drawable.img_me);

                tvN.setTextColor(Color.BLACK);
                tvM.setTextColor(Color.BLACK);
                tvS.setTextColor(getResources().getColor(R.color.colorMain));
                tvL.setTextColor(Color.BLACK);

                setTitleBarName("S");

                break;
            case 3:
                showFragment(mLFragment);

                ivN.setImageResource(R.drawable.img_wechat);
                ivM.setImageResource(R.drawable.img_contact);
                ivS.setImageResource(R.drawable.img_find);
                ivL.setImageResource(R.drawable.img_me_p);

                tvN.setTextColor(Color.BLACK);
                tvM.setTextColor(Color.BLACK);
                tvS.setTextColor(Color.BLACK);
                tvL.setTextColor(getResources().getColor(R.color.colorMain));

                setTitleBarName("L");

                break;
        }
    }

    /**
     * 显示Fragment
     *
     * @param fragment
     */
    private void showFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            hideAllFragment(transaction);
            transaction.show(fragment);
            transaction.commit();
        }
    }


    /**
     * 隐藏所有的Fragment
     *
     * @param transaction
     */
    private void hideAllFragment(FragmentTransaction transaction) {
        if (mNFragment != null) {
            transaction.hide(mNFragment);
        }
        if (mMFragment != null) {
            transaction.hide(mMFragment);
        }
        if (mSFragment != null) {
            transaction.hide(mSFragment);
        }
        if (mLFragment != null) {
            transaction.hide(mLFragment);
        }
    }

    /**
     * 设置标题名称
     *
     * @param name
     */
    private void setTitleBarName(String name) {
        getSupportActionBar().setTitle(name);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_n:
                ARouterHelper.getInstance().build(ARouterHelper.PATH_N_RUN);
                break;
            case R.id.menu_m:
                ARouterHelper.getInstance().build(ARouterHelper.PATH_M_RUN);
                break;
            case R.id.menu_s:
                ARouterHelper.getInstance().build(ARouterHelper.PATH_S_RUN);
                break;
            case R.id.menu_l:
                ARouterHelper.getInstance().build(ARouterHelper.PATH_L_RUN);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}