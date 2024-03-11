package ru.sectorsj.orailly.learnjava._169_sinkDotCom;

import java.util.ArrayList;

public class DotComNew {
    private ArrayList<String> locationCells;
    private String name;
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {

            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name + "    : ( ");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}