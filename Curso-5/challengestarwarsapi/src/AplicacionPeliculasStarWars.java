public class AplicacionPeliculasStarWars {
    public static void main(String[] args) {
        try {
            ServicioSwapi servicio = new ServicioSwapi();
            RespuestaPeliculas respuesta = servicio.obtenerPeliculas();

            if (respuesta != null && respuesta.resultados() != null && !respuesta.resultados().isEmpty()) {
                Pelicula peliculaSeleccionada = Menu.mostrarMenu(respuesta.resultados());
                System.out.println("\nDetalles de la película seleccionada:\n");
                System.out.println(peliculaSeleccionada);

                ExportadorArchivo exportador = new ExportadorArchivo();
                exportador.exportarPelicula(peliculaSeleccionada);
            } else {
                System.out.println("No se encontraron películas.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
