package ru.sectorsj.orailly.learnjava._646_rmiDemo;

import java.rmi.*;
public class MyClient {
    public static void main(String[] args) {
        try {
            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/rmt");
            System.out.println(stub.add(34, 4));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}