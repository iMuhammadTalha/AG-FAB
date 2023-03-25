package com.example.gui.ui.reminder;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.gui.R;

public class ReminderFragment extends Fragment {

    private int NUM = 3;
    private CardView card[] = new CardView[NUM];
    private View reminder[] = new View[NUM];
    private Button task[][] = new Button[NUM][3];
    private int flag[][] = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_reminder, container, false);

        card[0] = root.findViewById(R.id.card0);
        card[1] = root.findViewById(R.id.card1);
        card[2] = root.findViewById(R.id.card2);

        reminder[0] = root.findViewById(R.id.reminder0);
        reminder[1] = root.findViewById(R.id.reminder1);
        reminder[2] = root.findViewById(R.id.reminder2);


        for (int i = 0; i < NUM; i++) {
            int card_num = i;
            for (int j = 0; j < 3; j++) {
                if (j == 0) task[i][j] = reminder[i].findViewById(R.id.irrigation);
                if (j == 1) task[i][j] = reminder[i].findViewById(R.id.fertilizer);
                if (j == 2) task[i][j] = reminder[i].findViewById(R.id.pesticide);

                int task_num = j;
                task[i][j].setBackgroundColor(Color.parseColor("#c9c9c9"));
                task[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (flag[card_num][task_num] == 0) {
                            task[card_num][task_num].setBackgroundColor(Color.parseColor("#FF5B5B"));
                            flag[card_num][task_num] = 1;
                        } else {
                            task[card_num][task_num].setBackgroundColor(Color.parseColor("#c9c9c9"));
                            flag[card_num][task_num] = 0;
                        }
                    }
                });
            }

            card[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (reminder[card_num].getVisibility() == View.VISIBLE) {
                        reminder[card_num].setVisibility(View.GONE);
                    } else reminder[card_num].setVisibility(View.VISIBLE);
                }
            });
        }


        return root;
    }
}