package com.uduran.patrones.decorador.ejemplo;

import com.uduran.patrones.decorador.Cafe;
import com.uduran.patrones.decorador.Configurable;
import com.uduran.patrones.decorador.decorator.ChocolateDecorador;
import com.uduran.patrones.decorador.decorator.ConCremaDecorador;
import com.uduran.patrones.decorador.decorator.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Cafe Mocha ");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ChocolateDecorador conChoco = new ChocolateDecorador(conLeche);

        System.out.println("El precio del cafe Mocha es de " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes son: " + conChoco.getIngredientes());

    }
}
