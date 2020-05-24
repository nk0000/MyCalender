package com.example.mycalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import java.util.Calendar;

public class CalenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        CalendarView mCalendarView;
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
//                String date = year + "/" + month + "/"+ dayOfMonth ;
//                Log.d(BATTERY_SERVICE, "onSelectedDayChange: yyyy/mm/dd:" + date);
//                Intent intent = new Intent(CalenderActivity.this,MainActivity.class);
//                intent.putExtra("date",date);
//                startActivity(intent);
                Calendar calendarEvent = Calendar.getInstance();
                Intent i = new Intent(Intent.ACTION_EDIT);
                i.setType("vnd.android.cursor.item/event");
                i.putExtra("beginTime", calendarEvent.getTimeInMillis());
                i.putExtra("allDay", true);
                i.putExtra("rule", "FREQ=YEARLY");
                i.putExtra("endTime", calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
                i.putExtra("title", "Calendar Event");
                startActivity(i);

            }
        });
    }
}
