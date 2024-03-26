package com.example.calendarapp2;


import java.util.ArrayList;

public class Event
{
    public static ArrayList<Event> eventsList = new ArrayList<>();


    public void deleteEvent(String eventName) {
        for (int i = 0; i < eventsList.size(); i++) {
            if (eventsList.get(i).equals(eventName)) {
                eventsList.remove(i);
            }
        }
    }
    private String name;

    private String location;
    private String type;

    public Event(String type, String name, String location)
    {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String name)
    {
        this.location = location;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String name)
    {
        this.type = type;
    }

}