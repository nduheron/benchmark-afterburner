package fr.nduheron.poc.benchmark.afterburner.model;

import java.util.List;

public class Method {
	private List<MashTemp> maashTemp;
	private Fermentation fermentation;
	private String twist;

	public List<MashTemp> getMaashTemp() {
		return maashTemp;
	}

	public void setMaashTemp(List<MashTemp> maashTemp) {
		this.maashTemp = maashTemp;
	}

	public Fermentation getFermentation() {
		return fermentation;
	}

	public void setFermentation(Fermentation fermentation) {
		this.fermentation = fermentation;
	}

	public String getTwist() {
		return twist;
	}

	public void setTwist(String twist) {
		this.twist = twist;
	}

}
