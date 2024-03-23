package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewAssignment extends AppCompatActivity {

    private EditText ClassNameAssignment, DueDateAssignment, ProfessorAssignment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_assignment);
        ClassNameAssignment = findViewById(R.id.ClassNameAssignment);
        DueDateAssignment = findViewById(R.id.DueDateAssignment);
        ProfessorAssignment = findViewById(R.id.ProfessorAssignment);


    }

    public void saveButtonAssignment(View view) {
        String className = ClassNameAssignment.getText().toString();
        String dueDate = DueDateAssignment.getText().toString();
        String Professor = ProfessorAssignment.getText().toString();
        Event newEvent = new Event(className, dueDate, Professor);
        Event.eventsList.add(newEvent);
        finish(); // Close the activity
    }
}