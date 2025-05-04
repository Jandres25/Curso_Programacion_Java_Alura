import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ServicioSwapi {
    private static final String URL_PELICULAS = "https://swapi.py4e.com/api/films/";
    private HttpClient cliente;
    private Gson gson;

    public ServicioSwapi() {
        cliente = HttpClient.newHttpClient();
        gson = new Gson();
    }

    public RespuestaPeliculas obtenerPeliculas() throws IOException, InterruptedException {
        HttpRequest peticion = HttpRequest.newBuilder().uri(URI.create(URL_PELICULAS)).build();

        HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(respuesta.body(), RespuestaPeliculas.class);
    }
}
