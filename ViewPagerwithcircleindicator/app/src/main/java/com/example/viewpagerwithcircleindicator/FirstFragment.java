package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    private static final String Text = "Text";
    private static final String Heading = "Heading";
    private String mHeading;
    private String mText;
    private TextView mtvHeadingFragA;
    private TextView mtvTextFragA;

    public static FirstFragment newInstance(String heading, String text) {
        FirstFragment firstFragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(Heading, heading);
        args.putString(Text, text);
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            mHeading=getArguments().getString(Heading);
            mText=getArguments().getString(Text);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setData();
    }

    private void setData() {
        mtvHeadingFragA.setText(mHeading);
        mtvTextFragA.setText(mText);
    }

    private void initView(View view) {
        mtvHeadingFragA = view.findViewById(R.id.tvHeadingFragA);
        mtvTextFragA = view.findViewById(R.id.tvTextFragA);
    }

    public FirstFragment() {

    }
}