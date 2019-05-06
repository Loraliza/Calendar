package com.example.calender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GoToCalendarActivity";

    private TextView dateInfo;
    private Button toCalendarButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateInfo = findViewById(R.id.infoView);
        toCalendarButton = findViewById(R.id.calendarButton);

        Intent newIntent = getIntent();
        String date = newIntent.getStringExtra("date");
        dateInfo.setText(date);

        toCalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SelectDayActivity.class);
                startActivity(intent);

            }
        });
    }
}
