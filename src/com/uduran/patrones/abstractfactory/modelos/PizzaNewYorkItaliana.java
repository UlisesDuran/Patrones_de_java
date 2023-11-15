package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {
    public PizzaNewYorkItaliana(){
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiana con carne";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 160ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes.");
    }
}
