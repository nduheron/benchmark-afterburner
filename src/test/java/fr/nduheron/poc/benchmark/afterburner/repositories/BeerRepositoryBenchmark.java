package fr.nduheron.poc.benchmark.afterburner.repositories;

import java.util.List;

import org.openjdk.jmh.annotations.Benchmark;

import fr.nduheron.poc.benchmark.afterburner.model.Beer;

public class BeerRepositoryBenchmark {

	@Benchmark
	public List<Beer> testWithAfterburner(AfterburnerBeerRepositoryState state) {
		return state.getBeerRepository().findAll();
	}
	
	@Benchmark
	public List<Beer> testWithoutAfterburner(BeerRepositoryState state) {
		return state.getBeerRepository().findAll();
	}

}
