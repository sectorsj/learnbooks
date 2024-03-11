package ru.sectorsj.orailly.learnjava._274_duck;

class Duck3 {
    int size;

    public Duck3() {
        size = 23;
        System.out.println("Размер по-умолчанию равен = " + size);
    }

    public Duck3(int duckSize) {
            size = duckSize;
            System.out.println("Размер равен = " + size);
    }
}
