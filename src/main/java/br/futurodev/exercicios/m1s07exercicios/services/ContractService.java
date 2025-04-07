package br.futurodev.exercicios.m1s07exercicios.services;

import br.futurodev.exercicios.m1s07exercicios.models.Collector;
import br.futurodev.exercicios.m1s07exercicios.models.Contract;
import br.futurodev.exercicios.m1s07exercicios.models.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private RouteService routeService;

    @Autowired
    private CollectorService collectorService;

    public Contract create (Contract contract) {
        Collector collector = collectorService.findId(contract.getCollector().getId());
        if (collector == null){return null;}
        else {contract.setCollector(collector);}

        List<Route> routes = new ArrayList<>();
        for (Route route : contract.getRoutes()){
            Route foundRoute = (Route) routeService.findId(route.getId());
            if (foundRoute == null){return null;}
            else {routes.add(foundRoute);}

        }
        contract.setRoutes(routes);

        return Contract.addContract(contract);
    }

    public List<Contract> findAll() {
        return Contract.getContracts();
    }

}