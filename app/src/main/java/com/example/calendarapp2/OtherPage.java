package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OtherPage extends AppCompatActivity implements View.OnClickListener {

    Button assignmentBtn;
    Button toDoBtn;
    Button examBtn;

    Button filterBtn;

    Button ClassesButton;
    EventAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_page);

        assignmentBtn = findViewById(R.id.NewAssigmentButton);
        toDoBtn = findViewById(R.id.NewToDoButton);
        examBtn = findViewById(R.id.NewExamButton);
        filterBtn = findViewById(R.id.FilterButton);
        assignmentBtn.setOnClickListener(this);
        toDoBtn.setOnClickListener(this);
        examBtn.setOnClickListener(this);
        filterBtn.setOnClickListener(this);


        ClassesButton = findViewById(R.id.ClassesText);
        ClassesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(OtherPage.this, ClassesPage.class));
            }
        });


        adapter = new EventAdapter(this, Event.otherArrayList);
        ListView listView = findViewById(R.id.OtherListView);
        listView.setAdapter(adapter);
/**
        ArrayAdapter<Event> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Event.otherArrayList);
        ListView listView = findViewById(R.id.OtherListView);
        listView.setAdapter(adapter);
*/
    }

    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id == R.id.NewAssigmentButton) {
            intent = new Intent(OtherPage.this, NewAssignment.class);
            startActivity(intent);
        } else if (id == R.id.NewToDoButton) {
            intent = new Intent(OtherPage.this, NewToDo.class);
            startActivity(intent);
        } else if (id == R.id.NewExamButton) {
            intent = new Intent(OtherPage.this, NewExam.class);
            startActivity(intent);
        } else if (id == R.id.FilterButton) {
            Collections.sort(Event.otherArrayList, new Comparator<Event>() {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                @Override
                public int compare(Event e1, Event e2) {
                    try {
                        LocalDate date1 = LocalDate.parse(e1.getDueDate(), formatter);
                        LocalDate date2 = LocalDate.parse(e2.getDueDate(), formatter);
                        return date1.compareTo(date2);
                    } catch (DateTimeParseException ex) {
                        ex.printStackTrace();
                        return 0;
                    }
                }
            });
            adapter.notifyDataSetChanged();
        }
    }
}