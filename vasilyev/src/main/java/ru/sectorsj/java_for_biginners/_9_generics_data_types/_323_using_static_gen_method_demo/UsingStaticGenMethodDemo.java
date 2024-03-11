package ru.sectorsj.java_for_biginners._9_generics_data_types._323_using_static_gen_method_demo;

public class UsingStaticGenMethodDemo {
    static <X> void show(X arg) {
        System.out.println(arg);
    }
    
    static <X> void show(X[] array) {
        System.out.print("| ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println("");
    }

    static <X> X getElement(X[] array,int index){
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 7, 2};
        Character[] symbs = {'A','W','L','O','B'};


        System.out.println("Вызов метода show()");
        System.out.print("С текстовым аргументом: ");
        show("обобщенный метод");

        System.out.print("С int - аргументом: ");
        show(123);

        System.out.print("С double - аргументом: ");
        show(123.45);

        System.out.print("С char - аргументом: ");
        show('A');

        System.out.print("\nЦелочисленный массив: ");
        show(nums);

        System.out.print("Символьный массив: ");
        show(symbs);

        System.out.println("\nВызов метода getElement()");
        System.out.print("Целочисленный массив: *");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(getElement(nums, i) + "*");
        }

        System.out.print("\nСимвольный массив: *");
        for (int i = 0; i < symbs.length; i++) {
            System.out.print(getElement(symbs, i) + "*");
        }

        System.out.println("");
    }
}
