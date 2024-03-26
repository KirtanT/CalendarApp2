package com.example.calendarapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewExam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_exam);
<<<<<<< Updated upstream
=======
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
        int day = Integer.parseInt(itemText3.substring(0, 2));
        int month = Integer.parseInt(itemText3.substring(3, 5));
        int year = Integer.parseInt(itemText3.substring(6,10));
        int finalInt = year + month + day;

        Event newEvent = new Event("Exam",itemText, itemText2, itemText3, 0);
        Event.otherArrayList.add(newEvent);
        Event.sort(Event.otherArrayList);
>>>>>>> Stashed changes
    }
}