package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Matrix", 1999);
        miPelicula.setDuracionEnMinutos(160);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.mustraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(8.7);

        System.out.println(miPelicula.calculaMedia());

        Serie serie1 = new Serie("Breaking Bad", 2008);
        serie1.setTemporadas(8);
        serie1.setMinutosPorEpisodio(25);
        serie1.setEpisodiosPorTemporada(10);
        serie1.mustraFichaTecnica();
        System.out.println(serie1.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("La momia", 2001);
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

        var peliculaDeBrian = new Pelicula("The Dark Knight", 2008);
        peliculaDeBrian.setDuracionEnMinutos(152);

        ArrayList<Pelicula> listaDePelicula = new ArrayList<>();
        listaDePelicula.add(miPelicula);
        listaDePelicula.add(otraPelicula);
        listaDePelicula.add(peliculaDeBrian);

        System.out.println("Tamaño de la lista: " + listaDePelicula.size());
        System.out.println("La primara pelicula es: " + listaDePelicula.getFirst().getNombre());
        System.out.println(listaDePelicula);
        System.out.println("Texto de la película: " + listaDePelicula.getFirst().toString());


    }
}
