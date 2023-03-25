package com.example.gui.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.example.gui.IrrigationRealtimeFragment;
import com.example.gui.IrrigationScheduledFragment;

public class IrrigationFragmentAdapter extends FragmentStateAdapter {

    public IrrigationFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new IrrigationRealtimeFragment();
        }
        return new IrrigationScheduledFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}