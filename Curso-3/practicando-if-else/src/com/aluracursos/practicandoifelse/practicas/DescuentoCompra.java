package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el valor de la compra
        System.out.print("Ingrese el valor de la compra: ");
        double compra = scanner.nextDouble();

        // Verificamos si el valor de la compra es mayor o igual a 100.00
        if (compra >= 100.0) {
            double nuevoValor = compra * 0.90;
            System.out.printf("Descuento del 10%% aplicado. Nuevo valor: $%.1f\n", nuevoValor);
        } else {
            System.out.printf("Descuento no aplicado. Valor total: $%.1f\n", compra);
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
