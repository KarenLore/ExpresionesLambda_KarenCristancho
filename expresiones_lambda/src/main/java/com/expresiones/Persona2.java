package com.expresiones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona2 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Ana", 23));
        personas.add(new Persona("Jose", 30));
        personas.add(new Persona("María", 20));

        // Usar un Comparator con expresión lambda para ordenar por edad
        Comparator<Persona> porEdad = (p1, p2) -> Integer.compare(p1.getEdad(),p2.getEdad());
        Collections.sort(personas, porEdad);
        // Mostrar la lista ordenada
        personas.forEach(System.out::println);
    }
}
