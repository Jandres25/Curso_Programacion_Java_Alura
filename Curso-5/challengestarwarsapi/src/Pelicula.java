import com.google.gson.annotations.SerializedName;

public record Pelicula(
        @SerializedName("title") String titulo,
        @SerializedName("episode_id") int episodioId,
        @SerializedName("opening_crawl") String descripcion,
        @SerializedName("director") String director,
        @SerializedName("producer") String productor,
        @SerializedName("release_date") String fechaLanzamiento
) {}