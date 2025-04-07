package br.futurodev.exercicios.m1s07exercicios.controllers;

import br.futurodev.exercicios.m1s07exercicios.models.Collector;
import br.futurodev.exercicios.m1s07exercicios.services.CollectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("collectors")

public class CollectorController {

    @Autowired
    private CollectorService service;

    @GetMapping
    public List<Collector> get(){
        return service.findall();
    }

    @PostMapping
    public Collector post(@RequestBody Collector collector){
        return service.create(collector);
    }
}
