package com.example.calendarapp2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Event
{
<<<<<<< Updated upstream
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
=======
    public static ArrayList<Event> classesArrayList = new ArrayList<>();
    public static ArrayList<Event> otherArrayList= new ArrayList<>();
    private String category;
    private String name;

    private String time;
    private int dueDate;
    private String dueDateString;

    public Event(String category, String name, String time, String dueDateString, int dueDate)
>>>>>>> Stashed changes
    {
        this.name = name;
<<<<<<< Updated upstream
        this.location = location;
        this.type = type;
=======
        this.time = time;
        this.dueDate = dueDate;
        this.dueDateString = dueDateString;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String name)
    {
        this.category = category;
>>>>>>> Stashed changes
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getDueDateString()
    {
        return dueDateString;
    }
    public void setDueDateString(String dueDateString)
    {
        this.dueDateString = dueDateString;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String name)
    {
<<<<<<< Updated upstream
        this.location = location;
    }

    public String getType()
=======
        this.time = time;
    }
    public int getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(int dueDate)
>>>>>>> Stashed changes
    {
        return type;
    }

<<<<<<< Updated upstream
    public void setType(String name)
    {
        this.type = type;
    }

=======
    @NonNull
    @Override
    public String toString() {
        return category + "\n" + name + "\n" + time + "\n" + dueDateString;
    }


>>>>>>> Stashed changes
}