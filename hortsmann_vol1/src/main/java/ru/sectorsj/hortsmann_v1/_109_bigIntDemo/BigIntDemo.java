package ru.sectorsj.hortsmann_v1._109_bigIntDemo;

import java.math.BigInteger;

class BigIntDemo {
    public static void main(String[] args) {
        BigInteger reallyBig = new BigInteger("222232244629420445529739893461909967206666939096499764990979600");
        BigInteger a = BigInteger.valueOf(100);
        BigInteger b = BigInteger.valueOf(20);
        BigInteger c = a.add(b);
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2)));
        System.out.println(c);
        System.out.println(d);
        System.out.println(reallyBig);

    }
}
