package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class NewClass extends AppCompatActivity {

    Button saveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_class);
        saveButton = findViewById(R.id.SaveButtonClass);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
                startActivity(new Intent(NewClass.this, ClassesPage.class));

            }
        });

    }

    private void addItem(View view) {
        EditText input = findViewById(R.id.ClassNameClass);
        EditText input2 = findViewById(R.id.TimeClass);
        EditText input3 = findViewById(R.id.ProfessorClass);

        String itemText = input.getText().toString();
        String itemText2 = input2.getText().toString();
        String itemText3 = input3.getText().toString();

        Event newEvent = new Event("Class",itemText, itemText2, itemText3);
        Event.classesArrayList.add(newEvent);
        Collections.sort(Event.classesArrayList, new Comparator<Event>() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            @Override
            public int compare(Event e1, Event e2) {
                try {
                    LocalTime time1 = LocalTime.parse(e1.getTime(), formatter);
                    LocalTime time2 = LocalTime.parse(e2.getTime(), formatter);
                    return time1.compareTo(time2);
                } catch (DateTimeParseException ex) {
                    ex.printStackTrace();
                    return 0;
                }
            }
        });
    }
}