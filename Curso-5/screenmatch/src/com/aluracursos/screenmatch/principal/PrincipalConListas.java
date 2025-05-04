package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Matrix", 1999);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("La momia", 2001);
        otraPelicula.evalua(8);
        var peliculaDeBrian = new Pelicula("The Dark Knight", 2008);
        peliculaDeBrian.evalua(10);
        Serie serie1 = new Serie("Breaking Bad", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBrian);
        lista.add(serie1);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Keanu Reeves");
        listaDeArtistas.add("Brendan Fraser");
        listaDeArtistas.add("Christian Bale");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenada: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista de titulos ordenada por fechas: " + lista);
    }
}
