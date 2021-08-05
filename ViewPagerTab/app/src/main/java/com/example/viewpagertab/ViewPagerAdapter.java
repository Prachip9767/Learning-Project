package com.example.viewpagertab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<PagerViewHolder> {
    private final List<String> stringList;

    public ViewPagerAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public PagerViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new PagerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  PagerViewHolder holder, int position) {
        holder.setData(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }
}
