package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorDeConversionException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nombre = tituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(tituloOmdb.year());
        if (tituloOmdb.runtime().contains("N/A")) {
            throw new ErrorDeConversionException("No se pudo convertir la duración por el N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0,3).replace(" ",""));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void mustraFichaTecnica() {
        System.out.println("La película es: " + nombre);
        System.out.println("Y fue lanzada en: " + fechaDeLanzamiento);
        System.out.println("La duración en minutos es: " + getDuracionEnMinutos());
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(Nombre= '" + nombre +
                ", Fecha de lanzamiento= " + fechaDeLanzamiento +
                ", Duración en minutos: " + duracionEnMinutos + ")";
    }
}
