package com.example.shaan.assignmentplanner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class HomeActivity extends FragmentActivity {

    ViewPager viewPager = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if (i == 0) {
            fragment = new AddFragment();
        }
        if (i == 1) {
            fragment = new CalendarFragment();
        }
        if (i == 2) {
            fragment = new TimeDistributionFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}

