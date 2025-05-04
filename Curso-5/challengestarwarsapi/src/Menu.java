import java.util.List;
import java.util.Scanner;

public class Menu {
    public static Pelicula mostrarMenu(List<Pelicula> peliculas) {
        System.out.println("Elige la película de Star Wars que deseas consultar:");
        for (int i = 0; i < peliculas.size(); i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i).titulo());
        }

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Ingresa el número de la película (1-" + peliculas.size() + "): ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                scanner.next(); // descartar entrada inválida
            }
        } while (opcion < 1 || opcion > peliculas.size());

        return peliculas.get(opcion - 1);
    }
}
