package fr.nduheron.poc.benchmark.afterburner.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

@Configuration
public class JacksonConfiguration {

	@Bean
	@ConditionalOnProperty(value = "afterburner.enable", havingValue = "true")
	Module afterburnerModule() {
		return new AfterburnerModule();
	}
}
