package com.app.reservas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "habitaciones")
@Data
public class HabitacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhabitacion")
    private int idHabitacion;
    private String descripcion;
    @Column(columnDefinition = "Decimal(10,2)")
    private double precio;
    @Column(name = "tipohabitacion")
    private String tipoHabitacion;

}
