package ru.sectorsj.orailly.learnjava._646_rmiDemo;

import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            Adder stub = new AdderRemote();
            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000" + "/rmt", stub);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}