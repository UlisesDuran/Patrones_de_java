package com.uduran.patrones.composite;

import java.util.Objects;

abstract public class Component {

    protected String nombre;
    protected boolean anidado;

    public Component(String nombre){
        this.nombre = nombre;
        this.anidado = false;
    }

    public String getNombre() {
        return nombre;
    }

    abstract public String show(int nivel, Component c);

    abstract public boolean search(String nombre);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(nombre, component.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
