package com.example.sample;

import android.app.Activity;
import android.os.Bundle;

import java.util.Date;
import java.util.Locale;

import de.jodamob.android.calendar.CalendarBuilder;
import de.jodamob.android.calendar.CalendarDataFactory;
import de.jodamob.android.calendar.CalenderWidget;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalenderWidget widget = (CalenderWidget) findViewById(R.id.calendar);
        widget.set(
                CalendarDataFactory.getInstance(Locale.getDefault()).create(new Date(), 5),
                new CalendarBuilder(R.layout.calendar_item, R.layout.calendar_header));
    }
}
