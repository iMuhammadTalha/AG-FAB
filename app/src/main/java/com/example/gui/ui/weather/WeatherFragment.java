package com.example.gui.ui.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.gui.R;
import com.example.gui.ui.home.HomeViewModel;

public class WeatherFragment extends Fragment {
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_weather, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);

        final ImageButton weatherStation = root.findViewById(R.id.weather_station);


        weatherStation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_weather_station);
            }
        });
        return root;
    }
}
