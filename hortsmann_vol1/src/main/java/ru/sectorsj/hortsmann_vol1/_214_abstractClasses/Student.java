package ru.sectorsj.hortsmann_vol1._214_abstractClasses;

class Student extends Person {

    private String major;

    /**
     * @param name      Имя студента
     * @param major     Специализация студента
     */

    public Student(String name, String major) {
        // Передаем строку name конструктору суперкласса в качестве параметра
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return String.format("студент специализирующийся на " + major);
    }
}
