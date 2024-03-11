package ru.sectorsj.orailly.learnjava._221_overloads;

public class Overloads {
    String uniqueID;

    public int addNums(int a, int b){
        return a + b;
    }

    public double addNums(double a, double b){
        return a + b;
    }

    public void setUniqueID(String theID){
        // Много кода
        uniqueID = theID;
    }

    public void setUniqueID(int ssNumber){
        String numString = " " + ssNumber;
        setUniqueID(numString);
    }
}
