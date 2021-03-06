package com.example.n_library.fragment;

import android.util.Log;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baselibrary.base.BaseFragment;
import com.example.n_library.R;
import com.example.n_library.R2;
import com.example.n_library.adapter.M1Adapter;
import com.example.n_library.bean.M1_Bean;
import com.example.n_library.ui.NInfoActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class M1_Fragment extends BaseFragment implements M1Adapter.OnItemClickListener {

    @BindView(R2.id.mListView)
    RecyclerView mNListView;

    private M1Adapter mM1Adapter;
    private List<M1_Bean> mList = new ArrayList<>();

    @Override
    protected int createView() {
        return R.layout.fragment_n;
    }

    @Override
    protected void initView() {
        mNListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mNListView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        mM1Adapter = new M1Adapter(getActivity(), mList);
        mM1Adapter.setOnItemClickListener(this);
        mNListView.setAdapter(mM1Adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("fragment 生命周期","N_onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment 生命周期","N_onPause");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d("fragment 生命周期","N_onHiddenChanged :  " + hidden);
    }

    @Override
    protected void initData() {
        addNBean("？？？");
        addNBean("？？");
        addNBean("？");

        mM1Adapter.notifyDataSetChanged();
    }

    @Override
    protected void initListener() {

    }

    /**
     * 添加数据
     *
     * @param text
     */
    private void addNBean(String text) {
        M1_Bean chatBean = new M1_Bean();
        chatBean.setUserId("1");
        chatBean.setChatText(text);
        chatBean.setUserPhoto(R.drawable.ic_launcher_background);
        mList.add(chatBean);
    }

    @Override
    public void onClick(int position) {
        //模拟将用户ID传递
        NInfoActivity.startNInfo(getActivity(), mList.get(position).getUserId());
    }
}
