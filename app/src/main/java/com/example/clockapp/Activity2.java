package com.example.clockapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.clockapp.R.layout.activity_2;

public class Activity2 extends AppCompatActivity {
    private Button button2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_2);


        button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                new MainActivity();

            }

        });
    }

    public void openMainActivity () {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}





