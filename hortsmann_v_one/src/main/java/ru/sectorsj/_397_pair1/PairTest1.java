package ru.sectorsj._397_pair1;

/**
 В статическом методе minmax() осуществляется перебор элементов массива
 с одновременным вычислением минимального и максимального значений.
 Для возврата обоих значений используется объект типа Pair.

 В методе compareTo() сравниваются две строки:
 - Если символьные строки одинаковы - возвращается нулевое значение;
 - Если первая символьная строка следует прежде второй
   в лексикографическом порядке - возвращается отрицательное числовое значение;
 - Иначе - возвращается положительное числовое значение.
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"У","Мэри","есть","маленький","ягненок"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class  ArrayAlg {

    public static Pair<String> minmax (String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[1];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}