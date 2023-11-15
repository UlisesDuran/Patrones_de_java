package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Formateable;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
