package org.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server2 {
    public static void main(String[] args) {
        try {
            AdderImpl adder = new AdderImpl();
            LocateRegistry.createRegistry(1098);
            Naming.rebind("AdderService2", adder);
            System.out.println("Server 2 pornit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
