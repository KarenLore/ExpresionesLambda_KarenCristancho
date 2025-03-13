package com.BiConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Biconsumer {
    public static void main(String[] args) {
        // Crear un Map de claves y valores
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Mango", 25);
        items.put("Grapes", 50);

        // Definir un BiConsumer para procesar las entradas del Map
        BiConsumer<String, Integer> procesarEntrada = (clave, valor) -> System.out.println("Fruta: " + clave + ", Cantidad: " + valor);

        // Aplicar el BiConsumer a cada entrada del Map
        items.forEach(procesarEntrada);
    }
}
