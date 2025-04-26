package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " es uno de los mejores.");
        } else {
            System.out.println(audio.getTitulo() + " no es muy bueno.");
        }
    }
}
