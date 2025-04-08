package br.futurodev.exercicios.m1s07exercicios.services;

import br.futurodev.exercicios.m1s07exercicios.models.Collector;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectorService {

    public Collector create(Collector collector) {
        return Collector.addCollector(collector);
    }

    public List<Collector> findall() {
        return Collector.getCollectors();
    }

    public Collector findId(Long id) {
        for (Collector collector : Collector.getCollectors()) {
            if (collector.getId().equals(id)) {
                return collector;
            }
        }
        return null;
    }
}


