package com.example.gui.ui.input;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gui.R;
import com.example.gui.ui.adapter.InputFragmentAdapter;

public class InputFragment extends Fragment {

    private ViewPager2 viewPager2;
    private InputFragmentAdapter adapter;

    private FrameLayout frameSeed, frameFertilizer, framePesticide;
    private Button buttonSeed, buttonFertilizer, buttonPesticide;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_input, container, false);

        frameSeed = root.findViewById(R.id.frame_seed);
        frameFertilizer = root.findViewById(R.id.frame_fertilizer);
        framePesticide = root.findViewById(R.id.frame_pesticide);

        buttonSeed = root.findViewById(R.id.button_seed);
        buttonFertilizer = root.findViewById(R.id.button_fertilizer);
        buttonPesticide = root.findViewById(R.id.button_pesticide);

        viewPager2 = root.findViewById(R.id.viewPager2);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        adapter = new InputFragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        buttonSeed.setOnClickListener(v -> viewPager2.setCurrentItem(0));
        buttonFertilizer.setOnClickListener(v -> viewPager2.setCurrentItem(1));
        buttonPesticide.setOnClickListener(v -> viewPager2.setCurrentItem(2));

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                resetButtons();

                switch (position) {
                    case 0:
                        frameSeed.setForeground(getResources().getDrawable(R.drawable.selected_overlay));
                        break;
                    case 1:
                        frameFertilizer.setForeground(getResources().getDrawable(R.drawable.selected_overlay));
                        break;
                    case 2:
                        framePesticide.setForeground(getResources().getDrawable(R.drawable.selected_overlay));
                        break;
                }
            }
        });

        return root;
    }

    private void resetButtons() {
        frameSeed.setForeground(null);
        frameFertilizer.setForeground(null);
        framePesticide.setForeground(null);
    }
}
