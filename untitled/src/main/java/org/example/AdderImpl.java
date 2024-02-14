package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderImpl extends UnicastRemoteObject implements Adder {
    protected AdderImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int[] arr) throws RemoteException {
        int suma = 0;

        System.out.println("Elementele subsirului: ");
        for(int i = 0; i < arr.length; i++){
            suma += arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println("Suma elementelor din subsir");
        return suma;
    }
}
