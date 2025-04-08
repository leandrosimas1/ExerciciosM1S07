package br.futurodev.exercicios.m1s07exercicios.services;

import br.futurodev.exercicios.m1s07exercicios.models.Collector;
import br.futurodev.exercicios.m1s07exercicios.models.Route;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    public Route create(Route route) {
        return Route.addRoute(route);
    }

    public List<Route> findall() {
        return Route.getRoutes();
    }

    public Route findId(Long id) {
        for (Route route : Route.getRoutes()) {
            if (route.getId().equals(id)) {
                return route;
            }
        }
        return null;
    }
}

