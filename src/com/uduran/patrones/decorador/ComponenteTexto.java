package com.uduran.patrones.decorador;

public class ComponenteTexto implements Formateable{

    private String texto;

    public ComponenteTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String darFormato() {
        return getTexto();
    }
}
