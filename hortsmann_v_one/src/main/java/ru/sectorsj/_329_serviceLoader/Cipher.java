package ru.sectorsj._329_serviceLoader;

public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);
    byte[] decrypt(byte[]source, byte[] key);
    int strength();
}