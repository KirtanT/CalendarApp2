package com.example.calendarapp2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EventAdapter extends ArrayAdapter<Event>
{
    public List<Event> events;
    public EventAdapter(@NonNull Context context, List<Event> events)
    {

        super(context, 0, events);
        this.events = events;

    }
/**
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Event event = getItem(position);

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_cell, parent, false);

        TextView AssignmentEventCell1 = convertView.findViewById(R.id.AssignmentEventCell1);
        TextView AssignmentEventCell2 = convertView.findViewById(R.id.AssignmentEventCell2);
        TextView AssignmentEventCell3 = convertView.findViewById(R.id.AssignmentEventCell3);

        Button delBtn = convertView.findViewById(R.id.deleteButton);

        delBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Event.classesArrayList.remove(event);
                remove(event);
                notifyDataSetChanged();
            }
        });

//CODE FOR EDIT BUTTON
/**
        Button editBtn = convertView.findViewById(R.id.editButton);
        editBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Event.eventsList.remove(event);
                remove(event);
                Intent x = new Intent(getContext().getApplicationContext(), EventEditActivity.class);
                x.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(x);
                notifyDataSetChanged();
            }
        });

        String event1 = event.getType();
        String event2 = event.getName();
        String event3 = event.getLocation();

        AssignmentEventCell1.setText(event1);
        AssignmentEventCell2.setText(event2);
        AssignmentEventCell3.setText(event3);
        return convertView;
    }*/
}