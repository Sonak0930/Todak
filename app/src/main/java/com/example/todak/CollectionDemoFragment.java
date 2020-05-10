package com.example.todak;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import androidx.fragment.app.Fragment;

public class CollectionDemoFragment extends Fragment {

    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        TableLayout tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

}
