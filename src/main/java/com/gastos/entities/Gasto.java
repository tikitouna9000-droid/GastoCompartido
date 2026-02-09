package com.gastos.entities;
import com.gastos.Enum.TipoPago;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

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

    private TipoPago tipoPago;

    private LocalDate fechaCreacion;

    private LocalDate fechaModif;

    private String autor;

    @OneToMany(mappedBy = "gasto")
    private List<RegistroGasto> registroGastoList;
}
