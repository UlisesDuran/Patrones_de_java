package com.uduran.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{

    private List<Component> hijos;

    public Directory(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directory addComponent(Component c){
        c.anidado = true;
        this.hijos.add(c);
        return this;
    }

    public void removeComponent(Component c){
        c.anidado = false;
        hijos.remove(c);
    }

    @Override
    public String show(int nivel, Component directory) {
        if (!directory.anidado && nivel>0){
            nivel = 0;
        }
        StringBuilder sb = new StringBuilder(" ".repeat(nivel));
        sb.append(nombre).append("/");
        if (directory instanceof File){
            sb.append("\n");
        }
        for (Component c: hijos){
            sb.append(c.show(nivel+nombre.length()+1, c));
            if (c instanceof File) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean search(String nombre) {
        if (this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
        /*
        for (Component c: this.hijos){
            if (c.search(nombre)){
                return true;
            }
        }

         */
        return hijos.stream().anyMatch(h -> h.search(nombre));
    }
}
