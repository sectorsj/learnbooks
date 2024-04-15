package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_9_1_0_stack_class_with_length_206;


/**
 * 7.9.1.0 - Усовершенствование класса Stack
 *
 * Свойству length можно найти применение во многих случаях.
 *
 * В предшествующих версиях этого класса
 * всегда создавался 10-элементный стек.
 *
 * Новая версия класса Stack позволит
 * создавать стеки любого размера.
 *
 * Значение свойства
 *  stck.length
 * используется с целью предотвратить переполнение стека.
 *
 * Пример 1.1, 1.2:
 * Усовершенствованный класс Stack,
 * с использованием свойство длины массива.
 *
 * Результат выполнения программы:
 * Стек в myStack1:
 * 4
 * 3
 * 2
 * 1
 * 0
 * Стек в myStack2:
 * 7
 * 6
 * 5
 * 4
 * 3
 * 2
 * 1
 * 0
 *
 * В данной программе создаются два стека:
 *  1) глубиной 5 элементов
 *  2) глубиной 8 элементов
 *
 * Факт поддержания в массивах информации об их длине,
 * упрощает организацию стеков любой величины.
 */
// Пример 1.1:
class Stack {
    private int stck[];
    private int tos;

    // Выделение памяти под стек и инициализация стека
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Размещение элементов в стеке
    void push(int item) {
        // Использование свойство - длинна массива
        if(tos == stck.length - 1) {
            System.out.println("Стек заполнен.");
        }
        else {
            stck[++tos] = item;
        }
    }

    // Извлечение элемента из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек загружен.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}

// Пример 1.2:
class TestStack2 {
    public static void main(String[] args) {
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // Размещение чисел в стеке
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        // Извлечение чисел из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }
    }
}