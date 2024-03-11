package ru.sectorsj.orailly.learnjava._474_gameSaverTest;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int pwr, String tp, String[] wp) {
        power = pwr;
        type = tp;
        weapons = wp;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getWeapons() {

        String weaponList = "";

        for (int i = 0; i < weapons.length; i++) {
            weaponList += weapons[i] + " ";
        }
        return weaponList;
    }
}
