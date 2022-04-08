package com.cenfotec.examen.domain;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class VisitaTrabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date fecha;
    private String idConsultor;
    private String area;
    private String idCliente;

    @Transient
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/dd/MM");

    public VisitaTrabajo() {
    }

    public VisitaTrabajo(Date fecha, String idConsultor, String area, String idCliente) {
        this.fecha = fecha;
        this.idConsultor = idConsultor;
        this.area = area;
        this.idCliente = idCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }



    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(String idConsultor) {
        this.idConsultor = idConsultor;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "VisitaTrabajo{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", idConsultor=" + idConsultor +
                ", area='" + area + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
