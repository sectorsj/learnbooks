package ru.sectorsj._8_using_classes_and_objects._292_array_as_field_demo;

public class Binomial {
    private int[] binoms;

    Binomial(int n) {
        binoms = new int[n+1];
        binoms[0] = 1;
        for (int i = 1; i <= n; i++) {
            binoms[i] = binoms[i - 1] * (n-i+1) / i;
        }
    }

    @Override
    public String toString() {
        String txt = "|";
        for (int i = 0; i < binoms.length; i++) {
            txt += binoms[i] + "|";
        }
        return txt;
    }
}
