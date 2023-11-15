package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Formateable;

public class MayusDecorator extends TextoDecorador{

    public MayusDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
