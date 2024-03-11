package ru.sectorsj.orailly.learnjava._646_rmiDemo;

import java.rmi.*;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    public int add(int x, int y) throws RemoteException;
}
