package ru.sectorsj.orailly.learnjava._659_phraseOMaticInWeb;

public class PhraseOMatic {
    public static String makePhrase() {
        //Создаем три массива слов для выбора.
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый","взаимный", "обоюдный выигрыш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        //Вычисляем, сколько слов в каждом массиве
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем три случайных числа в пределах длины массивов
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Выводим на экран
        return("Все, что нам нужно - это " + phrase + ".");
    }
}