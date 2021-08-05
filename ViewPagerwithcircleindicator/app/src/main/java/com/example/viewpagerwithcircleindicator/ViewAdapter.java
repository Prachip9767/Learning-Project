package com.example.viewpagerwithcircleindicator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewAdapter extends FragmentStateAdapter {

    public ViewAdapter(@NonNull FragmentManager fragmentManager, @NonNull  Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return FirstFragment.newInstance("","");
            case 1:
                return SecondFragment.newInstance("","");
            case 2:
                return ThirdFragment.newInstance("","");
            case 3:
                return FourthFragment.newInstance("","");
        }
        return FirstFragment.newInstance("","");
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
