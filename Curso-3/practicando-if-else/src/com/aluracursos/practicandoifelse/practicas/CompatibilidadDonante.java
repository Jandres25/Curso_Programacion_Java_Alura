package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class CompatibilidadDonante {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del donante
        System.out.print("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        // Solicitar el peso del donante
        System.out.print("Ingrese el peso del donante (en kg): ");
        double peso = scanner.nextDouble();

        // Verificar si el donante cumple ambos criterios
        if (edad >= 18 && edad <= 65 && peso > 50) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible.");

            // Indicar cuál criterio no se cumplió.
            if (edad < 18 || edad > 65) {
                System.out.println("Motivo: Debe tener entre 18 y 65 años.");
            }
            if (peso <= 50) {
                System.out.println("Motivo: Debe pesar más de 50 kg.");
            }
        }
        // Cerrar el Scanner
        scanner.close();
    }
}
