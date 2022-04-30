package com.cenfotec.galeano.isabel.examenComponentes.domain;

public class ReporteLibros {
    private String nombre;
    private int cantidadLibros;

    public ReporteLibros() {
    }

    public ReporteLibros(String nombre, int cantidadLibros) {
        this.nombre = nombre;
        this.cantidadLibros = cantidadLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
}
