package com.krakedev.veterinaria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "especie", nullable = false, length = 50)
    private String especie;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "nombre_dueno", nullable = false, length = 100)
    private String nombreDueno;
    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

}
