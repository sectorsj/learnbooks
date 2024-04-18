package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_3_3_0_scope_vars_expiration_92;


/**
 * 3.3.3.0 - Область видимости и срок действия переменных
 *
 * В представленных ранее примерах программ
 * все переменные объявлялись в начале метода main().
 *
 * Область видимости:
 * 1) определяет, какие именно объекты
 *    доступны для других частей программы.
 *
 * 2) Блок кода заключается в фигурные скобки,
 *    так задается область видимости (глава 2)
 *
 * 3) При открытии каждого нового блока кода,
 *    создается новая область видимости.
 *
 * 4) Область видимости определяет
 *    продолжительность существования этих объектов.
 *
 * 5) В Java допускается объявление переменных
 *    в любом блоке кода.
 *
 * Во многих других языках программирования различаются
 * 2 основные категории области видимости:
 *      1) глобальная
 *      2) локальная
 *
 * Но эти традиционные области видимости
 * не вполне вписываются в строгую
 * объектно-ориентированную модель Java.
 *
 * Несмотря на возможность задать глобальную область видимости,
 * в настоящее время такой подход
 * является скорее исключением, чем правилом.
 *
 * 2 основные области видимости в Java определяются:
 * (несмотря на то, что такое разделение несколько искусственно)
 * 1) классом (глава 6)
 *      рассмотрение области видимости класса
 *      в т.ч. объявляемых в нем переменных
 *
 * 2) методом
 *      области видимости,
 *      определяются самим методом
 *      или в его теле.
 *
 * Такое разделение имеет определенный смысл,
 * поскольку область видимости класса
 * обладает рядом характерных особенностей и свойств,
 * не распространяющихся на область видимости метода.
 *
 * Область видимости метода:
 * 1) Начинается с его открывающей фигурной скобки.
 *    Но если у метода имеются параметры,
 *    то они также включаются в область видимости метода.
 *
 *    Параметры метода действуют точно так же,
 *    как и любая другая переменная в теле метода.
 *    Рассмотрение параметров методов (глава 6).
 *
 * 2) Переменные, объявленные в области видимости,
 *    не доступны из кода за пределами этой области.
 *
 * 3) Объявление переменной в области видимости
 *    обеспечивает ее локальность и защиту
 *    от несанкционированного доступа и/или внешних изменений.
 *
 * 4) Правила области видимости
 *    служат основанием для инкапсуляции.
 *
 * 5) Области видимости могут быть вложенными.
 *
 * 6) Вместе с каждым блоком кода,
 *    создается новая,
 *    вложенная область видимости.
 *
 * Также область видимости бывает:
 * 1) внешняя:
 *      а) Внешняя область видимости
 *         включает в себя внутреннюю область
 *
 *      б) Объекты, объявленные во внешней области видимости,
 *         будут доступны для кода
 *         из внутренней области видимости,
 *         но не наоборот.
 *
 * 2) внутренняя:
 *      а) Объекты, объявленные во внутренней области видимости,
 *         будут недоступны за ее пределами.
 */
public class ScopeAndLifeTime {
}