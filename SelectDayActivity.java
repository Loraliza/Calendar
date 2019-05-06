package com.example.calender;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class SelectDayActivity extends AppCompatActivity {

    private static final String TAG = "SelectDayActivity";

    private CalendarView viewOfCalendar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        viewOfCalendar = findViewById(R.id.calendarView);

        viewOfCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarViewview, int year, int month, int dayOfMonth) {
            String date = dayOfMonth + "/" + (month + 1) + "/" + year;

            Intent intent = new Intent(SelectDayActivity.this, MainActivity.class);
            intent.putExtra("date", date);
            startActivity(intent);
            }
        });
    }
}
