package ru.sectorsj.orailly.learnjava._584_sortMountains;

class Mountain {
    String name;
    int height;

    public Mountain(String n, int h) {
        name = n;
        height = h;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }
}
