package com.cenfotec.galeano.isabel.examenComponentes.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class LibroQL implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "autor", nullable = false)
    private String autor;
    @Column(name = "precio")
    private String precio;
    @Column(name = "estado")
    private String estado;
}
