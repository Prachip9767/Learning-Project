package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    private static final String TextB = "TextB";
    private static final String HeadingB = "HeadingB";
    private String mHeadingB;
    private String mTextB;
    private TextView mtvHeadingFragB;
    private TextView mtvTextFragB;

    public static SecondFragment newInstance(String heading, String text) {
        SecondFragment secondFragment = new SecondFragment();
        Bundle args = new Bundle();
        args.putString(HeadingB, heading);
        args.putString(TextB, text);
        secondFragment.setArguments(args);
        return secondFragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            mHeadingB=getArguments().getString(HeadingB);
            mTextB=getArguments().getString(TextB);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setData();
    }
    private void setData() {
        mtvHeadingFragB.setText(mHeadingB);
        mtvTextFragB.setText(mTextB);
    }
    private void initView(View view) {
        mtvHeadingFragB = view.findViewById(R.id.tvHeadingFragB);
        mtvTextFragB = view.findViewById(R.id.tvTextFragB);
    }

    public SecondFragment(){
    }
}