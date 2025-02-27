package com.cursotodocode.primeraApi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class trianguloController {
    @PostMapping("/triangulo")
    public String caluloArea(@RequestParam(required = false) double altura,
                             @RequestParam(required = false) double base,
                             @RequestBody(required = false) List<Double> Parametros){
        double areaTrianguloParams = 0.0;
        double areaTrianguloPBody = 0.0;

        areaTrianguloParams = base*altura/2;

        areaTrianguloPBody = Parametros.get(0)*Parametros.get(1)/2;

        System.out.println(Parametros);

        return "Area por parametros = " + areaTrianguloParams + "\n\rArea por post = " + areaTrianguloPBody ;
    }
}
