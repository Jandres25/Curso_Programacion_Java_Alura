import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Matrix");
        miPelicula.setFechaDeLanzamiento(1999);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.mustraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(8.7);

        System.out.println(miPelicula.calculaMedia());

        Serie serie1 = new Serie();
        serie1.setNombre("Breaking Bad");
        serie1.setFechaDeLanzamiento(2015);
        serie1.setTemporadas(8);
        serie1.setMinutosPorEpisodio(25);
        serie1.setEpisodiosPorTemporada(10);
        serie1.mustraFichaTecnica();
        System.out.println(serie1.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("La momia");
        otraPelicula.setFechaDeLanzamiento(2001);
        otraPelicula.setDuracionEnMinutos(140);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(serie1);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo total de duración: " +calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Capítulo 1");
        episodio.setSerie(serie1);
        episodio.setTotalDeVisualizaciones(50);

        filtroRecomendaciones.filtra(episodio);
    }
}
