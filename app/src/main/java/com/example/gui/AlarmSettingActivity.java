package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class AlarmSettingActivity extends AppCompatActivity {

    private NumberPicker hourPicker;
    private NumberPicker minutePicker;
    private Spinner amPmPicker;
    private Button setAlarmButton;
    private String[] reminders = {"Water plants", "Fertilize soil", "Spray insecticide"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_setting);

        // Find the NumberPicker and Spinner views in the layout file
        hourPicker = findViewById(R.id.hourPicker);
        minutePicker = findViewById(R.id.minutePicker);
        amPmPicker = findViewById(R.id.amPmPicker);

        // Configure the NumberPicker and Spinner views
        hourPicker.setMinValue(1);
        hourPicker.setMaxValue(12);
        minutePicker.setMinValue(0);
        minutePicker.setMaxValue(59);
        amPmPicker.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,
                new String[]{"AM", "PM"}));

        // Find the "Set Alarm" button and set its OnClickListener
        setAlarmButton = findViewById(R.id.setAlarmButton);
        setAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected reminder and time values
                String reminder = reminders[amPmPicker.getSelectedItemPosition()];
                int hour = hourPicker.getValue();
                int minute = minutePicker.getValue();
                String amPm = (String) amPmPicker.getSelectedItem();
                // Create a new alarm with the selected reminder and time
                Alarm newAlarm = new Alarm(reminder, hour, minute, amPm);

                // TODO: Save the new alarm to persistent storage

                // Show a toast message to confirm that the alarm was set
                String toastText = String.format("Alarm set for %d:%02d %s with reminder: %s",
                        hour, minute, amPm, reminder);
                Toast.makeText(AlarmSettingActivity.this, toastText, Toast.LENGTH_SHORT).show();
            }
        });


// Set the initial values for the hour and minute pickers
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int hour = hourOfDay > 12 ? hourOfDay - 12 : hourOfDay;
        int minute = calendar.get(Calendar.MINUTE);
        hourPicker.setValue(hour);
        minutePicker.setValue(minute);

// Set the initial selection for the AM/PM picker based on the current time
        int amPm = calendar.get(Calendar.AM_PM);
        amPmPicker.setSelection(amPm);

    }
}
