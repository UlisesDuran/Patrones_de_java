package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {
    public PizzaCaliforniaPepperoni(){
        super();
        nombre = "Pizza Pepperoni California";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarella Extra");
        ingredientes.add("Extra Pepperoni");
    }

    @Override
    public void cocinar() {
        System.out.println("Confinando por 40 min. a 180ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangular.");
    }
}
