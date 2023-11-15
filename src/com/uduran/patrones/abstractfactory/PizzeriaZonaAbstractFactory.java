package com.uduran.patrones.abstractfactory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String sabor){
        PizzaProducto pizza = crearPizza(sabor);
        System.out.println("------.Fabricando la " + pizza.getNombre() + "-------");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    // Al dejar el metodo crearPizza default, restrigimos el acceso a este y solo podemos crear pizzas en la fabrica.
    abstract PizzaProducto crearPizza(String sabor);
}
