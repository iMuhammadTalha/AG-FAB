package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.util.Calendar;

public class AlarmSettingActivity extends AppCompatActivity {

    private Button editTextTime, editTextDate, irrigationBtn, pesticideBtn, fertilizerBtn, submitBtn, currentlySelectedBtn;
    private int selectedHour, selectedMinute, selectedDay, selectedMonth, selectedYear;
    private String selectedReminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_setting);

        editTextTime = findViewById(R.id.editTextTime);
        editTextDate = findViewById(R.id.editTextDate);
        irrigationBtn = findViewById(R.id.irrigation);
        pesticideBtn = findViewById(R.id.pesticide);
        fertilizerBtn = findViewById(R.id.fertilizer);
        submitBtn = findViewById(R.id.submit);

        final Calendar c = Calendar.getInstance();

        // Time selection
        editTextTime.setOnClickListener(v -> {
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    (view, hourOfDay, minutes) -> {
                        selectedHour = hourOfDay;
                        selectedMinute = minutes;
                        editTextTime.setText(String.format("%02d:%02d", hourOfDay, minutes));
                    }, hour, minute, false);
            timePickerDialog.show();
        });

        // Date selection
        editTextDate.setOnClickListener(v -> {
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    (view, year1, monthOfYear, dayOfMonth) -> {
                        selectedDay = dayOfMonth;
                        selectedMonth = monthOfYear;
                        selectedYear = year1;
                        editTextDate.setText(String.format("%04d-%02d-%02d", year1, monthOfYear + 1, dayOfMonth));
                    }, year, month, day);
            datePickerDialog.show();
        });

        View.OnClickListener reminderButtonClickListener = v -> {
            // Reset the previously selected button's appearance
            if (currentlySelectedBtn != null) {
                currentlySelectedBtn.setBackgroundColor(0x00000000);  // transparent
            }

            // Update the selected button's appearance
            Button selectedButton = (Button) v;
            selectedButton.setBackgroundColor(0xFF000000);  // translucent gray

            // Store the current button as the "selected" button
            currentlySelectedBtn = selectedButton;

            // Update the reminder text based on the selected button
            switch (v.getId()) {
                case R.id.irrigation:
                    selectedReminder = "Water plants";
                    break;
                case R.id.pesticide:
                    selectedReminder = "Spray insecticide";
                    break;
                case R.id.fertilizer:
                    selectedReminder = "Fertilize soil";
                    break;
            }
        };

        irrigationBtn.setOnClickListener(reminderButtonClickListener);
        pesticideBtn.setOnClickListener(reminderButtonClickListener);
        fertilizerBtn.setOnClickListener(reminderButtonClickListener);

        // Submission
        submitBtn.setOnClickListener(v -> {
            if (selectedReminder == null || editTextTime.getText().equals("Select Time") || editTextDate.getText().equals("Select Date")) {
                Toast.makeText(AlarmSettingActivity.this, "Please select all the options before submitting.", Toast.LENGTH_SHORT).show();
                return;
            }

            String details = String.format("Reminder: %s\nTime: %s\nDate: %s", selectedReminder, editTextTime.getText(), editTextDate.getText());
            Toast.makeText(AlarmSettingActivity.this, details, Toast.LENGTH_LONG).show();
        });
    }
}
