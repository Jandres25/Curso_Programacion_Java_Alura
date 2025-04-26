package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class SistemaSeguridad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el código de acceso
        System.out.print("Ingrese el código de acceso: ");
        int codigo = scanner.nextInt();

        // Solicitar el nivel de permiso
        System.out.print("Ingrese el nivel de permiso: ");
        int permiso = scanner.nextInt();

        // Verificar si el código es correcto (debe ser 2023)
        boolean codigoCorrecto = (codigo == 2023);
        // Verificar si el nivel de permiso es válido (1, 2 o 3)
        boolean permisoValido = (permiso == 1 || permiso == 2 || permiso == 3);

        // Si ambos criterios se cumplen, se permite el acceso
        if (codigoCorrecto && permisoValido) {
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado.");
            // Indicar el motivo de la denegación
            if (!codigoCorrecto && !permisoValido) {
                System.out.println("Motivo: Código incorrecto y nivel de permiso inválido.");
            } else if (!codigoCorrecto) {
                System.out.println("Motivo: Código incorrecto.");
            } else if (!permisoValido) {
                System.out.println("Motivo: Nivel de permiso inválido.");
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
