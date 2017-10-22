package com.example.hoshiko.fragment_inclass;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DUNG on 22-Oct-17.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    public static  final int FRAGMENT_COUNT = 2;
    public MyPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }


    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return  new FragmentOne();

            case  1:
                return  new FragmentTwo();

            default:
                return  null;
        }
    }
    @Override
    public int getCount()
    {
        return FRAGMENT_COUNT;
    }

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Fragment 1";
            case 1:
                return  "Fragment 2";
            default:
                return "";

        }
    }
}
