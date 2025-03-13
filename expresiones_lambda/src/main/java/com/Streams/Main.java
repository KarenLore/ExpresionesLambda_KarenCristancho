package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.expresiones.Persona;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Ana", 23));
        personas.add(new Persona("Jose", 30));
        personas.add(new Persona("Maria", 20));

        // Filtrar personas mayores de edad
        List<Persona> mayoresDeEdad = personas.stream()
                .filter(p -> p.getEdad() >= 18)
                .collect(Collectors.toList());
        System.out.println("Mayores de edad: " + mayoresDeEdad);
        // Obtener los nombres de las personas
        List<String> nombres = personas.stream()
                .map(Persona::getNombre)
                .collect(Collectors.toList());
        System.out.println("Nombres: " + nombres);
        // Calcular la suma de las edades
        int sumaEdades = personas.stream()
                .map(Persona::getEdad)
                .reduce(0, Integer::sum);
        System.out.println("Suma de las edades: " + sumaEdades);
    }
}
