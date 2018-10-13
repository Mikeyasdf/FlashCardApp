package com.example.roobe.flashcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashCard).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashCardAnswer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashCard).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.flashCardAnswer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashCardAnswer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashCard).setVisibility(View.VISIBLE);
            }
        });

    }

}
