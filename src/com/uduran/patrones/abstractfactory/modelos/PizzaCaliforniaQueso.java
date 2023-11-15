package com.uduran.patrones.abstractfactory.modelos;

import com.uduran.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso(){
        super();
        nombre = "Pizza California Queso";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate con rocula";
        ingredientes.add("Queso Mozzarella Extra");
        ingredientes.add("Queso Parmesano");
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
