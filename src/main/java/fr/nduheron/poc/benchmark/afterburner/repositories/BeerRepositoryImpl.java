package fr.nduheron.poc.benchmark.afterburner.repositories;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.nduheron.poc.benchmark.afterburner.model.Beer;

@Repository
public class BeerRepositoryImpl implements BeerRepository {

	@Autowired
	private ObjectMapper mapper;

	@Override
	public List<Beer> findAll() {
		try {
			return mapper.readValue(getClass().getClassLoader().getResourceAsStream("beers.json"),
					new TypeReference<List<Beer>>() {
					});
		} catch (IOException e) {
			throw new RuntimeException("Erreur lors de la récupartion de la liste des bières", e);
		}
	}

}
