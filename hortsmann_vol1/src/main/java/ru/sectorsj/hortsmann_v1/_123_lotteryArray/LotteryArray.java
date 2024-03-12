package ru.sectorsj.hortsmann_v1._123_lotteryArray;

class LotteryArray {
    public static void main(String[] args) {
        final int N_MAX = 10;

        // выделяем память под треугольный массив
        int[][] chances = new int[N_MAX + 1][];
        for (int n = 0; n <= N_MAX; n++) {
            chances[n] = new int[n + 1];
        }

        // заполняем треугольный массив
        for (int n = 0; n < chances.length; n++) {
            for (int k = 0; k < chances[n].length; k++) {
                // вычисляем биномиальный коэффициент:
                // n * (n-1) * (n-2) * ... * (n-k+l) / (1*2*3* ... *k)
                int lotterychances = 1;
                for (int i = 1; i <= k; i++) {
                    lotterychances  = lotterychances * (n - i + 1) / i;
                }
                chances[n][k] = lotterychances;
            }
        }

        // выводим треугольный массив
        for (int[] row : chances) {
            for (int chance : row) {
                System.out.printf("%4d", chance);
            }
            System.out.println();
        }
    }
}