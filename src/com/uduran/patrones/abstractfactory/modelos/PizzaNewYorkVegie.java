package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkVegie extends PizzaProducto {

    public PizzaNewYorkVegie(){
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral Vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
    }
    
    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150ªC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
