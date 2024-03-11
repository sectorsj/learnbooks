package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._209_nested_and_inner_classes_2;

/**
 * Внутренний класс имеет доступ ко всем элементам
 * своего внешнего класса, но не наоборот.
 *
 * Члены внутреннего класса доступны:
 * - только в области действия внутреннего класса
 * - не могут быть использованы внешним классом.
 *
 * Как показано в приведенном ниже примере программы,
 * переменная у объявлена как переменная экземпляра класса Inner.
 *
 * Поэтому она недоступна за пределами этого класса
 * и не может использоваться в методе showy().
 */

// Эта программа не подлежит компиляции
class Outer{
    int outer_x = 100;

    // Метод класса Outer
    void test() {
        Inner inner = new Inner();
        inner.display();

        // Можно получить доступ к переменной
        // внутреннего класса Inner,
        // т.к. инициализируем внутренний класс ->
        // "Inner inner = new Inner();"
         System.out.println("inner_y = " + inner.inner_y);
    }

    // Метод класса Outer
    void showy() {
        // Без инициализации класса Inner
        // к его переменным не обратиться

        // ошибка, здесь переменная inner_y недоступна!
        // System.out.println("inner_y = " + inner_y);
    }

    // Это внутренний класс:
    class Inner {
        // inner_y - локальная переменная класса Inner
        int inner_y = 10;

        // Метод внутреннего нестатического класса:
        void display() {
            System.out.println("Вывод: outer_x = " + outer_x);
        }
    }
}

// Главный класс:
public class InnerClassDemo2 {

    // Главный метод:
    public static void main(String[] args) {

        // Инициализируем класс Outer
        Outer outer = new Outer();

        // Вызваем метод класса Outer - test(),
        // который внутри содержит метод
        // вложенного класса Inner - display()
        outer.test();
    }
}
