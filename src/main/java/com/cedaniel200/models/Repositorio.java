package com.cedaniel200.models;

public class Repositorio {
    private String nombre;
    private String descripcion;
    private Visibilidad visibilidad;
    private boolean inicializaConReadme;

    public Repositorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Visibilidad getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(Visibilidad visibilidad) {
        this.visibilidad = visibilidad;
    }

    public boolean isInicializaConReadme() {
        return inicializaConReadme;
    }

    public void setInicializaConReadme(boolean inicializaConReadme) {
        this.inicializaConReadme = inicializaConReadme;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", visibilidad=" + visibilidad +
                ", inicializaConReadme=" + inicializaConReadme +
                '}';
    }
}
