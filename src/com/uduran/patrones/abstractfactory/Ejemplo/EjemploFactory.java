package com.uduran.patrones.abstractfactory.Ejemplo;

import com.uduran.patrones.abstractfactory.PizzaProducto;
import com.uduran.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import com.uduran.patrones.abstractfactory.PizzeriaNewYorkFactory;
import com.uduran.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cal = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = cal.ordenarPizza("queso");
        System.out.println("pizza = " + pizza);
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("pizza = " + pizza);
    }
}
