package com.example.viewpagertab;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PagerViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvData;

    public PagerViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvData=itemView.findViewById(R.id.tvText);
    }
    public void setData(String s){
        mTvData.setText(s);
    }
}
