package com.cenfotec.galeano.isabel.examenComponentes.domain;

import javax.persistence.*;

@Entity
public class Hijo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String tipoPlan;
    private String alergias;
    @ManyToOne
    @JoinColumn(name = "padre_id")
    private Padre padre;

    public Padre getPadre() {
        return padre;
    }

    public Hijo() {
    }

    public Hijo(Long id, String nombre, String apellido1, String apellido2, String tipoPlan, String alergias, Padre padre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.tipoPlan = tipoPlan;
        this.alergias = alergias;
        this.padre = padre;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setPadre(Padre padre) {
        this.padre = padre;
    }
}
