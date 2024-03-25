package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewExam extends AppCompatActivity {

    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exam);
        saveButton = findViewById(R.id.SaveButtonExam);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
                startActivity(new Intent(NewExam.this, OtherPage.class));

            }
        });

    }

    private void addItem(View view) {
        EditText input = findViewById(R.id.ClassNameExam);
        EditText input2 = findViewById(R.id.TimeExam);
        EditText input3 = findViewById(R.id.DateExam);

        String itemText = input.getText().toString();
        String itemText2 = input2.getText().toString();
        String itemText3 = input3.getText().toString();

        Event newEvent = new Event("Exam",itemText, itemText2, itemText3);
        Event.otherArrayList.add(newEvent);
    }
}