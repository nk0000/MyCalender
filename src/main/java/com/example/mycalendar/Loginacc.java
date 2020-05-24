package com.example.mycalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Loginacc extends AppCompatActivity {
    TextView tv_email,tv_password;
    EditText edt_email, edt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginacc);

        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);

        edt_email = findViewById(R.id.edt_email);
        edt_password = findViewById(R.id.edt_password);
        Button button;

        button = findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Loginacc.this, CalendarActivity1.class);
                startActivity(intent);
            }
        });

    }
}
