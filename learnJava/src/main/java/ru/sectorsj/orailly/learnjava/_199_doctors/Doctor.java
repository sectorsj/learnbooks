package ru.sectorsj.orailly.learnjava._199_doctors;

public class Doctor {
    String type;
    boolean worksAtHospital;

    public Doctor(String type) {
        this.type = type;
    }

    // Прием пациентов
    public void treatPatient() {
//        worksAtHospital = true;
        // Проводим проверку
        if (worksAtHospital == true){
            System.out.println(type + " ведет прием пациента");
        }
        else {
            System.out.println(type + " отдыхает");
        }
    }
}