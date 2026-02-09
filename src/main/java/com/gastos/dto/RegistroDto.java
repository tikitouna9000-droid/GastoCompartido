package com.gastos.dto;

import com.gastos.entities.Gasto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroDto {

    private Gasto gasto;

    private int montoAsignado;

    private int porcentaje;

    private LocalDate fechaImpacto;
}
