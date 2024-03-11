package ru.sectorsj.java_for_biginners._12_multithreading._454_synchronized_threads_demo;


// Класс для создания потоков:
class MyThread extends Thread {
    // Ссылка на объект с целочисленным полем класса MyNumber
    private MyNumber obj;

    // Интервал приостановки в выполнении потока:
    private int time;

    // Количество циклов:
    private int count;

    //Поле логического типа:
    private boolean state;

    MyThread(String name, MyNumber obj, int time, int count, boolean state) {
        // Вызов конструктора суперкласса:
        super(name);

        // Ссылка на объект
        this.obj = obj;

        // Интервал задержки:
        this.time = time;

        // Количество циклов:
        this.count = count;

        // Значение поля логического типа:
        this.state = state;

        // Запуск потока:
        start();
    }

    // Метод для отображения "линии" из символов:
    private void line() {

        // Локальная символьная переменная:
        char s;

        // Значение переменной:
        if (state) s = '-';
        else s = '*';

        // Отображение последовательности символов:
        for (int k = 1; k <= 35; k++) {
            System.out.print(s);
        }
        System.out.println("");
    }

    // Переопределение метода run():
    @Override
    public void run() {

        // Оператор цикла:
        for (int k = 1; k <= count; k++) {

            //Блок синхронизации:
            synchronized (obj) {

                // Отображается "линия":
                line();

                // Отображение сообщения:
                System.out.println("Поток " + getName() + ": исходное значение " + obj.number);
                // Контролируемый код:
                try {
                    // Задержка в выполнении потока:
                    Thread.sleep(time);
                } // Обработка исключения:
                catch (InterruptedException e) {
                    System.out.println("something went wrong" + e);
                }

                // Изменение значения поля объекта:
                if (state) obj.number++;
                else obj.number--;

                //Отображение сообщения:
                System.out.println("Поток " + getName() + ": новое значение " + obj.number);

                // Отображение "линии";
                line();
            } // Завершение блока синхронизации
        }
    }
}
