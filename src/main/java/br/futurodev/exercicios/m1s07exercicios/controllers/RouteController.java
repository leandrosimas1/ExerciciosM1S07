package br.futurodev.exercicios.m1s07exercicios.controllers;

import br.futurodev.exercicios.m1s07exercicios.services.RouteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class RouteController {

    @Autowired
    private RouteServices service;

    @GetMapping
    public List<Route>
}
