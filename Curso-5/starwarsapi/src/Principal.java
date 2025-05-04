import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consultaPelicula = new ConsultaPelicula();
        System.out.println("Escribe el numero de la película de star wars:");

        try {
            var numeroPelicila = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consultaPelicula.buscaPelicula(2);
            System.out.println(pelicula);
            GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();
            generadorDeArchivo.guardarJson(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("El número no se encuentra: " + e.getMessage());
        }
        catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Cerrando la aplicación");
        }
    }
}
