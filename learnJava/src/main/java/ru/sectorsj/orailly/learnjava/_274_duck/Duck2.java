package ru.sectorsj.orailly.learnjava._274_duck;

class Duck2 {
    int size;

    public Duck2(int newSize) {
        if (newSize == 0){
            size = 15;
            System.out.println("Размер по-умолчанию равен = " + size);
        } else {
            size = newSize;
            System.out.println("Иначе размер равен = " + size);
        }
    }
}
