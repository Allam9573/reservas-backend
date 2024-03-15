package com.app.reservas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "servicios")
@Data
public class ServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idservicio")
    private int idServicio;
    @Column(name = "nombreservicio")
    private String nombreServicio;
    @Column(columnDefinition = "decimal(10,2)", name = "precioservicio")
    private double precioServicio;

}
