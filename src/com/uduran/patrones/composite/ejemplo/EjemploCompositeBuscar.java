package com.uduran.patrones.composite.ejemplo;

import com.uduran.patrones.composite.Directory;
import com.uduran.patrones.composite.File;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directory doc = new Directory("Documentos");
        Directory java = new Directory("Java");

        java.addComponent(new File("Patro-Compiste.docx"));

        Directory stream = new Directory("API Stream");
        stream.addComponent(new File("Stream-map.docx"));

        java.addComponent(stream);
        doc.addComponent(java);
        doc.addComponent(new File("CV.docx"));
        doc.addComponent(new File("Logo.jpeg"));

        //System.out.println(doc.show(0));
        boolean encontrado = doc.search("Patro-Compiste.docx");
        System.out.println("encontrado = " + encontrado);

        encontrado = doc.search("API Stram");
        System.out.println("encontrado = " + encontrado);

    }
}
