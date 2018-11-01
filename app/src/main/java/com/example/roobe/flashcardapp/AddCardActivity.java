package com.example.roobe.flashcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.minussymb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        findViewById(R.id.savesymb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String QuestionField = ((EditText) findViewById(R.id.QuestionField)).getText().toString();

                String Answerfield = ((EditText) findViewById(R.id.Answerfield)).getText().toString();

                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("question", QuestionField); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("answer", Answerfield); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish(); // closes this activity and pass data to the original activity that launched this activity

            }
        });

    }

}
