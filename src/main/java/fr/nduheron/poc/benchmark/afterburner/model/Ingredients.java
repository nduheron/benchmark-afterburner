package fr.nduheron.poc.benchmark.afterburner.model;

import java.util.List;

public class Ingredients {

	private List<Malt> malt;

	private List<Hops> hops;

	private String yeast;

	public List<Malt> getMalt() {
		return malt;
	}

	public void setMalt(List<Malt> malt) {
		this.malt = malt;
	}

	public List<Hops> getHops() {
		return hops;
	}

	public void setHops(List<Hops> hops) {
		this.hops = hops;
	}

	public String getYeast() {
		return yeast;
	}

	public void setYeast(String yeast) {
		this.yeast = yeast;
	}

}
