package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el primer número
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        // Solicitar al usuario el segundo número
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Comparar los números y mostrar el mensaje correspondiente
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else if (num2 > num1) {
            System.out.println("El número mayor es " + num2);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
