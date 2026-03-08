package Glava_6;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells;
    private String name;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String n) {
        name = n;
    }
    public String checkYourseIf(String userInput) {
        String result = "мимо";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "потопил";
                System.out.println("Ого! Вы потопили " + name + "  : ( ");
            } else {
                result = "попал";
            }
        }
        return result;
    }
}
