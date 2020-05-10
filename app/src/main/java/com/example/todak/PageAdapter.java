package com.example.todak;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    public PageAdapter(FragmentManager fm)
    {
        super(fm);
    }

    public Fragment getItem(int i)
    {
        Fragment fragment = new DemoObjectFragment();
        Bundle args = new Bundle();

        args.putInt(DemoObjectFragment.ARG_OBJECT, i+1);
        fragment.setArguments(args);

        return fragment;
    }

    public int getCount()
    {
        return 100;
    }


    public CharSequence getPageTitle(int position)
    {
        return "OBJECT" + (position + 1);
    }
}
