package com.uduran.patrones.composite;

public class File extends Component{

    public File(String nombre) {
        super(nombre);
    }

    @Override
    public String show(int nivel, Component file) {
        if (!file.anidado && nivel>0){
            nivel = 0;
        }
        return " ".repeat(nivel)+nombre;
    }

    @Override
    public boolean search(String nombre) {
        return this.nombre.equals(nombre);
    }
}
