package com.uduran.patrones.singleton;

import java.util.Objects;

public class ConexionBDSingleton {

    /*
    El patron singleton nos permite crear una sola instancia de un objeto y se suele utilizar para bases de datos.
     */
    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton(){
        System.out.println("Conectandose a algun motor de base de datos");
    }

    public static ConexionBDSingleton getInstance(){
        if (Objects.isNull(instancia)){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
