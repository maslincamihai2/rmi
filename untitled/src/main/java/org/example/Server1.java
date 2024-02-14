package org.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server1 {
    public static void main(String[] args) {
        try {
            AdderImpl adder = new AdderImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("AdderService1", adder);
            System.out.println("Server 1 pornit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
