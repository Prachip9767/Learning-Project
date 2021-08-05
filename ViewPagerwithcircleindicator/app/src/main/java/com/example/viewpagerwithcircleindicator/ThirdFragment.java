package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {
    private static final String TextC = "Text";
    private static final String HeadingC = "Heading";
    private String mHeadingC;
    private String mTextC;
    private TextView mtvHeadingFragC;
    private TextView mtvTextFragC;

    public ThirdFragment() {
        // Required empty public constructor
    }
    public static ThirdFragment newInstance(String heading, String text) {
        ThirdFragment fragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putString(HeadingC,heading);
        args.putString(TextC,text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mHeadingC=getArguments().getString(HeadingC);
            mTextC=getArguments().getString(TextC);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setData();
    }
    private void setData() {
        mtvHeadingFragC.setText(mHeadingC);
        mtvTextFragC.setText(mTextC);
    }
    private void initView(View view) {
        mtvHeadingFragC = view.findViewById(R.id.tvHeadingFragC);
        mtvTextFragC = view.findViewById(R.id.tvTextFragC);
    }


}