// MainActivitySeven.java
package com.example.buttonclickingadventuregame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

class MainActivityInformation extends AppCompatActivity {

    private Button buttonChoice1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        buttonChoice1 = findViewById(R.id.buttonChoice1);

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityEight
                Intent intent = new Intent(MainActivityInformation.this, MainActivityEight.class);
                startActivity(intent);
            }
        });
    }
}