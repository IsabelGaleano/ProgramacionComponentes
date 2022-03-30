package com.cenfotec.lab5.lab5.domain;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private Date fechaNacimiento;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/dd/MM");

    public Persona(String nombre, String apellido1, String apellido2, String direccion, String fechaNacimiento) throws ParseException {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.fechaNacimiento = format.parse(fechaNacimiento);
    }

    public Persona() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCreatedAsShort() {
        return format.format(fechaNacimiento);
    }

    public String toString() {
        StringBuilder value = new StringBuilder("PersonaEntry(");
        value.append("Id: ");
        value.append(id);
        value.append(",Nombre: ");
        value.append(nombre);
        value.append(",Primer apellido: ");
        value.append(apellido1);
        value.append(",Segundo apellido: ");
        value.append(apellido2);
        value.append(",Direccion: ");
        value.append(direccion);
        value.append(",Fecha nacimiento: ");
        value.append(getCreatedAsShort());
        value.append(")");
        return value.toString();
    }
}
