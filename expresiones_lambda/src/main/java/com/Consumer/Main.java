package com.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Carlos", 85.5));
        estudiantes.add(new Estudiante("Ana", 92.0));
        estudiantes.add(new Estudiante("Jose", 78.3));
        estudiantes.add(new Estudiante("Maria", 88.9));

        // Usar una expresión Lambda con consumer para imprimir el nombre de cada estudiante
        Consumer<Estudiante> imprimirNombre = estudiante -> System.out.println(estudiante.getNombre());

        // Aplicar el consumer a cada elemento de la lista
        estudiantes.forEach(imprimirNombre);
    }
}
