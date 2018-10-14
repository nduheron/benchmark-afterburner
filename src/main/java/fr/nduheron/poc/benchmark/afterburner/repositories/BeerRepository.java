package fr.nduheron.poc.benchmark.afterburner.repositories;

import java.util.List;

import fr.nduheron.poc.benchmark.afterburner.model.Beer;

public interface BeerRepository {

	List<Beer> findAll();
}
