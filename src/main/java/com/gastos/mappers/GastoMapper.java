package com.gastos.mappers;

import com.gastos.dto.GastoDto;
import com.gastos.entities.Gasto;

public class GastoMapper {

    public static Gasto dtoGasto(GastoDto dto){
        Gasto nuevoGasto = new Gasto();
        nuevoGasto.setAutor(dto.getAutor());
        nuevoGasto.setCategoria(dto.getCategoria());

        return nuevoGasto;
    }
}
