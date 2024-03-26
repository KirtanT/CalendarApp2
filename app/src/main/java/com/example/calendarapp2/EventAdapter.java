package com.example.calendarapp2;

import android.content.Context;
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

    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events); // should it be R.layout.event_cell?
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View eventView = inflater.inflate(R.layout.event_cell, parent, false);

        TextView categoryTextView = eventView.findViewById(R.id.CategoryEventCell);
        TextView nameTextView = eventView.findViewById(R.id.FirstEventCell);
        TextView timeTextView = eventView.findViewById(R.id.SecondEventCell);
        TextView dueDateTextView = eventView.findViewById(R.id.ThirdEventCell);

        Event event = getItem(position);

        categoryTextView.setText(event.getCategory());
        nameTextView.setText(event.getName());
        timeTextView.setText(event.getTime());
        dueDateTextView.setText(event.getDueDateString());

        return eventView;
    }

}
