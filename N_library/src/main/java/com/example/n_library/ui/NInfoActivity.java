package com.example.n_library.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.baselibrary.base.BaseActivity;
import com.example.n_library.R;
import com.example.n_library.R2;

import butterknife.BindView;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

public class NInfoActivity extends BaseActivity {


    public static final String USER_KEY = "userId";

    public static void startNInfo(Context mContext, String userId) {
        Intent intent = new Intent(mContext, NInfoActivity.class);
        intent.putExtra(USER_KEY, userId);
        mContext.startActivity(intent);
    }

    @BindView(R2.id.iv_photo)
    CircleImageView iv_photo;


    @Override
    protected int createView() {
        return R.layout.activity_n_info;
    }


    @Override
    protected void initView() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("聊天详情");
    }

    @Override
    protected void initData() {
        String userId = getIntent().getStringExtra(USER_KEY);
        if (!TextUtils.isEmpty(userId)) {
            //加载数据
            iv_photo.setImageResource(R.drawable.img_user);
        }
    }

    @Override
    protected void initListener() {

    }

    @OnClick(R2.id.iv_photo)
    void PhotoClick() {
        Toast.makeText(this, "点击头像", Toast.LENGTH_SHORT).show();
    }

}