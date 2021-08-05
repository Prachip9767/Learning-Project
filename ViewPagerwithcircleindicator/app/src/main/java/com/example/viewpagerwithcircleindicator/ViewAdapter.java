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
                return FirstFragment.newInstance("Write on the go","Get stuff done with or without an internet connection.");
            case 1:
                return SecondFragment.newInstance("Share and edit together","Write on you own or invite more people to contribute.");
            case 2:
                return ThirdFragment.newInstance("Automatically save to the web","Never lose your progress, so you can keep working from any computer or device.");
            case 3:
                return FourthFragment.newInstance("Edit World Documents","Open, edit and save Word files -all within Docs.");
        }
        return FirstFragment.newInstance("","");
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
