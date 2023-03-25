package com.example.gui.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gui.NutritionRealtimeFragment;
import com.example.gui.NutritionScheduledFragment;

public class NutritionFragmentAdapter extends FragmentStateAdapter {

    public NutritionFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new NutritionRealtimeFragment();
        }
        return new NutritionScheduledFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
