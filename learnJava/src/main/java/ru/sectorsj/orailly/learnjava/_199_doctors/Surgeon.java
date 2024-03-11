package ru.sectorsj.orailly.learnjava._199_doctors;

public class Surgeon extends Doctor {
    public Surgeon(String type) {
        super(type);
    }

    public void treatPatient() {
        makeIncision();
    }

    //Делает надрез
    private void makeIncision() {

        if (worksAtHospital == true){
            System.out.println(type + " сделал надрез");
        }
        else {
            System.out.println(type + " спасал жизни других пациентов");
        }
    }
}
