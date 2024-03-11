package ru.sectorsj.book.shild.javaguade._6_classes_163_184._6_4_2_0_return_values_173;

/**
 * 6.4.2.0 - ВОЗВРАТ ЗНАЧЕНИЙ
 *
 * Несмотря на то, что реализация метода volume() переносит расчет
 * объема параллелепипеда в пределы класса Вох,
 * которому принадлежит этот метод,
 * такой способ расчета не является наилучшим.
 *
 * Вопрос:
 * что делать, если в другой части программы требуется
 * знать объем параллелепипеда без его вывода?
 *
 * Рациональный способ реализации метода volume() состоит в том,
 * чтобы рассчитать объем параллелепипеда
 * и возвратить результат вызывающему коду.
 *
 * Пример 1.1, 1.2:
 *
 * Результат выполнения программы:
 * Объем равен 3000.0
 * Объем равен 162.0
 *
 *
 * В примере 1.2:
 * 1) в правой части операции присваивания
 *    выполняется вызов метода volume()
 *
 * 2) в левой части этой операции находится переменная,
 *    в данном случае vol, которая будет принимать значение,
 *    возвращаемое методом volume().
 *
 * 3) После выполнения операции:
 *    vol = mybox1.volume();
 *    метод mybox1.volume() возвращает значение 3000,
 *    и это значение рассчитанного объема
 *    сохраняется в переменной vol.
 *
 * При обращении с возвращаемыми значениями
 * следует понимать 3 важных обстоятельства:
 * 1) Тип данных, возвращаемых методом,
 *    должен быть совместим с возвращаемым типом, указанным в методе.
 *      а) если какой-нибудь метод должен
 *         возвращать логический тип boolean,
 *         то возвратить из него целочисленное значение нельзя
 *
 * 2) Переменная, принимающая возвращаемое методом значение (например, vol),
 *    также должна быть совместима с возвращаемым типом, указанным для метода.
 *
 * 3) Приведенную выше программу можно написать в более эффективной форме,
 *    поскольку переменная vol в действительности совсем не нужна.
 *
 *    Метод volume() также можно вызвать непосредственно
 *    в операторе с вызовом метода println():
 *      System.out.println("Объем равен" + mybox2.volume());
 *
 *      а) в этом случае метод:
 *              mybox2.volume()
 *         будет вызываться автоматически
 *         при выполнении оператора с вызовом метода
 *              println()
 *      б) а возвращаемое им значение
 *         будет передаваться методу
 *              println()
 */

class Box {

    // Пример 1.1:
    double width;
    double height;
    double depth;

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}


class BoxDemo4 {
    public static void main(String[] args) {

        // Пример 1.2
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // Присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // Присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Получить объем 1-го параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем 2-го параллелепипеда
        System.out.println("Объем равен " + mybox2.volume());
    }
}