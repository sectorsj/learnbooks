package ru.sectorsj._329_serviceLoader;

import java.util.Optional;
import java.util.ServiceLoader;

public class ServiceLoaderTest {
    public static void main(String[] args) {
        // Optional<Cipher> optionalCipher = cipherLoader.findFirst();
        Cipher cipher = getCipher(1);
        System.out.println("check main");

        if (cipher != null){
            byte[] dataToEncrypt = "Hello World!".getBytes();
            byte[] encryptionKey = {3};     // Ключ для шифрования

            // Шифрование данных
            byte[] encryptedData = cipher.encrypt(dataToEncrypt, encryptionKey);
            System.out.println("Шифруемые данные: " + new String(encryptedData));

            // Дешифрование данных
            byte[] decryptedData = cipher.decrypt(encryptedData, encryptionKey);
            System.out.println("Дешифрованные данные: " + new String(decryptedData));
        } else {
            System.out.println("Не найдена реализация шифра с необходимой стойкостью.");
        }
    }

    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static Cipher getCipher(int minStrength) {
        // cipherLoader.iterator()
        for (Cipher cipher : cipherLoader) {
            System.out.println("Загружен шифр: " + cipher.getClass().getName());
            System.out.println("Стойкость шифра: " + cipher.strength());
            if (cipher.strength() >= minStrength) {
                System.out.println("Check getCipher");
                return cipher;
            }
        }
        return null;
    }

    public static Optional<Cipher> getCipher2(int minStrength){
        System.out.println("getCipher2");
        return cipherLoader.stream()
                .filter(descr -> descr.type() == ru.sectorsj._329_serviceLoader.impl.CaesarCipher.class)
                .findFirst()
                .map(ServiceLoader.Provider::get);
    }

    public static Optional<Cipher> getCipher3(int minStrength){
        System.out.println("getCipher3");
        return cipherLoader.stream()
                .filter(provider ->{
                    Cipher cipher = provider.get();
                    return cipher.strength() >= minStrength;
                })
                .findFirst()
                .map(ServiceLoader.Provider::get);
    }
}


//    public static void main(String[] args) {
//        // Optional<Cipher> cipher = cipherLoader.findFirst();
//        Cipher cipher = getCipher(3);
//        System.out.println("Проверка main()");
//
//        if (cipher != null) {
//            byte[] dataToEncrypt = "Hello my old fiend".getBytes();
//            byte[] encryptionKey = {3};     // Ключ для шифрования
//
//
//            byte[] encryptedData = cipher.encrypt(dataToEncrypt, encryptionKey);
//            System.out.println("Шифруемые данные: " + new String(encryptedData));
//
//            byte[] decryptedData =cipher.decrypt(encryptedData, encryptionKey);
//            System.out.println("Дешифрованные данные: " + new String(decryptedData));
//
//        } else {
//            System.out.println("main(): Не найдена реализация шифра с необходимой стойкостью.");
//        }
//    }
//
//    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);
//
//    public static Cipher getCipher(int minStrength) {
//        // cipherLoader.iterator()
//        for (Cipher cipher : cipherLoader) {
//            System.out.println("Загружен шифр: " + cipher.getClass().getName());
//            System.out.println("Стойкость шифра: " + cipher.strength());
//            if (cipher.strength() >= minStrength) {
//                System.out.println("Шифр найден с достаточной стойкостью.");
//                return cipher;
//            }
//        }
//        System.out.println("getCipher(): Не найдена реализация шифра с необходимой стойкостью.");
//        return null;
//    }
//
//    public static Optional<Cipher> getCipher2(int minStrength){
//        return cipherLoader.stream()
//                .filter(descr -> descr.type() == ru.sectorsj._329_serviceLoader.impl.CaesarCipher.class)
//                .findFirst()
//                .map(ServiceLoader.Provider::get);
//    }