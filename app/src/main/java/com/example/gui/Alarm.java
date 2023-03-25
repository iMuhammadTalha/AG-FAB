package com.example.gui;

public class Alarm {
    private String reminder;
    private int hour;
    private int minute;
    private String amPm;

    public Alarm(String reminder, int hour, int minute, String amPm) {
        this.reminder = reminder;
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
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
}
