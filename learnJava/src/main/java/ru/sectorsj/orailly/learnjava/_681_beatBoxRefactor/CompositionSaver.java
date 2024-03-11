package ru.sectorsj.orailly.learnjava._681_beatBoxRefactor;

import java.io.*;

public class CompositionSaver {

    // Метод для сохранения состояния флажков в файл
    public static void saveComposition(boolean[] checkboxState, String fileName) {
        try {
            FileOutputStream fileStream = new FileOutputStream(new File(fileName));
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(checkboxState);
            os.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Метод для загрузки состояния флажков из файла
    public static boolean[] loadComposition(String fileName){
        boolean[] checkboxState = null;
        try {
            FileInputStream fileInStream = new FileInputStream(new File(fileName));
            ObjectInputStream ois = new ObjectInputStream(fileInStream);
            checkboxState = (boolean[]) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return checkboxState;
    }
}