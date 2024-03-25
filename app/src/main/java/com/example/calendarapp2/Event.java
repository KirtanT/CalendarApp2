package com.example.calendarapp2;


import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Event
{
    public static ArrayList<Event> classesArrayList = new ArrayList<>();
    public static ArrayList<Event> otherArrayList= new ArrayList<>();

    /**
    public void deleteEvent(String eventName) {
        for (int i = 0; i < eventsList.size(); i++) {
            if (eventsList.get(i).equals(eventName)) {
                eventsList.remove(i);
            }
        }
    }*/
    private String category;
    private String name;

    private String time;
    private String dueDate;

    public Event(String category, String name, String time, String dueDate)
    {
        this.category = category;
        this.name = name;
        this.time = time;
        this.dueDate = dueDate;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String name)
    {
        this.category = category;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String name)
    {
        this.time = time;
    }
    public String getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(String dueDate)
    {
        this.dueDate = dueDate;
    }

    @NonNull
    @Override
    public String toString() {
        return category + "\n" + name + "\n" + time + "\n" + dueDate;
    }
}