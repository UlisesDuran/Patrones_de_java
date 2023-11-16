package com.uduran.patrones.observer.ejemplo;

import com.uduran.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviado un mail al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un mail al admin"));
        repo.addObserver((o, u) -> System.out.println("Guardando usuario " + u + " en el logs"));
        repo.crearUsuario("Andres");
    }
}
