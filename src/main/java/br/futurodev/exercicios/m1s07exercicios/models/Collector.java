package br.futurodev.exercicios.m1s07exercicios.models;

import lombok.AccessLevel;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Collector {

    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private String description;

    public Collector() {
        this.id = sequence++;
    }

    private static final List<Collector> collectors = new ArrayList<>();
    private static Long sequence = 1L;
}

