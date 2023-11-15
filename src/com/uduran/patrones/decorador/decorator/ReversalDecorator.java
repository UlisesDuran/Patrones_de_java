package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Formateable;

public class ReversalDecorator extends TextoDecorador{

    public ReversalDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
}
