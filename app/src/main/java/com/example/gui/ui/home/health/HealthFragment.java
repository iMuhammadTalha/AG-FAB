package com.example.gui.ui.home.health;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gui.R;
import com.example.gui.ui.adapter.HealthFragmentAdapter;
import com.google.android.material.tabs.TabLayout;


public class HealthFragment extends Fragment {

//    private TabLayout tabLayout;
//    private ViewPager2 viewPager2;
//    private HealthFragmentAdapter adapter;

    private Button btn_upload, btn_camera, btn_send;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_health, container, false);

        btn_upload = root.findViewById(R.id.btn_upload);
        btn_camera = root.findViewById(R.id.btn_camera);
        btn_send = root.findViewById(R.id.btn_send);

//        btn_camera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new AlertDialog.Builder(getActivity())
//                        .setTitle("Camera")
//                        .setMessage("Are you sure to take a photo?")
//                        .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//
//                            }
//                        }).create().show();
//            }
//        });
//
//        btn_upload.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new AlertDialog.Builder(getActivity())
//                        .setTitle("Upload")
//                        .setMessage("Are you sure to upload a photo?")
//                        .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//
//                            }
//                        }).create().show();
//            }
//        });
//
//        btn_send.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new AlertDialog.Builder(getActivity())
//                        .setTitle("Send")
//                        .setMessage("Are you sure to send this photo?")
//                        .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//
//                            }
//                        }).create().show();
//            }
//        });

        //tab layout
//        tabLayout = root.findViewById(R.id.tabLayout);
//        viewPager2 = root.findViewById(R.id.viewPager2);
//
//        tabLayout.addTab(tabLayout.newTab().setText("Pesticides"));
//        tabLayout.addTab(tabLayout.newTab().setText("Disease"));
//        tabLayout.addTab(tabLayout.newTab().setText("Herb"));
//        tabLayout.addTab(tabLayout.newTab().setText("Scan"));
//
//        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//        adapter = new HealthFragmentAdapter(fragmentManager, getLifecycle());
//        viewPager2.setAdapter(adapter);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager2.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                tabLayout.selectTab(tabLayout.getTabAt(position));
//            }
//        });



        return root;
    }
}
