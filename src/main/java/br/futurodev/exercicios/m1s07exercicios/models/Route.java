package br.futurodev.exercicios.m1s07exercicios.models;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter


public class Route {
    private Long id;
    private String description;
    private String coverageArea;
    private BigDecimal efficiencyPercentage;


    public static final List<Route> routes = new ArrayList<>();
            private static Long sequence = 1L;

    public Route(){
        this.id = sequence++;
    }

    public static Route addRoute(Route route){
        routes.add(route);
        return route;
    }
}
