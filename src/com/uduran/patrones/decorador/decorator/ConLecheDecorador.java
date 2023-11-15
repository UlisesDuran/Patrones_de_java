package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 1.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", con leche.";
    }
}
