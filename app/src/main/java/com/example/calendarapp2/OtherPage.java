package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OtherPage extends AppCompatActivity implements View.OnClickListener {

    Button assignmentBtn;
    Button toDoBtn;
    Button examBtn;

    //private ListView OtherListView;

    private RecyclerView otherRecyclerView;
    private EventAdapter eventAdapter;
    private List<Event> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_page);

        assignmentBtn = findViewById(R.id.NewAssigmentButton);
        toDoBtn = findViewById(R.id.NewToDoButton);
        examBtn = findViewById(R.id.NewExamButton);
        //OtherListView = findViewById(R.id.OtherListView);
        events = new ArrayList<>();

        otherRecyclerView = findViewById(R.id.OtherListView);
        otherRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        eventAdapter = new EventAdapter(this, events);
        otherRecyclerView.setAdapter(eventAdapter);

        assignmentBtn.setOnClickListener(this);
        toDoBtn.setOnClickListener(this);
        examBtn.setOnClickListener(this);
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
        }
    }


}