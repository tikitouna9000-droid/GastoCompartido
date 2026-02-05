package com.gastos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table (name = "registro")
public class RegistroGasto {

    @Id
    @GeneratedValue
    private Long id;

    private (aca va usuario);

    private (aca va gasto);

    private int montoAsignado;

    private int porcentaje;

    private String pagoConfirmado;

    private LocalDate fechaImpacto;
}
