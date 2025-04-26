package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer lado
        System.out.print("Ingrese el primer lado: ");
        double lado1 = scanner.nextDouble();

        // Solicitar el segundo lado
        System.out.print("Ingrese el segundo lado: ");
        double lado2 = scanner.nextDouble();

        // Solicitar el tercer lado
        System.out.print("Ingrese el tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Verificar si la suma de dos lados es mayor que el tercer lado en cada caso
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
