package ru.sectorsj.orailly.learnjava._199_doctors;

public class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    public FamilyDoctor(String type) {
        super(type);
    }

    public void treatPatient() {
        giveAdvice();
    }

    private void giveAdvice () {
        // Дает простой совет
        if (makesHouseCalls == true){
            System.out.println(type + " дал простой совет");
        }
        else {
            System.out.println(type + " ничего не делал");
        }
    }
}
