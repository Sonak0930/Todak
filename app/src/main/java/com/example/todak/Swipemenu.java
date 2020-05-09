package com.example.todak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
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
        viewPager =
    }
}

public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter{

}

public class DemoObjectFragment extends Fragment{

}
