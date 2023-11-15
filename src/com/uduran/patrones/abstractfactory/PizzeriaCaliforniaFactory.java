package com.uduran.patrones.abstractfactory;

import com.uduran.patrones.abstractfactory.modelos.PizzaCaliforniaPepperoni;
import com.uduran.patrones.abstractfactory.modelos.PizzaCaliforniaQueso;
import com.uduran.patrones.abstractfactory.modelos.PizzaCaliforniaVegie;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String sabor) {
        return switch (sabor){
           case "pepperoni" -> new PizzaCaliforniaPepperoni();
           case "vegetariana" -> new PizzaCaliforniaVegie();
           case "queso" -> new PizzaCaliforniaQueso();
            default -> null;
        };
    }
}
