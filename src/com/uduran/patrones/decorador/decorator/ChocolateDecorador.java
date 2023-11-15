package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Configurable;

public class ChocolateDecorador extends CafeDecorador{

    public ChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
