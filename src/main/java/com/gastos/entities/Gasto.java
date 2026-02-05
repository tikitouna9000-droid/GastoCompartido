package com.gastos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Locked;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table (name = "gasto")
public class Gasto {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;

    private int montoTotal;

    private String categoria;

    private enum tipoPago;

    private LocalDate fechaCreacion;

    private LocalDate fechaModif;

    private String autor;
}
