package com.example.shaan.assignmentplanner;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Window;


public class HomeActivity extends FragmentActivity {

    ViewPager viewPager = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_home);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

}

class MyAdapter extends FragmentStatePagerAdapter {


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

    public CharSequence getPageTitle(int position) {
        String title = new String();
        if (position == 0) {
            return "Add Assignment";
        }
        if (position == 1) {
            return "Calendar";
        }
        if (position == 2) {
            return "Time Distribution";
        }
        return null;

    }
}

