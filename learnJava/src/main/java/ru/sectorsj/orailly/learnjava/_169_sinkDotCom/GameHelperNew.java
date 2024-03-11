package ru.sectorsj.orailly.learnjava._169_sinkDotCom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelperNew {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();

            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<>();
        String [] alphacoords = new String[comSize];                        // хранит координаты типа f6
        String temp = null;                                                 // временная строка для конкатенации
        int[] coords = new int[comSize];                                    // координаты текущего сайта
        int attempts = 0;                                                   // счетчик текущих попыток
        boolean success = false;                                            // найдено подходящее местположение
        int location = 0;                                                   // текущее начальное местоположение

        comCount++;                                                         // N-ый сайт для размещения
        int incr = 1;                                                       // устанавливаем горизонтальный инкремент
        if ((comCount % 2) == 1) {                                          // если нечетный (размещаем вертикально)
            incr = gridLength;                                              // устанавливаем вертикальный инкремент
        }

        while (!success & attempts++ < 200) {                               // главный поисковый цикл
            location = (int) (Math.random() * gridSize);                    // получаем случайную стартовую точку
            // System.out.println("Пробуем " + location);                   // + бонус код
            int x = 0;                                                      // N-ая позиция позиция в "сайте", который нужно разместить
            success = true;                                                 // предполагаем успешный исход

            while (success && x < comSize){                                 // ищем соседнюю неиспользованную ячейку
                if (grid[location] == 0) {                                  // если еще не используется
                    coords[x++] = location;                                 // сохраняем местоположение
                    location += incr;                                       // пробуем "следующую" соседнюю ячейку
                    if (location >=gridSize) {                              // вышли за рамки - низ
                        success = false;                                    // неудача
                    }
                    if (x > 0 && (location % gridLength == 0)) {            // вышли за рамки - правый край
                        success = false;                                    // неудача
                    }
                } else {                                                    // нашли уже использующееся местоположение
                    // System.out.println("Используетеся " + location);     // + бонус код
                    success = false;                                        // неудача
                }
            }
        }

        int x = 0;                                                          // переводим местоположение в символьные координаты
        int row = 0;                                                        //
        int column = 0;                                                     //
        // System.out.println("\n");                                        // + бонус код
        while (x < comSize) {                                               // помечаем ячейки на главной сетке как "использованные"
            grid[coords[x]] = 1;                                            // получаем значение строки
            row = (int) (coords[x] / gridLength);                           // получаем числовое значение столбца
            column = coords[x] % gridLength;                                // преобразуем его в строковый символ
            temp = String.valueOf(alphabet.charAt(column));                 //
            alphaCells.add(temp.concat(Integer.toString(row)));             //
            x++;                                                            //
            // System.out.println(" coord  " + x + " = " + alphaCells.get(x-1));  // +бонус код, местоположение, где находится наш "сайт"
        }
        // System.out.println("\n");                                        // + бонус код
        return alphaCells;                                                  // возвращаем список
    }
}
