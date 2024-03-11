package ru.sectorsj.orailly.learnjava._584_sortMountains;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {
    LinkedList<Mountain> mnt = new LinkedList<>();

    public static void main(String[] args) {
        new SortMountains().go();
    }

    class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        @Override
        public int compare(Mountain one, Mountain two) {
            return (two.height - one.height);
        }
    }

    private void go() {
        mnt.add(new Mountain("Канченджанга",8586));
        mnt.add(new Mountain("Аннапурна", 8091));
        mnt.add(new Mountain("Дхаулагири",8167));
        mnt.add(new Mountain("Макалу", 8485));
        mnt.add(new Mountain("Чо-Ойю",8188));
        mnt.add(new Mountain("Эверест",8848));
        mnt.add(new Mountain("Манаслу",8163));
        mnt.add(new Mountain("Нангапарбат",8126));
        mnt.add(new Mountain("Лхоцзе",8516));
        System.out.println("В порядке добавления:\n" + mnt);

        NameCompare nc = new NameCompare();
        Collections.sort(mnt, nc);
        System.out.println("По названию:\n" + mnt);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mnt, hc);
        System.out.println("По высоте:\n" + mnt);
    }
}