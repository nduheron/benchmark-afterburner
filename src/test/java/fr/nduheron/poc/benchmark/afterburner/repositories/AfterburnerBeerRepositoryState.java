package fr.nduheron.poc.benchmark.afterburner.repositories;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class AfterburnerBeerRepositoryState extends AbstractBeerRepositoryState {

	@Override
	String getArgs() {
		return "--afterburner.enable=true";
	}

}