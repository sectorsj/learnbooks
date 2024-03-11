package ru.sectorsj.orailly.learnjava._646_rmiDemo;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {

    public AdderRemote() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y)  {
        return x + y;
    }
}