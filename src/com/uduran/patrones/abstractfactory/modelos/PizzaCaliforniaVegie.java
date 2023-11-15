package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegie extends PizzaProducto {

    public PizzaCaliforniaVegie(){
        super();
        nombre = "Pizza vegetariana Californiana";
        masa = "Masa Delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("Queso Vegano Mozzarella");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
        ingredientes.add("Cebolla");
    }
    
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares.");
    }
}
