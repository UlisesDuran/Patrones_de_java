package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {
    public PizzaNewYorkPepperoni(){
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Extra Pepperoni");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 180ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangular.");
    }
}
