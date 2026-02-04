package com.gastos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Locked;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "gasto")
public class Gasto {
    @Id
    @GeneratedValue
    private Long id;
}
