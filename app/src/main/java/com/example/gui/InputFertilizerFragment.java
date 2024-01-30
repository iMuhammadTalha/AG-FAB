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
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class InputFertilizerFragment extends Fragment {

    private ImageView map1, map2, map3;
    private CardView card1, card2, card3;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InputFertilizerFragment() {
        // Required empty public constructor
    }

    // ... [Other existing parts of your Fragment]

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_input_fertilizer, container, false);

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
