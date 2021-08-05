package com.example.viewpagerwithcircleindicator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    private ViewPager2 mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        SetAdapter();

    }

    private void SetAdapter() {
        ViewAdapter viewAdapter=new ViewAdapter(getSupportFragmentManager(),getLifecycle());
        mViewPager.setAdapter(viewAdapter);
        new TabLayoutMediator(mTabLayout, mViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {

            }
        }).attach();
    }

    private void initView() {
        mViewPager = findViewById(R.id.viewPager2);
        mTabLayout = findViewById(R.id.tabLayout);
        mTabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}