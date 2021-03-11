package com.example.n_library.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.n_library.R;
import com.example.n_library.R2;
import com.example.n_library.bean.M1_Bean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class M1Adapter extends RecyclerView.Adapter<M1Adapter.ViewHolder>{


    private Context mContext;
    private List<M1_Bean> mList;
    private LayoutInflater inflater;

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public M1Adapter(Context mContext, List<M1_Bean> mList) {
        this.mContext = mContext;
        this.mList = mList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.layout_n_item, null));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        M1_Bean nBean = mList.get(position);
        holder.iv_photo.setImageResource(nBean.getUserPhoto());
        holder.tv_text.setText(nBean.getChatText());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R2.id.iv_photo)
        CircleImageView iv_photo;
        @BindView(R2.id.tv_text)
        TextView tv_text;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }

}
