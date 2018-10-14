package fr.nduheron.poc.benchmark.afterburner.repositories;

import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Setup;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import fr.nduheron.poc.benchmark.afterburner.BenchmarkAfterburnerApplication;

public abstract class AbstractBeerRepositoryState {
	private BeerRepository repo;

	@Setup(Level.Trial)
	public void loadSpringContext() {

		ConfigurableApplicationContext context = SpringApplication.run(BenchmarkAfterburnerApplication.class, getArgs());
		repo = context.getBean(BeerRepository.class);

	}

	public BeerRepository getBeerRepository() {
		return repo;
	}
	
	abstract String getArgs();

}