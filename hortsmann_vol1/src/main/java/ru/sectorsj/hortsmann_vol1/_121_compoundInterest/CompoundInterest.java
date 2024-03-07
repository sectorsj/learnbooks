package ru.sectorsj.hortsmann_vol1._121_compoundInterest;

public class CompoundInterest {
    public static void main(String[] args) {
        final double START_RATE = 10;
        final int N_RATES = 6;
        final int N_YEARS = 10;

        // Установить процентные ставки 10 ... 15%
        double[] interestRate = new double[N_RATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (START_RATE + j) / 100.0;
        }
        double[][] balances = new double[N_YEARS][N_RATES];

        // Установить исходные остатки на счету равными 10000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }

        // Рассчитать проценты на следующие годы
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // Получить остатки на счету за прошлый год
                double oldBalance = balances[i - 1][j];

                // Рассчитать проценты
                double interest = oldBalance * interestRate[j];

                // Рассчитать остатки на счету в текущем году
                balances[i][j] = oldBalance + interest;
            }
        }

        // Вывести один ряд процентных ставок
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();
        // Вывести таблицу остатков на счету
        for (double[] row : balances) {

            // Вывести строку таблицы
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}