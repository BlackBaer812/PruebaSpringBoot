package com.cursotodocode.primeraApi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class trianguloController {
    @PostMapping("/triangulo/{altura}/{base}")
    public String caluloArea(@PathVariable String altura, @PathVariable String base, @RequestBody List<Double> Parametros){

    }
}
