package com.uduran.patrones.observer.ejemplo;

import com.uduran.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);

        google.addObserver((observable, obj) -> {
            System.out.println("Jonh: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Pedro: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria: " + observable);
        });

        google.modifyPrice(3000);
    }
}
