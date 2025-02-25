package com.cursotodocode.primeraApi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apisaludos")
public class SaludoController {


    @GetMapping("/holaMundo")
    public String holaMundo() {
        return "Hola Mundo";
    }

    @GetMapping("/holaNombre/{nombre}/{edad}")
    public String hola(@PathVariable String nombre, @PathVariable int edad){

        return "Hola " + nombre + " | Tu edad es: " + edad;
    }

}
