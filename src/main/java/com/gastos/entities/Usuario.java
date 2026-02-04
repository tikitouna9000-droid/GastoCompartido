package com.gastos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

}
