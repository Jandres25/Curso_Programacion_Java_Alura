package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class Aprobado {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos el promedio final del estudiante
        System.out.print("Ingresa el promedio final del estudiante: ");
        double media = scanner.nextDouble();

        // Determinamos la situación del estudiante basado en su promedio
        if (media >= 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue aprobado.");
        } else if (media >= 5.0) {  // Aquí se garantiza que media es menor a 7, pero mayor o igual a 5
            System.out.println("El estudiante tuvo un promedio de " + media + " y está en recuperación.");
        } else {
            System.out.println("El estudiante tuvo un promedio de " + media + " y fue reprobado.");
        }

        // Cerramos el scanner
        scanner.close();
    }
}
