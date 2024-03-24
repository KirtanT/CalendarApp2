package com.example.calendarapp2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {

    private List<Event> events;
    private Context context;

    public EventAdapter(Context context, List<Event> events) {
        this.context = context;
        this.events = events;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_cell, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = events.get(position);

        holder.AssignmentEventCell1.setText(event.getType()); // Assuming getType() exists in your Event class
        holder.AssignmentEventCell2.setText(event.getName()); // Assuming getName() exists in your Event class
        holder.AssignmentEventCell3.setText(event.getLocation()); // Assuming getLocation() exists in your Event class

        holder.delBtn.setOnClickListener(v -> {
            events.remove(position);
            notifyItemRemoved(position);
        });

        // Uncomment and modify as needed for the edit button functionality
        // holder.editBtn.setOnClickListener(v -> { /* Handle edit */ });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    static class EventViewHolder extends RecyclerView.ViewHolder {
        TextView AssignmentEventCell1, AssignmentEventCell2, AssignmentEventCell3;
        Button delBtn; //, editBtn;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            AssignmentEventCell1 = itemView.findViewById(R.id.AssignmentEventCell1);
            AssignmentEventCell2 = itemView.findViewById(R.id.AssignmentEventCell2);
            AssignmentEventCell3 = itemView.findViewById(R.id.AssignmentEventCell3);
            delBtn = itemView.findViewById(R.id.deleteButton);
            // editBtn = itemView.findViewById(R.id.editButton); // Uncomment if using the edit button
        }
    }
}
