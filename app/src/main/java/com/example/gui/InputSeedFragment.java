package com.example.gui;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InputSeedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InputSeedFragment extends Fragment {

    private ImageView map1, map2, map3;
    private CardView card1, card2, card3;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InputSeedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InputSeedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InputSeedFragment newInstance(String param1, String param2) {
        InputSeedFragment fragment = new InputSeedFragment();
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

        View v = inflater.inflate(R.layout.fragment_input_seed, container, false);


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