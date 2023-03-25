package com.example.gui.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gui.HealthDiseaseFragment;
import com.example.gui.HealthHerbFragment;
import com.example.gui.HealthPesticideFragment;
import com.example.gui.HealthScanFragment;


public class HealthFragmentAdapter extends FragmentStateAdapter {

    public HealthFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new HealthDiseaseFragment();
        }
        if(position == 2){
            return new HealthHerbFragment();
        }
        if(position == 3){
            return new HealthScanFragment();
        }
        return new HealthPesticideFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}