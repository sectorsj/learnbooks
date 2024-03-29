package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_1_2_0_constructors_overloading_188;


/**
 * 7.1.2.0 - ПЕРЕГРУЗКА КОНСТРУКТОРОВ
 *
 * Наряду с перегрузкой обычных методов
 * можно также выполнять перегрузку методов-конструкторов.
 *
 * Перегружаемые конструкторы станут скорее нормой,
 * а не исключением для большинства классов,
 * которые вам придется создавать на практике.
 *
 * Чтобы стали понятнее причины этого,
 * нужно вернуться к классу Вох,
 * разработанному в главе 6.
 *
 * Пример 1:
 * Последняя версия класса Box (раздел 6.5.2.0).
 *
 * class Box{
 *     double width;
 *     double height;
 *     double depth;
 *     // Конструктор класса Box
 *     public Box(double w, double h, double d) {
 *         width = w;
 *         height = h;
 *         depth = d;
 *     }
 *     // Рассчитать и возвратить объем
 *     double volume() {
 *         return width * height * depth;
 *     }
 * }
 *
 *
 * Конструктору Вох()
 * требуется передать 3и параметра.
 *
 * Во всех объявлениях объектов класса Вох
 * конструктору Вох()
 * должны передаваться 3и аргумента.
 *
 * Следующая строка кода недопустима:
 * Вох оbj = new Вох();
 *
 * Вызов конструктора Вох()
 * без аргументов приводит к ошибке,
 * поскольку ему следует
 * непременно передать три аргумента.
 *
 * Вопросы:
 * 1) Если требуется определить параллелепипед,
 *    а его начальные размеры:
 *      а) не имеют значения
 *            или
 *      б) вообще неизвестны?
 *
 * 2) можно ли инициализировать куб,
 *    указав одно значение
 *    для всех трех измерений?
 *
 * Текущее определение класса Вох
 * не дает ответы на эти вопросы,
 * поскольку запрашиваемые дополнительные возможности
 * в нем отсутствуют.
 */
class ConstructorOverload {
}