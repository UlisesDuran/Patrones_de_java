package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Formateable;

public class ReeplazarEspaciosDecorator extends TextoDecorador{

    public ReeplazarEspaciosDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
