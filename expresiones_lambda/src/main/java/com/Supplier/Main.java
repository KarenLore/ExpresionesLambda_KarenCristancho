package com.Supplier;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import com.expresiones.Persona;

public class Main {
    public static void main(String[] args) {

        // Crear un array de nombres posibles
        String[] nombres = { "Carlos", "Ana", "Jose", "Maria", "Luis" };

        // Crear un Set para rastrear nombres ya usados
        Set<String> nombresUsados = new HashSet<>();

        // Crear un Supplier que proporciona instancias de Persona sin nombres repetidos
        Supplier<Persona> generarPersonaAleatoria = () -> {
            Random random = new Random();
            String nombreAleatorio = null;

            // Encontrar un nombre que no haya sido usado
            while (true) {
                nombreAleatorio = nombres[random.nextInt(nombres.length)];
                if (!nombresUsados.contains(nombreAleatorio)) {
                    nombresUsados.add(nombreAleatorio);
                    break;
                }
            }
            int edadAleatoria = 18 + random.nextInt(43); // Edad entre 18 y 60
            return new Persona(nombreAleatorio, edadAleatoria);
        };

        // Usar el Supplier para obtener instancias de Persona
        for (int i = 0; i < nombres.length; i++) {
            Persona persona = generarPersonaAleatoria.get();
            System.out.println(persona);
        }
    }
}