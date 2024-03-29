package com.example.gui.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gui.InputFertilizerFragment;
import com.example.gui.InputPesticidesFragment;
import com.example.gui.InputSeedFragment;

public class InputFragmentAdapter extends FragmentStateAdapter {

    public InputFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new InputFertilizerFragment();
        }
        if(position == 2){
            return new InputPesticidesFragment();
        }
        return new InputSeedFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}