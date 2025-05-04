import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExportadorArchivo {
    private Gson gson;

    public ExportadorArchivo() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void exportarPelicula(Pelicula pelicula) throws IOException {
        String nombreArchivo = pelicula.titulo().replaceAll(" ", "_") + ".json";
        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write(gson.toJson(pelicula));
        }
        System.out.println("Archivo " + nombreArchivo + " generado exitosamente.");
    }
}
