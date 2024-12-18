// MainActivityNine.java
package com.example.buttonclickingadventuregame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityNine extends AppCompatActivity {

    private Button buttonChoice1, buttonChoice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nine);

        buttonChoice1 = findViewById(R.id.buttonChoice1);
        buttonChoice2 = findViewById(R.id.buttonChoice2);

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityTen
                Intent intent = new Intent(MainActivityNine.this, MainActivityTen.class);
                startActivity(intent);
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityTen
                Intent intent = new Intent(MainActivityNine.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

