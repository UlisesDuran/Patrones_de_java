package com.uduran.patrones.decorador.ejemplo;

import com.uduran.patrones.decorador.ComponenteTexto;
import com.uduran.patrones.decorador.Formateable;
import com.uduran.patrones.decorador.decorator.MayusDecorator;
import com.uduran.patrones.decorador.decorator.ReversalDecorator;
import com.uduran.patrones.decorador.decorator.SubrayadoDecorator;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new ComponenteTexto("Hola que tal andres!");
        MayusDecorator mayuscula = new MayusDecorator(texto);
        ReversalDecorator reversal = new ReversalDecorator(mayuscula);
        SubrayadoDecorator subrayado = new SubrayadoDecorator(reversal);
        System.out.println(subrayado.darFormato());

        /*
        De esta manera el objeto texto pasa por todos los decoradores sin cambiar de instancia y vamos modificando
        recursivamente el texto que hemos ingresado sin necesidad de crear nuevos objetos.
         */
    }
}
