package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_2_0_0_using_objects_as_params_191;

/**
 * 7.2.0.0 - ПРИМЕНЕНИЕ ОБЪЕКТОВ В КАЧЕСТВЕ ПАРАМЕТРОВ
 *
 * Ранее в качестве параметров методов
 * употреблялись только простые типы данных.
 *
 * Передача методам объектов:
 * - вполне допустима
 * - довольно распространена
 *
 * Пример 1.1, 1.2:
 * Объекты допускается передавать методам
 * в качестве параметров
 *
 * Программа выведет следующий результат:
 * obj1 == obj2: true
 * obj1 == obj3: false
 *
 * equalTo() - метод, в классе Test проверяет на равенство 2 объекта
 *             и возвращает получаемый результат.
 *
 *             Он сравнивает вызывающий объект с тем,
 *             который был ему передан.
 *
 * В методе equalsTo() условие:
 * 1) если оба объекта содержат одинаковые значения,
 *    то он возвращает логическое значение true,
 * 2) иначе - возвращает логическое значение false.
 *
 * В качестве типа параметра "o" в методе equalTo()
 * указывается объект типа Test.
 *
 * И хотя Test обозначает тип класса, создаваемого в программе,
 * он употребляется точно так же,
 * как и типы данных, встроенные в Java.
 */

// Пример 1.1:
class Test {
    int a, b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o){
        // Если в качестве параметра указан вызывающий объект,
        // возвращаем логическое значение true
        if(o.a == a && o.b == b){
            return true;
        // Иначе возвращаем false
        } else{
            return false;
        }
    }
}

// Пример 1.2:
class PassObj {
    public static void main(String[] args) {
        Test obj1 = new Test(100, 22);
        Test obj2 = new Test(100, 22);
        Test obj3 = new Test(-1, -1);

        System.out.println("obj1 == obj2: " + obj1.equalTo(obj2));
        System.out.println("obj1 == obj3: " + obj1.equalTo(obj3));
    }
}