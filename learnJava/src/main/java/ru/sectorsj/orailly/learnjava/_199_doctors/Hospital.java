package ru.sectorsj.orailly.learnjava._199_doctors;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Общий доктор");
        doc.worksAtHospital = false;
        doc.treatPatient();
        doc.worksAtHospital = true;
        doc.treatPatient();

        FamilyDoctor fdoc = new FamilyDoctor("Семейный доктор");
        fdoc.makesHouseCalls = false;
        fdoc.treatPatient();
        fdoc.makesHouseCalls = true;
        fdoc.treatPatient();


        Surgeon sdoc = new Surgeon("Хирург");
        sdoc.treatPatient();
        sdoc.worksAtHospital = true;
        sdoc.treatPatient();
    }
}
