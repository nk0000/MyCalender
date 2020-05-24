package com.example.mycalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton create,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button cont;
        create = findViewById(R.id.create);
        login = findViewById(R.id.Login);

        cont = findViewById(R.id.cont);

        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cont();

            }
        });
    }

    private void Cont()
    {

        if (create.isChecked()) {
            String message = "Redirecting you...";
            Intent i = new Intent(MainActivity.this, Createacc.class);
            startActivity(i);
        } else if (login.isChecked()) {
            String message = "Redirecting you...";
            Intent i = new Intent(MainActivity.this, Loginacc.class);
            startActivity(i);
        } else {
            Toast.makeText(MainActivity.this, "Invalid Option selected!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}
