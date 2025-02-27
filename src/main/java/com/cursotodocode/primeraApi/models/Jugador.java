package com.cursotodocode.primeraApi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jugador {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private double altura;
    private double peso;
}
