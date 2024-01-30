package com.example.gui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InputPesticidesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InputPesticidesFragment extends Fragment {

    private ImageView map1, map2, map3;
    private CardView card1, card2, card3;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public InputPesticidesFragment() {
        // Required empty public constructor
    }

    public static InputPesticidesFragment newInstance(String param1, String param2) {
        InputPesticidesFragment fragment = new InputPesticidesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_input_pesticides, container, false);

        map1 = v.findViewById(R.id.map1);
        map2 = v.findViewById(R.id.map2);
        map3 = v.findViewById(R.id.map3);

        card1 = v.findViewById(R.id.cardView1);
        card2 = v.findViewById(R.id.cardView2);
        card3 = v.findViewById(R.id.cardView3);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map1.setVisibility(map1.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                map2.setVisibility(View.GONE);
                map3.setVisibility(View.GONE);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map2.setVisibility(map2.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                map1.setVisibility(View.GONE);
                map3.setVisibility(View.GONE);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map3.setVisibility(map3.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
                map1.setVisibility(View.GONE);
                map2.setVisibility(View.GONE);
            }
        });

        return v;
    }
}
