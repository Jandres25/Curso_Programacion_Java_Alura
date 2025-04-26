package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor del préstamo
        System.out.print("Ingrese el valor del préstamo: ");
        double valor = scanner.nextDouble();

        // Verificar si el valor ingresado está dentro del rango permitido (1000 a 5000)
        if (valor >= 1000 && valor <= 5000) {
            System.out.println("El valor " + valor + " está dentro del intervalo permitido para el préstamo.");
        } else {
            System.out.println("El valor " + valor + " no está dentro del intervalo permitido para el préstamo.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
