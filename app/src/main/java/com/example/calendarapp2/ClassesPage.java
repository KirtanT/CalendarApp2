package com.example.calendarapp2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassesPage extends AppCompatActivity {

    private ListView ClassesListView;
    Button OtherButton;
    Button NewClassButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes_page);

        OtherButton = findViewById(R.id.OtherText);
        NewClassButton = findViewById(R.id.NewClassButton);

        ClassesListView = findViewById(R.id.ClassesListView);

        //ClassesListView.setAdapter(itemsAdapter);


        OtherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ClassesPage.this, OtherPage.class));
            }
        });


        NewClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClassesPage.this, NewClass.class));
            }
        });
        ArrayAdapter<Event> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Event.eventsList);

        ListView listView = findViewById(R.id.ClassesListView);
        listView.setAdapter(adapter);
    }
}