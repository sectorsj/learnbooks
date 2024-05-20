package ru.sectorsj._506_sieve;

import java.util.BitSet;

public class Sieve {
    public static void main(String[] args) {
        int number = 2000000;
        long start = System.currentTimeMillis();
        BitSet bitSet = new BitSet(number + 1);

        int count = 0;
        int i;
        for (i = 0; i <= number; i++) {
            bitSet.set(i);
        }
        i = 2;

        while (i * i <= number) {
            if (bitSet.get(i)) {
                count++;
                int k = 2 * i;
                while (k <= number) {
                    bitSet.clear(k);
                    k += i;
                }
            }
            i++;
        }
        while (i <= number) {
            if (bitSet.get(i)) {
                count++;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(count + " primes");
        System.out.println((end - start) + " milliseconds");
    }
}