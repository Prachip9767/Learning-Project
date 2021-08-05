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


public class FragmentC extends Fragment {
    private RecyclerView mRecyclerView;
    private ViewPagerAdapter mAdapter;
    private List<String> touristPlaceList;


    public static FragmentC newInstance() {
        return new FragmentC();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setAdapter();
    }

    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.recyclerViewFragC);
    }
    private void buildList() {
        touristPlaceList = new ArrayList<>();
        touristPlaceList.add("Amber Palace");
        touristPlaceList.add("Sri Hamandir");
        touristPlaceList.add("Red fort");
        touristPlaceList.add("Periyar National Part");
        touristPlaceList.add("Thekkady");
        touristPlaceList.add("Pune");
        touristPlaceList.add("Mysor");
        touristPlaceList.add("Qutab minar");
        touristPlaceList.add("Munnar");
        touristPlaceList.add("coalkers walk");
        touristPlaceList.add("love lake");
        touristPlaceList.add("abhey falls");
        touristPlaceList.add("Taj mahal");
        touristPlaceList.add("Ladakh");
        touristPlaceList.add("Mysore Palace");
    }

    private void setAdapter() {
        mAdapter = new ViewPagerAdapter(touristPlaceList);
        mRecyclerView.setAdapter(mAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }
}