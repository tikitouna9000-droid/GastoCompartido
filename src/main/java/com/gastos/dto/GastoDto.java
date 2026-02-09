package com.gastos.dto;

import com.gastos.Enum.TipoPago;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GastoDto {

    private String titulo;

    private int montoTotal;

    private String categoria;

    private TipoPago tipoPago;

    private LocalDate fechaCreacion;

    private LocalDate fechaModif;

    private String autor;

}
