package com.example.buttonclickingadventuregame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityEleven extends AppCompatActivity {

    private Button buttonChoice1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_five);

        buttonChoice1 = findViewById(R.id.buttonChoice1);

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivitySix
                Intent intent = new Intent(MainActivityEleven.this, MainActivitySix.class);
                startActivity(intent);

            }
        });
    }
}
