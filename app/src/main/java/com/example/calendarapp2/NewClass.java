package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class NewClass extends AppCompatActivity {

    Button saveButton;
    private ListView ClassesListView;
    private ArrayList<String> items;
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
        EditText input2 = findViewById(R.id.ProfessorClass);
        EditText input3 = findViewById(R.id.TimeClass);

        String itemText = input.getText().toString();
        String itemText2 = input2.getText().toString();
        String itemText3 = input3.getText().toString();

        Event newEvent = new Event(itemText, itemText2, itemText3);
        Event.eventsList.add(newEvent);
    }
}