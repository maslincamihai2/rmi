package org.example;

import java.rmi.Naming;

// clasa Main reprezinta codul clientului
public class Main {
    public static void main(String[] args) {
        try {
            Adder adder1 = (Adder) Naming.lookup("rmi://localhost/AdderService1");
            Adder adder2 = (Adder) Naming.lookup("rmi://localhost/AdderService2");

            int[] arr = {0, 1, 2, 3};
            int[] subArr1 = {arr[0], arr[1]};
            int[] subArr2 = {arr[2], arr[3]};

            int rezultat1 = adder1.add(subArr1);
            int rezultat2 = adder2.add(subArr2);

            System.out.println("Elementele sirului:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("Suma elementelor = " + (rezultat1+rezultat2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}