package ru.sectorsj.orailly.learnjava._164_arraydemo;

public class ArrayDemo {
    public static void main(String[] args) {
        // Создание пустого массива размером в 2 ячейки
        String[] myList = new String[2];

        //Создание 1го элемента для массива
        String first = new String("Ура");
        // Добавление 1го элемента в массиви
        myList[0] = first;

        //Создание 2го элемента для массива
        String second = new String("Лягушка");
        // Добавление 2го элемента в массиви
        myList[1] = second;

        // Получение размера массива
        int theSize = myList.length;
        System.out.println(theSize);

        // Получение значения ячейки массива
        String obj = myList[1];
        System.out.println(obj);

        // Удаление содержимого ячейки массива
        myList[1] = null;
        obj = myList[1];
        System.out.println(obj);

        // Проверка содержит ли ячейка массива значение, или нет
        boolean isIn = false;
        for (String item: myList) {
            if (second.equals(item)){
                isIn = true;
                break;
            }
        }
        System.out.println(isIn);
    }
}
