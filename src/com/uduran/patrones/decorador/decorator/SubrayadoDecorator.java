package com.uduran.patrones.decorador.decorator;

import com.uduran.patrones.decorador.Formateable;

public class SubrayadoDecorator extends TextoDecorador{
    public SubrayadoDecorator(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for (int i = 0; i < largo; i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
