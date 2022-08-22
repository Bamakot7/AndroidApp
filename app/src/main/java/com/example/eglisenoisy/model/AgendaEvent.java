package com.example.eglisenoisy.model;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.text.DateFormatSymbols;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.TimeZone;

public class AgendaEvent {
    private final long date;
    private final String name;
    private final String detail;

    public AgendaEvent(long date, String name, String detail) {
        this.date = date;
        this.name = Objects.requireNonNull(name);
        this.detail = Objects.requireNonNull(detail);
    }

    public long getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private LocalDateTime timestampToLocalDate(){
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date), TimeZone.getDefault().toZoneId());
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public int getDay(){
        LocalDateTime d = timestampToLocalDate();


        return d.getDayOfMonth();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getMonth(){
        LocalDateTime d = timestampToLocalDate();
        return d.getMonth().name();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public int getYear(){
        LocalDateTime d = timestampToLocalDate();
        return d.getYear();
    }
}
