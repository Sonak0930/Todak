package com.example.todak;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class Swipmenu extends Fragment {

    PageAdapter demoCollectionPagerAdapter;
    ViewPager viewPager;

    public void onCreatedView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.main_cardlayout,container,false)
    }

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        demoCollectionPagerAdapter = new PageAdapter(getChildFragmentManager());
        viewPager = view.findViewById(R.id.pager);
        //pager는 main_cardlayout.xml의 ID
        viewPager.setAdapter(demoCollectionPagerAdapter);
    }


    class CollectionDemoFragment extends Fragment {

        public void onViewCreated(View view, Bundle savedInstanceState)
        {
            TableLayout tabLayout = view.findViewById(R.id.tab_layout);
            tabLayout.setupWithViewPager(viewPager);
        }

    }
}



public class DemoObjectFragment extends Fragment{
    public static final String ARG_OBJECT = "object";

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_collection_object,container,false);
    }

    public void onViewCreated(View view,Bundle savedInstanceState) {
        Bundle args = getArguments();
        ((TextView) view.findViewById(android.R.id.text1)).setText(Integer.toString(getId(ARG_OBJECT)));
    }
}

public class DemoCollectionPagerAdapter extends FragmentStatePagerAdapter
{

    public int getitem(int)
    {

    }
    public int getCount()
    {
        return 4;
    }

    public CharSequence getPageTitle(int position)
    {
        return "OBJECT" + (position +1);
    }

}
