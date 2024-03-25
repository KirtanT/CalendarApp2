package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewAssignment extends AppCompatActivity {

    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_assignment);
        saveButton = findViewById(R.id.SaveButtonAssignment);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
                startActivity(new Intent(NewAssignment.this, OtherPage.class));

            }
        });

    }

    private void addItem(View view) {
        EditText input = findViewById(R.id.ClassNameAssignment);
        EditText input2 = findViewById(R.id.ProfessorAssignment);
        EditText input3 = findViewById(R.id.DueDateAssignment);

        String itemText = input.getText().toString();
        String itemText2 = input2.getText().toString();
        String itemText3 = input3.getText().toString();

        Event newEvent = new Event("Assignment",itemText, itemText2, itemText3);
        Event.otherArrayList.add(newEvent);
    }
}