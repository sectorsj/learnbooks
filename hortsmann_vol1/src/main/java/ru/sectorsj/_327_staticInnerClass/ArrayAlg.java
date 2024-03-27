package ru.sectorsj._327_staticInnerClass;

public class ArrayAlg {
    /**
     Пара чисел с плавающей точкой
     */
    public static class Pair {
        private double first;
        private double second;

        /**
         Составляем пару из двух чисел с плавающей точкой
         * @param f     Первое число
         * @param s    Второе число
         */
        public Pair(double f, double s) {
            first = f;
            second = s;
        }

        /**
          Возвращаем 1-е число пары
         * @return  Возврат 1-го числа
         */
        public double getFirst() {
            return first;
        }

        /**
          Возвращаем 2-е число пары
         * @return Возврат 2-го числа
         */
        public double getSecond() {
            return second;
        }

        /**
         Определяем минимальное и максимальное число в массиве
         * @param values Массив чисел с плавающей точкой
         * @return Пара, первым элементом который является минимальное число,
         *              а вторым элементом - максимальное число
         */
        public static Pair minmax(double[] values) {
            double min = Double.POSITIVE_INFINITY;
            double max = Double.NEGATIVE_INFINITY;
            for (double v : values) {
                if (min > v) min = v;
                if (max < v) max = v;
            }
            return new Pair(min, max);
        }
    }
}
