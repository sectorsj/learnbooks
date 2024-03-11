package ru.sectorsj.orailly.learnjava._670_serviceServer;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

// Класс, реализующий интерфейс ServiceServer
// и расширяющий UnicastRemoteObject для создания удаленных объектов
public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {
    HashMap serviceList;    // Хэш-карта для хранения списка сервисов

    // Метод main, запускающий сервер
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(5001);    // Создание реестра RMI на порту 5001
            Naming.rebind("rmi://127.0.0.1:5001/" + "ServiceServer", new ServiceServerImpl());  // Регистрация сервера в реестре RMI
        } catch (Exception ex){     // Обработка исключений
            ex.printStackTrace();   // Вывод трассировки стека
        }
        System.out.println("Remote service is running");    // Вывод сообщения о запуске сервера
    }

    // Конструктор класса, выбрасывает RemoteException в случае ошибки
    public ServiceServerImpl() throws RemoteException {
        setUpService(); // Вызов метода настройки сервиса
    }

    // Метод для настройки сервиса, добавляет сервисы в хэш-карту
    private void setUpService() {
        serviceList = new HashMap();
        serviceList.put("DiceRolling Service", new DiceService());              // Добавление сервиса броска кубика в хэш-карту
        serviceList.put("Day of the Week Service", new DayOfTheWeekService());  // Добавление сервиса определения дня недели в хэш-карту
        serviceList.put("Visual Music Service", new MiniMusicService());        // Добавление сервиса визуализации музыки в хэш-карту
    }

    // Переопределение метода получения списка сервисов
    @Override
    public Object[] getServiceList(){
        System.out.println("in remote");        // Вывод сообщения о вызове метода на удаленном сервере
        return serviceList.keySet().toArray();  // Возврат массива ключей хэш-карты
    }

    // Переопределение метода получения сервиса по ключу
    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service theService = (Service) serviceList.get(serviceKey);     // Получение сервиса из хэш-карты по ключу
        return theService;                                              // Возврат найденного сервиса
    }
}