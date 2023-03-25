package com.example.gui.ui.irrigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gui.R;
import com.example.gui.ui.adapter.IrrigationFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class IrrigationFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private IrrigationFragmentAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_irrigation, container, false);

        tabLayout = root.findViewById(R.id.tabLayout);
        viewPager2 = root.findViewById(R.id.viewPager2);

        tabLayout.addTab(tabLayout.newTab().setText("Scheduled"));
        tabLayout.addTab(tabLayout.newTab().setText("Real Time"));

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        adapter = new IrrigationFragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        return root;
    }
}
