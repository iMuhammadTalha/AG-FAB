package com.example.gui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.gui.ui.home.HomeViewModel;


public class InstantFragment extends Fragment {
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_instant, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);

        final ImageButton video = root.findViewById(R.id.video);
        final ImageButton chat = root.findViewById(R.id.chat);
        final ImageButton news = root.findViewById(R.id.news);
        final ImageButton machinery = root.findViewById(R.id.machinery);
        final ImageButton harshWeather = root.findViewById(R.id.harsh_weather);

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_video);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_chat);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_news);
            }
        });

        machinery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_machinery);
            }
        });
        harshWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getActivity(), R.id.nav_instant).navigate(R.id.nav_harsh_weather);
            }
        });
        return root;
    }
}