package com.example.viewpagertab;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentB extends Fragment {
    private RecyclerView mRecyclerView;
    private ViewPagerAdapter mAdapter;
    private List<String> placeList;

    public static FragmentB newInstance() {
        return new FragmentB();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setAdapter();
    }

    private void buildList() {
        placeList = new ArrayList<>();
        placeList.add("Goa");
        placeList.add("Nasirabad");
        placeList.add("Nashik");
        placeList.add("Nandeed");
        placeList.add("Hydrabad");
        placeList.add("Manali");
        placeList.add("Pune");
        placeList.add("Goa");
        placeList.add("Nasirabad");
        placeList.add("Nashik");
        placeList.add("Nandeed");
        placeList.add("Hydrabad");
        placeList.add("Manali");
        placeList.add("Pune");
        placeList.add("Goa");
        placeList.add("Nasirabad");
        placeList.add("Nashik");
        placeList.add("Nandeed");
        placeList.add("Hydrabad");
        placeList.add("Manali");
        placeList.add("Pune");
    }

    private void setAdapter() {
        mAdapter = new ViewPagerAdapter(placeList);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }
    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.recyclerViewFragB);
    }
}