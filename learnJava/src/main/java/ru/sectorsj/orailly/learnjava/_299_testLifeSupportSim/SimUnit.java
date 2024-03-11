package ru.sectorsj.orailly.learnjava._299_testLifeSupportSim;

public class SimUnit {
    String botType;
    String first = "1";
    String sec = "2";
    private static int radiatorCount = 0;
    SimUnit(String type){
        botType = type;
        if (powerUse()== 2){
            System.out.println(first + " radiator№: " + radiatorCount);
        }
        else {
            System.out.println(sec + " radiator№:" + radiatorCount);
        }
        radiatorCount++;
    }

    int powerUse(){
        if ("Тепловая машина".equals(botType)){
            return 2;
        } else {
            return 4;
        }
    }
}