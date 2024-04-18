package ru.sectorsj.javaguade._7_classes_and_methods_details._7_1_0_0_overload_methods_185;

/**
 * 7.1.0.0 - ПЕРЕГРУЗКА МЕТОДОВ
 *
 * Разрешается определять в одном и том же классе
 * 2 или больше методов под одним именем,
 * если объявления их параметров отличаются.
 *
 * Такие методы называют перегружаемыми,
 * а сам процесс - перегрузкой методов.
 *
 * Перегрузка методов является одним из способов
 * поддержки полиморфизма в Java.
 *
 * ВАЖНО!
 * Тем, кто никогда не программировал на языке,
 * допускающем перегрузку методов,
 * это понятие может  показаться странным.
 *
 * Перегрузка методов - одна из самых замечательных и полезных
 *                      функциональных возможностей Java.
 *
 * в Java:
 * При вызове перегружаемого метода
 * для определения нужного его варианта используется:
 * - тип
 *      и/или
 * - количество аргументов метода.
 *
 * Перегружаемые методы должны отличаться по:
 * - типу
 *      и/или
 * - количеству параметров этого метода.
 *
 * Возвращаемые типы перегружаемых методов могут отличаться,
 * но самого возвращаемого типа явно недостаточно,
 * чтобы отличать два разных варианта метода.
 *
 * Когда в Java встречается вызов перегружаемого метода,
 * выполняется тот его вариант,
 * параметры которого соответствуют аргументам,
 * указанным в вызове.
 *
 * Пример 1.1, 1.2:
 * Перегрузка методов
 *
 * Результат выполнения программы:
 * Параметры отсутствуют
 * a = 10
 * a и b = 10 и 20
 * a = 123.25
 * Результат вызова obj.test(123.25) = 15190.5625
 *
 * Метод test() перегружается 4е раза:
 *  1) вообще не принимает параметров,
 *  2) принимает 1 целочисленный параметр,
 *  3) принимает 2 целочисленных параметра,
 *  4) единственный параметр типа double.
 *
 * Тот факт, что 4й вариант метода test()
 * еще и возвращает значение,
 * не имеет никакого значения для перегрузки,
 * поскольку возвращаемый тип
 * никоим образом не влияет
 * на поиск перегружаемого варианта метода.
 */
// Пример 1.1:
class OverloadDemo {

    // 1й обычный метод
    // не принимает никаких параметров
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // 2й перегружаемый метод,
    // проверяет наличие 1го целочисленного параметра
    void test(int a) {
        System.out.println("a = " + a);
    }

    // 3й перегружаемый метод,
    // проверяет наличие 2х целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b = " + a + " и " + b);
    }

    // 4й перегружаемый метод,
    // проверяет наличие параметра типа double
    // так же возвращает тип double
    double test(double a) {
        System.out.println("a = " + a);
        return a * a;
    }

}

// Пример 1.2:
class Overload1 {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        double result;

        // Вызываем все варианты метода test()
        System.out.println(" ");
        obj.test();
        obj.test(10);
        obj.test(10, 20);
        result = obj.test(123.25);
        System.out.println("Результат вызова obj.test(123.25) = " + result);
    }
}