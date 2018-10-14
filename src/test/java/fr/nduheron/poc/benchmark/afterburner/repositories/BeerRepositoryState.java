package fr.nduheron.poc.benchmark.afterburner.repositories;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class BeerRepositoryState extends AbstractBeerRepositoryState {

	@Override
	String getArgs() {
		return "";
	}

}