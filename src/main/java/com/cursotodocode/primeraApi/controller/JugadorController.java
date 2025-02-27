package com.cursotodocode.primeraApi.controller;

import com.cursotodocode.primeraApi.models.Jugador;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JugadorController {
    @PostMapping("/jugadores")
    public String calculoPromedios(@RequestBody List<Jugador> listaJugadores){
        double suma_estatura = 0.0;
        double promedio_estatura = 0.0;

        List<Jugador> listaJ = new ArrayList<>();

        listaJ = listaJugadores;

        for (Jugador j:listaJ){
            suma_estatura += j.getAltura();
        }

        promedio_estatura = suma_estatura/listaJ.size();

        return "La media de estatura es: " + promedio_estatura;
    }
}

