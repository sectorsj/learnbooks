package ru.sectorsj.orailly.learnjava._497_dungeonGame;

import java.io.Serializable;

public class DungeonGame implements Serializable {
   public int x = 3;
   transient long y = 4;
   private short z = 5;

    public int getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public short getZ() {
        return z;
    }
}
