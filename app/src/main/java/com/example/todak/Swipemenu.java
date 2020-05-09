package com.example.todak;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class Swipmenu extends Fragment {

    DemoCollectionPagerAdapter demoCollectionPagerAdapter;
    ViewPager viewPager;

    public void onCreatedView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.main_cardlayout,container,false)
    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        demoCollectionPagerAdapter = new DemoCollectionPagerAdapter(getChildFragmentManager());
        viewPager = view.findViewById(R.id.pager);
        //pager는 main_cardlayout.xml의 ID
        viewPager.setAdapter(demoCollectionPagerAdapter);
    }
}

public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter{

    public DemoCollectionPagerAdapter(FragmentManager fm)
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

public class DemoObjectFragment extends Fragment{
    public static final String ARG_OBJECT = "object";

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_collection_object,container,false);
    }

    public void onViewCreated(View view,Bundle savedInstanceState)
        Bundle args = getArguments();
    ((TextView) view.findviewById(android.R.id.text1)).

}
