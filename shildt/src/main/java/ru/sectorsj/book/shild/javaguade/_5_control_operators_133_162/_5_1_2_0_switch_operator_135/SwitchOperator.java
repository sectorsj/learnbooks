package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_2_0_switch_operator_135;

    /**
     * 5.1.2.0 - Оператор switch
     *
     * В языке Java оператор switch
     * является оператором ветвления.
     *
     * switch - предоставляет простой способ
     *          направить поток исполнения команд
     *          по разным ветвям кода,
     *          в зависимости от значения управляющего выражения.
     *
     * 1) Оператор switch оказывается эффективнее
     *    длинных последовательностей операторов
     *    в конструкции if-else-if.
     *
     * Общая форма:
     *
     * switch (выражение) {
     *    case значение₁:
     *        // последовательность операторов
     *        break;
     *    case значение₂:
     *        // последовательность операторов
     *        break;
     * ...
     * ...
     * ...
     *    case значениеₙ:
     *        // последовательность операторов
     *        break;
     *    default: // последовательность операторов по умолчанию
     * }
     *
     * Несколько условий для использования Switch:
     *
     * 1) указанное выражение должно иметь тип:
     *    а) до JDK 7:
     *        - byte
     *        - short
     *        - int
     *        - char
     *        - Enum (перечислимый тип) - (глава 12)
     *    б) с JDK 7:
     *        - byte
     *        - short
     *        - int
     *        - char
     *        - Enum
     *        - String
     *
     * 2) Каждое значение, определенное в операторах
     *    ветвей выбора case, должно быть:
     *      - однозначным
     *      - константным
     *      - выражением (например, литеральным значением).
     *
     * 3) Дублирование значений в операторах
     *    ветвей выбора case не допускается.
     *
     * 4) Каждое значение должно быть
     *    совместимо по типу с указанным выражением.
     *
     * 5) Алгоритм работы оператор switch:
     *    а) Значение выражения сравнивается
     *       с каждым значением в операторах
     *       ветвей выбора case.
     *    б) При обнаружении совпадения
     *       выполняется последовательность кода,
     *       следующая после оператора
     *       данной ветви выбора case.
     *    в) Если значения ни одной из констант
     *       в операторах ветвей выбора case
     *       не совпадают со значением выражения,
     *       то выполняется оператор выбора по умолчанию default.
     *    г) Указывать этот оператор необязательно.
     *    д) Если совпадений со значениями констант
     *       в операторах ветвей выбора case не происходит,
     *       а оператор default отсутствует,
     *       то никаких дальнейших действий не выполняется.
     *
     * 6) break - оператор для прерывания последовательности операторов
     *            в ветвях выбора оператора switch.
     *
     * 7) Как только очередь
     *    доходит до оператора break,
     *    выполнение продолжается
     *    с первой же строки кода,
     *    следующей после всего оператора switch.
     *
     * 8) Оператор break предназначен
     *    для немедленного выхода
     *    из оператора switch.
     *
     */
public class SwitchOperator {
}