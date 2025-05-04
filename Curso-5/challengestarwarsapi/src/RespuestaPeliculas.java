import java.util.List;
import com.google.gson.annotations.SerializedName;

public record RespuestaPeliculas(
        @SerializedName("results") List<Pelicula> resultados
) {}