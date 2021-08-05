package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends Fragment {
    private static final String TextD = "Text";
    private static final String HeadingD = "Heading";
    private String mHeadingD;
    private String mTextD;
    private TextView mtvHeadingFragD;
    private TextView mtvTextFragD;

    public FourthFragment() {
        // Required empty public constructor
    }

    public static FourthFragment newInstance(String heading, String text) {
        FourthFragment fragment = new FourthFragment();
        Bundle args = new Bundle();
        args.putString(HeadingD, heading);
        args.putString(TextD, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mHeadingD=getArguments().getString(HeadingD);
            mTextD=getArguments().getString(TextD);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setData();
    }
    private void setData() {
        mtvHeadingFragD.setText(mHeadingD);
        mtvTextFragD.setText(mTextD);
    }
    private void initView(View view) {
        mtvHeadingFragD = view.findViewById(R.id.tvHeadingFragD);
        mtvTextFragD = view.findViewById(R.id.tvTextFragD);
    }
}