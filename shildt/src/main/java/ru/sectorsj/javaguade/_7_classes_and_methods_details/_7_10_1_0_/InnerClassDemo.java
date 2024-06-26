package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_10_1_0_;


/**
 * 7.10.1.0 - Применение внутреннего класса
 *
 * Пример 1:
 * Определение и применение внутреннего класса.
 *
 * Результат выполнения программы:
 * Вывод: outer_x = 100
 *
 * В классе Outer содержится:
 * одна переменная экземпляра outer_x
 * один метод экземпляра test()
 * и определяется один внутренний класс Inner.
 * Программа выводит следующий результат:
 * Вывод: outer_x = 100
 * В данной программе внутренний класс Inner
 * определен в области действия класса Outer.
 * Поэтому любой код из класса Inner может
 * непосредственно обращаться к переменной outer_x.
 * Метод экземпляра display() определен в классе Inner.
 * Этот метод выводит значение переменной outer_x
 * в стандартный поток вывода.
 * В методе main() из класса InnerClassDemo
 * создается экземпляр класса Outer и
 * вызывается его метод test().
 * А в этом методе создается экземпляр
 * класса Inner и вызывается метод display().
 * Следует иметь в виду, что экземпляр класса Inner может быть создан только
 * в контексте класса Outer.
 * В противном случае компилятор Java выдаст сообщение об ошибке.
 * Экземпляр внутреннего класса нередко создается в коде,
 * находящемся в объемлющей области действия.
 */
class Outer{
    int outer_x = 100;

    // В методе инициализируется внутренний класс Inner
    // и вызывается метод внутреннего класса - display()
    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это внутренний не статический класс
    class Inner{
        // Метод внутреннего нестатического класса:
        public void display() {
            System.out.println("Вывод: outer_x = " + outer_x);
        }
    }
}

// Главный класс:
class InnerClassDemo {
    // Главный метод
    public static void main(String[] args) {
        // Инициализируем класс Outer
        Outer outer = new Outer();

        // Вызываем метод класса Outer - test(),
        // который внутри содержит метод
        // вложенного класса Inner - display()
        outer.test();
    }
}