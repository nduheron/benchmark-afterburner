package fr.nduheron.poc.benchmark.afterburner.repositories;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class BeerRepositoryBenchmarkTest {

	@Test
	public void runJmhBenchmark1user() throws RunnerException {
		Options opt = new OptionsBuilder().include(BeerRepositoryBenchmark.class.getSimpleName()).forks(1)
				.measurementTime(TimeValue.seconds(30)).measurementIterations(10).warmupIterations(1)
				.timeUnit(TimeUnit.MILLISECONDS).mode(Mode.SampleTime).build();

		new Runner(opt).run();
	}

	@Test
	public void runJmhBenchmark20users() throws RunnerException {
		Options opt = new OptionsBuilder().include(BeerRepositoryBenchmark.class.getSimpleName()).forks(1).threads(20)
				.measurementIterations(10).warmupIterations(1).timeUnit(TimeUnit.MILLISECONDS).mode(Mode.SampleTime)
				.build();

		new Runner(opt).run();
	}
}
