package com.example.gui.ui.input;

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
import com.example.gui.ui.adapter.InputFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class InputFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private InputFragmentAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_input, container, false);

        tabLayout = root.findViewById(R.id.tabLayout);
        viewPager2 = root.findViewById(R.id.viewPager2);

//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.seed));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.fertilizer));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.pesticide));
        View view1 = getLayoutInflater().inflate(R.layout.customtab_seed, null);

        view1.findViewById(R.id.icon_seed).setBackgroundResource(R.drawable.seed_color);

        tabLayout.addTab(tabLayout.newTab().setCustomView(view1));

        View view2 = getLayoutInflater().inflate(R.layout.customtab_fertilizer, null);

        view2.findViewById(R.id.icon_fertilizer).setBackgroundResource(R.drawable.fertilizer_color);

        tabLayout.addTab(tabLayout.newTab().setCustomView(view2));

        View view3 = getLayoutInflater().inflate(R.layout.customtab_pesticide, null);

        view3.findViewById(R.id.icon_pesticide).setBackgroundResource(R.drawable.pesticide_color);

        tabLayout.addTab(tabLayout.newTab().setCustomView(view3));

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        adapter = new InputFragmentAdapter(fragmentManager, getLifecycle());
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
