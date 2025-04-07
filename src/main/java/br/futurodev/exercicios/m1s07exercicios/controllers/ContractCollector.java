package br.futurodev.exercicios.m1s07exercicios.controllers;


import br.futurodev.exercicios.m1s07exercicios.models.Contract;
import br.futurodev.exercicios.m1s07exercicios.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contracts")
public class ContractCollector {

    @Autowired
    private ContractService service;

    @GetMapping
    public List<Contract> get(){
        return service.findAll();
    }

    @PostMapping
    public Contract post(@RequestBody Contract contract){
        return service.create(contract);
    }
}
