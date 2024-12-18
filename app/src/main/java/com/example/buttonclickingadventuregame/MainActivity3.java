// MainActivity3.java
package com.example.buttonclickingadventuregame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private Button buttonChoice1, buttonChoice2, buttonChoice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonChoice1 = findViewById(R.id.buttonChoice1);
        buttonChoice2 = findViewById(R.id.buttonChoice2);
        buttonChoice3 = findViewById(R.id.buttonChoice3);

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityFour
                Intent intent = new Intent(MainActivity3.this, MainActivityFour.class);
                startActivity(intent);
            }
        });

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityFour
                Intent intent = new Intent(MainActivity3.this, MainActivityFour.class);
                startActivity(intent);
            }
        });

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainActivityFour
                Intent intent = new Intent(MainActivity3.this, MainActivityFour.class);
                startActivity(intent);
            }
        });
    }
}
