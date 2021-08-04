package com.example.fragmanetevents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EventListener{
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchEventDetailsFragment();
    }
    private void launchEventDetailsFragment() {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        EventDetailsFragment eventDetailsFragment = new EventDetailsFragment();
        fragmentTransaction.add(R.id.container,eventDetailsFragment,"EventDetails").commit();
    }


    @Override
    public void launchTimeAndDateFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TimeandDateFragment timeAndDateFragment = new TimeandDateFragment();
        timeAndDateFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,timeAndDateFragment,"TimeAndDate").addToBackStack("").commit();

    }

    @Override
    public void launchPriceDetailsFragment(Bundle bundle) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       PraiceDetailFragment priceDetailsFragment = new PraiceDetailFragment();
        priceDetailsFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,priceDetailsFragment,"PriceDetailsFragment").addToBackStack("").commit();
    }
}