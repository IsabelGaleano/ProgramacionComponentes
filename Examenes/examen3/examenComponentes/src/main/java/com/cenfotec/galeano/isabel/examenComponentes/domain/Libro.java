package com.cenfotec.galeano.isabel.examenComponentes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String autor;
    private String annioPublicacion;
    private long idHijo;

    public Libro() {
    }

    public Libro(Long id, String nombre, String autor, String annioPublicacion, long idHijo) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.annioPublicacion = annioPublicacion;
        this.idHijo = idHijo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnnioPublicacion() {
        return annioPublicacion;
    }

    public void setAnnioPublicacion(String annioPublicacion) {
        this.annioPublicacion = annioPublicacion;
    }

    public long getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(long idHijo) {
        this.idHijo = idHijo;
    }
}
