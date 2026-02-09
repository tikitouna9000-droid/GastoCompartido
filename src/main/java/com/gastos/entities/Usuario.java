package com.gastos.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany (mappedBy = "usuario")
    private List<RegistroGasto> registroGastoList;
}
