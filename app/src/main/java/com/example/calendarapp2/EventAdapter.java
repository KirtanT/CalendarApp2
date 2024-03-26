package com.example.calendarapp2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class EventAdapter extends ArrayAdapter<Event> {

    private Context context;
    private ArrayList<Event> events;


    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events); // should it be R.layout.event_cell?
        this.context = context;
        this.events = events;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View eventView = inflater.inflate(R.layout.event_cell, parent, false);

        TextView categoryTextView = eventView.findViewById(R.id.CategoryEventCell);
        TextView nameTextView = eventView.findViewById(R.id.FirstEventCell);
        TextView timeTextView = eventView.findViewById(R.id.SecondEventCell);
        TextView dueDateTextView = eventView.findViewById(R.id.ThirdEventCell);

        Button deleteButton = eventView.findViewById(R.id.deleteButton);
        Button editButton = eventView.findViewById(R.id.editButton);

        Event event = getItem(position);

        categoryTextView.setText(event.getCategory());
        nameTextView.setText(event.getName());
        timeTextView.setText(event.getTime());
        dueDateTextView.setText(event.getDueDate());


        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                events.remove(event);
                notifyDataSetChanged();
            }
        });

        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getItem(position).getCategory().equals("Class")){
                    events.remove(event);
                    Intent x = new Intent(getContext().getApplicationContext(), NewClass.class);
                    x.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(x);
                    notifyDataSetChanged();
                }
                if (getItem(position).getCategory().equals("Assignment")){
                    events.remove(event);
                    Intent x = new Intent(getContext().getApplicationContext(), NewAssignment.class);
                    x.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(x);
                    notifyDataSetChanged();
                }
                if (getItem(position).getCategory().equals("Exam")){
                    events.remove(event);
                    Intent x = new Intent(getContext().getApplicationContext(), NewExam.class);
                    x.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(x);
                    notifyDataSetChanged();
                }
                else {
                    events.remove(event);
                    Intent x = new Intent(getContext().getApplicationContext(), NewToDo.class);
                    x.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(x);
                    notifyDataSetChanged();
                }

            }
        });

        
        return eventView;
    }
}
