import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscaPelicula(int numeroDePelicula){
        URI URL = URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula + "/");

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest consulta = HttpRequest.newBuilder().uri(URL).build();

        try {
            HttpResponse<String> respuesta = null;
            respuesta = cliente.send(consulta, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(), Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("Película no encontrada: " + e);
        }
    }
}
