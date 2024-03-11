package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_3_0_0_variables_90;

/**
 * 3.3.0.0 - Переменные
 *
 * Переменная:
 * 1) служит основной единицей
 *    хранения данных в программе на Java.
 *
 * 2) определяется в виде сочетания идентификатора,
 *    типа и необязательного начального значения.
 *
 * 3) имеется своя область действия,
 *    которая определяет их доступность
 *    для других объектов
 *    и продолжительность существования.
 *
 * Эти составляющие переменных будут рассмотрены в последующих разделах.
 *
 */
public class Variables {
    static int classVariable = 10;

    public static void main(String[] args) {
        showNumberMethod(3, 5);
        System.out.println(classVariable);
    }

    public static void showNumberMethod(int a, int b){
        int methodVariable = a + b;
        System.out.println("Вывод значения methodVariable = " + methodVariable);
        System.out.println("Вывод значения classVariable = " + classVariable);
        // int lastMethodVariable;       - это бесполезная переменная
    }


}
