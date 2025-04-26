package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("All Star");
        miCancion.setCantante("Smash Mouth");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Fedelobo");
        miPodcast.setTitulo("La pensión");

        for (int i = 0; i < 6000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 50000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);

    }
}
