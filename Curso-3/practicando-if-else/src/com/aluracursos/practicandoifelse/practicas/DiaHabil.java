package com.aluracursos.practicandoifelse.practicas;

import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el día de la semana en minúsculas
        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String dia = scanner.nextLine().trim();

        // Comprobar si el día ingresado es hábil (de lunes a viernes)
        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") ||
                dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes")) {
            System.out.println(dia + " es un día hábil.");
        }
        // Comprobar si el día ingresado es fin de semana
        else if (dia.equals("sabado") || dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " no es un día hábil.");
        }
        // En caso de ingreso incorrecto
        else {
            System.out.println("El día ingresado es inválido.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
