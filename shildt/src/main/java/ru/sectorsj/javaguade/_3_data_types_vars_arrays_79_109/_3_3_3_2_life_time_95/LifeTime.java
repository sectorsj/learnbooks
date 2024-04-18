package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_3_3_2_life_time_95;

/**
 * 3.3.3.2 - Срок действия переменных
 *
 * 1) Переменной нельзя пользоваться до ее объявления
 *
 * 2) Срок действия переменной ограничивается ее областью видимости.
 *
 * 3) Если объявление переменной включает в себя ее инициализацию,
 *    то инициализация переменной будет повторяться
 *    при каждом вхождении в блок кода, где она объявлена.
 *
 * Пример 1:
 * ошибочный фрагмент кода
 *
 * // Этот фрагмент кода написан неверно!
 * // Переменную count нельзя использовать до ее объявления!
 * count = 100;
 * int count;
 *
 *
 * ВАЖНО!
 * Переменные:
 * 1) создаются при входе в их область видимости
 * 2) уничтожаются при выходе из нее.
 *
 * 3) утрачивают свое значение сразу же
 *    после выхода из области ее видимости.
 *
 * 4) объявленные в теле метода,
 *    не будут хранить свои значения в промежутках
 *    между последовательными обращениями к этому методу.
 *
 * 5) объявленная в блоке кода,
 *    утратит свое значение после выхода из него.
 *
 * Эта программа выводит следующий результат:
 * равно: -1
 * теперь равно: 100
 * равно: -1
 * теперь равно: 100
 * равно: -1
 * теперь равно: 100
 *
 * Переменная "у" повторно инициализируется значением -1
 * при каждом вхождении во внутренний цикл for.
 *
 * И хотя переменной "у" впоследствии присваивается значение 100,
 * тем не менее оно теряется.
 *
 * И последнее: несмотря на то, что блоки могут быть вложенными,
 * во внутреннем блоке кода нельзя объявлять переменные с тем же именем,
 * что и во внешней области видимости.
 */
public class LifeTime {
    public static void main(String[] args) {

        // объявление переменной
        int x;

        for (int i = 0; i < 3; i++) {

            // переменная "y" инициализируется
            // при каждом вхождении в блок кода
            int y = -1;
            System.out.println("y равно: " + y);
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}