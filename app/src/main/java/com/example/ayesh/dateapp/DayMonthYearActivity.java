package com.example.ayesh.dateapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class DayMonthYearActivity extends AppCompatActivity {

    private Button dispBtn;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_month_year);

        Date();

    }

    public void Date(){

        dispBtn = (Button) findViewById(R.id.dispBtn);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        dispBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Day = "Day is:" +datePicker.getDayOfMonth();
                String Month = "Month is:" +datePicker.getMonth();
                String Year = "Year is:" +datePicker.getYear();

                Toast.makeText(DayMonthYearActivity.this, Day + "/n" + Month + "/n" + Year, Toast.LENGTH_LONG).show();
            }
        });
    }
}
