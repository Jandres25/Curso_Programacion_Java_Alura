package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class ValidaContrasena {
    public static void main(String[] args) {
        // Contraseña fija predefinida
        String contrasenaCorrecta = "123456";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la contraseña
        System.out.print("Ingrese la contraseña: ");
        String intentoContrasena = scanner.nextLine();

        // Comparar la contraseña ingresada con la contraseña correcta
        if (intentoContrasena.equals(contrasenaCorrecta)) {
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
