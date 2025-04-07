package br.futurodev.exercicios.m1s07exercicios.controllers;

import br.futurodev.exercicios.m1s07exercicios.models.Route;
import br.futurodev.exercicios.m1s07exercicios.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("routes")

public class RouteController {

    @Autowired
    private RouteService service;

    @GetMapping
    public List<Route> get(){
        return service.findall();
    }

    @PostMapping
    public Route post(@RequestBody Route route){
        return service.create(route);
    }
}
