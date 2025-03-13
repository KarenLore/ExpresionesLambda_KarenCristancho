package com.Listas_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.expresiones.Persona;

// public class Main {
//     public static void main(String[] args) {
//         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//         Predicate<Integer> esPar = n -> n % 2 == 0;
//         List<Integer> numerosPares = numeros.stream()
//                 .filter(esPar)
//                 .collect(Collectors.toList());
//         System.out.println("Números pares: " + numerosPares);
//     }
// }

// Realizando el ejercicio con la clase Persona y que sea mayor a 18
public class Main {
    public static void main(String[] args) {
         List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 15));
        personas.add(new Persona("Ana", 23));
        personas.add(new Persona("Jose", 30));
        personas.add(new Persona("María", 10));
        personas.add(new Persona("Lucia", 45));
        personas.add(new Persona("Karen", 15));
        personas.add(new Persona("Dayana", 18));

        Predicate<Persona> esMayor = p -> p.getEdad() >=18;

        List<Persona> mayorEdad = personas.stream()
            .filter(esMayor)
            .collect(Collectors.toList());

        // System.out.println("Personas mayores de 18 años: " + mayorEdad);
        Consumer<Persona> imprimirNombre = persona -> System.out.println(persona.getNombre());
        mayorEdad.forEach(imprimirNombre);
    }
}