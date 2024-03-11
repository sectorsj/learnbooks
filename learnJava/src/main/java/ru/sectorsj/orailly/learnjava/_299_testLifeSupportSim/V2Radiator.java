package ru.sectorsj.orailly.learnjava._299_testLifeSupportSim;

import java.util.ArrayList;

public class V2Radiator {

    V2Radiator(ArrayList list){
        for (int x = 0; x < 5; x++) {
            list.add(new SimUnit("V2радиатор"));
        }
    }
}