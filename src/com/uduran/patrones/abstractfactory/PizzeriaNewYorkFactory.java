package com.uduran.patrones.abstractfactory;

import com.uduran.patrones.abstractfactory.modelos.PizzaNewYorkItaliana;
import com.uduran.patrones.abstractfactory.modelos.PizzaNewYorkPepperoni;
import com.uduran.patrones.abstractfactory.modelos.PizzaNewYorkVegie;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String sabor) {
        return switch (sabor){
            case "vegetariana" -> new PizzaNewYorkVegie();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
