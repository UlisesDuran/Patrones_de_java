package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
