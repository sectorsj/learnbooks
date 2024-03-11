package ru.sectorsj.orailly.learnjava._671_DNDMasterTools;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer {
    HashMap serviceList;

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://127.0.0.1:5000/" + "ServiceServer", new ServiceServerImpl());
        } catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Remote service is running");
    }

    public ServiceServerImpl() throws RemoteException {
        setUpService();
    }

    private void setUpService() {
        serviceList = new HashMap();
        serviceList.put("DiceRolling Service", new DiceServiceNew());
        serviceList.put("Day of the Week Service", new DayOfTheWeekServiceNew());
        serviceList.put("Visual Music Service", new VisualMusicServiceNew());
    }

    @Override
    public Object[] getServiceList(){
        System.out.println("in remote");
        return serviceList.keySet().toArray();
    }

    @Override
    public Service getService(Object serviceKey) throws RemoteException {
        Service theService = (Service) serviceList.get(serviceKey);
        return theService;
    }
}