package com.cenfotec.examen.domain;


import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Auditor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private String email;
    private String disponibilidadViaje;
    private String especialidad;
    private String estado;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/dd/MM");

    public Auditor() {
    }

    public Auditor(String nombre, String apellido1, String apellido2, String direccion, String telefono,
                   Date fechaNacimiento, String email, String disponibilidadViaje, String especialidad, String estado) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.disponibilidadViaje = disponibilidadViaje;
        this.especialidad = especialidad;
        this.estado = estado;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisponibilidadViaje() {
        return disponibilidadViaje;
    }

    public void setDisponibilidadViaje(String disponibilidadViaje) {
        this.disponibilidadViaje = disponibilidadViaje;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Auditor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", email='" + email + '\'' +
                ", disponibilidadViaje='" + disponibilidadViaje + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
