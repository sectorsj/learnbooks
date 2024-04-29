package ru.sectorsj._8_using_classes_and_objects._304_using_inner_class_demo;

import static javax.swing.JOptionPane.*;

public class BankAccount {
    double rate;
    Person fellow;

    public BankAccount(String name, double money, int time, double rate) {
        this.rate = rate;
        fellow = new Person(name, money, time);
    }

    void show() {
        showMessageDialog(
                null,
                fellow,
                "Депозит",
                INFORMATION_MESSAGE
        );
    }

    class Person {

        String name;
        double money;
        int time;

        double getMoney() {
            double s = money;

            for (int i = 1; i <= time; i++) {
                s *= (1 + rate / 100);
            }
            s = Math.round(s * 100) / 100.0;
            return s;
        }

        @Override
        public String toString() {
            String txt = "Имя: " + name + "\n";
            txt += "Начальная сумма: " + money + "\n";
            txt += "Процентная ставка: " + rate + "\n";
            txt += "Время (лет): " + time + "\n";
            txt += "Итоговая сумма: " + getMoney();
            return txt;
        }

        public Person(String txt, double m, int t) {
            name = txt;
            money = m;
            time = t;
        }
    }
}
