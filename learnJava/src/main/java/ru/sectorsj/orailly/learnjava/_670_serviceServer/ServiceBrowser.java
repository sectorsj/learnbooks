package ru.sectorsj.orailly.learnjava._670_serviceServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.rmi.Naming;

// Класс для просмотра сервисов
public class ServiceBrowser {
    JPanel mainPanel;       // Панель для размещения компонентов
    JComboBox serviceList;  // Выпадающий список для выбора сервисов
    ServiceServer server;   // Сервер, предоставляющий сервисы

    // Метод main, запускающий приложение
    public static void main(String[] args) {
        new ServiceBrowser().buildGUI();    // Создание экземпляра и вызов метода buildGUI()
    }

    // Метод для построения графического интерфейса
    public void buildGUI(){
        JFrame frame = new JFrame("RMI Browser");                  // Создание главного окна с заголовком
        mainPanel = new JPanel();                                       // Создание панели
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);     // Добавление панели в главное окно
        Object[] services = getServiceList();                           // Получение списка доступных сервисов
        serviceList = new JComboBox(services);                          // Создание выпадающего списка на основе полученного списка
        serviceList.addActionListener(new MyListListener());            // Добавление слушателя событий для выпадающего списка
        frame.getContentPane().add(BorderLayout.NORTH, serviceList);    // Добавление выпадающего списка в верхнюю часть главного окна
        frame.setSize(500, 500);                           // Установка размеров главного окна
        frame.setVisible(true);                                         // Отображение главного окна
    }

    // Метод для загрузки выбранного сервиса
    void loadService(Object serviceSelection) {
        try {
            Service svc = server.getService(serviceSelection);  // Получение выбранного сервиса
            mainPanel.removeAll();                              // Очистка панели
            mainPanel.add(svc.getGuiPanel());                   // Добавление на панель GUI выбранного сервиса
            mainPanel.validate();                               // Проверка валидности панели
            mainPanel.repaint();                                // Перерисовка панели
        } catch (Exception ex){     // Обработка исключений
            ex.printStackTrace();   // Вывод трассировки стека
        }
    }

    // Метод для получения списка доступных сервисов
    Object[] getServiceList() {
        Object obj = null;          // Объект для хранения информации о сервисе
        Object[] services = null;   // Массив для хранения списка сервисов

        try {
            obj = Naming.lookup("rmi://127.0.0.1:5001/ServiceServer");  // Поиск сервиса по URL
        } catch (Exception ex) {    // Обработка исключений
            ex.printStackTrace();   // Вывод трассировки стека
        }
        server = (ServiceServer) obj;   // Приведение объекта к типу ServiceServer

        try {
            // assert server != null;
            services = server.getServiceList(); // Получение списка сервисов от сервера
        } catch (Exception ex) {    // Обработка исключений
            ex.printStackTrace();   // Вывод трассировки стека
        }
        return services;    // Возвращение списка сервисов
    }

    // Внутренний класс для обработки событий выбора сервиса из выпадающего списка
    private class MyListListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object selection = serviceList.getSelectedItem();   // Получение выбора пользователя из выпадающего списка
            loadService(selection);                             // Загрузка выбранного сервиса
        }
    }
}