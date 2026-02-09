package com.gastos.entities;
import jakarta.persistence.*;
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

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Gasto gasto;

    private int montoAsignado;

    private int porcentaje;

    private String pagoConfirmado;

    private LocalDate fechaImpacto;
}
