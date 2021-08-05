package com.example.viewpagertab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class FragmentA extends Fragment {
    private RecyclerView mRecyclerView;
    ViewPagerAdapter pagerAdapter;
    private List<String> nameModelList;

    public static FragmentA newInstance() {
        return new FragmentA();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildList();
        setAdapter();
    }

    private void initViews(View view) {
        mRecyclerView = view.findViewById(R.id.recyclerViewFragA);
    }

    private void buildList() {
        nameModelList = new ArrayList<>();
        nameModelList.add(("Ram"));
        nameModelList.add("Sita");
        nameModelList.add("Laxman");
        nameModelList.add(("Ram"));
        nameModelList.add("Sita");
        nameModelList.add("Laxman");
        nameModelList.add(("Ram"));
        nameModelList.add("Sita");
        nameModelList.add("Laxman");
        nameModelList.add(("Ram"));
        nameModelList.add("Sita");
        nameModelList.add("Laxman");
        nameModelList.add(("Ram"));
        nameModelList.add("Sita");
        nameModelList.add("Laxman");
    }

    private void setAdapter() {
        pagerAdapter = new ViewPagerAdapter(nameModelList);
        mRecyclerView.setAdapter(pagerAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(linearLayoutManager);
    }
}