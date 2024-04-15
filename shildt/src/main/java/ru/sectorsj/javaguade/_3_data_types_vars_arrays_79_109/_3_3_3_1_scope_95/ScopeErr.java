package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_3_3_1_scope_95;

/**
 * следующая программа ошибочна:
 * Пример 1:
 *
 * // Скомпилировать эту программу нельзя
 */
public class ScopeErr{

    public static void main(String[] args) {
        int bar = 1;
        {
            // создается новая область действия.
            // Ошибка во время компиляции
            // переменная bar уже определена!
            // int bar = 2;
        }
    }
}
