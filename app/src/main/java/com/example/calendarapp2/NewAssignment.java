package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ArrayAdapter;

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


<<<<<<< Updated upstream
    public void saveButtonAssignment(View view) {
        String className = ClassNameAssignment.getText().toString();
        String dueDate = DueDateAssignment.getText().toString();
        String Professor = ProfessorAssignment.getText().toString();
        Event newEvent = new Event(className, dueDate, Professor);
        Event.eventsList.add(newEvent);
        finish(); // Close the activity
=======
        String itemText = input.getText().toString();
        String itemText2 = input2.getText().toString();
        String itemText3 = input3.getText().toString();
        //    02/05/2024
        int day = Integer.parseInt(itemText3.substring(0, 2));
        int month = Integer.parseInt(itemText3.substring(3, 5));
        int year = Integer.parseInt(itemText3.substring(6,10));
        int finalInt = year + month + day;

        Event newEvent = new Event("Assignment",itemText, itemText2, itemText3, 0);
        Event.otherArrayList.add(newEvent);
        Event.sort(Event.otherArrayList);
>>>>>>> Stashed changes
    }
}