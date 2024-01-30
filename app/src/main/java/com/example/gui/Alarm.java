package com.example.gui;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Alarm {

    private String reminder;
    private int hour;
    private int minute;
    private String amPm;
    private int repeatFrequency;
    private boolean vibrate;
    private boolean deleteAfter;
    private String label;

    public Alarm(String reminder, int hour, int minute, String amPm, int repeatFrequency,
                 boolean vibrate, boolean deleteAfter, String label) {
        this.reminder = reminder;
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
        this.repeatFrequency = repeatFrequency;
        this.vibrate = vibrate;
        this.deleteAfter = deleteAfter;
        this.label = label;
    }

    public String getReminder() {
        return reminder;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getAmPm() {
        return amPm;
    }

    public int getRepeatFrequency() {
        return repeatFrequency;
    }

    public boolean isVibrate() {
        return vibrate;
    }

    public boolean isDeleteAfter() {
        return deleteAfter;
    }

    public String getLabel() {
        return label;
    }

    public String getFormattedTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(calendar.getTime());
    }

    public String getRepeatFrequencyString() {
        switch (repeatFrequency) {
            case 0:
                return "Never";
            case 1:
                return "Daily";
            case 2:
                return "Weekly";
            case 3:
                return "Monthly";
            default:
                return "";
        }
    }
}
