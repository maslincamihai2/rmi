package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {
    int add(int[] arr) throws RemoteException;
}
