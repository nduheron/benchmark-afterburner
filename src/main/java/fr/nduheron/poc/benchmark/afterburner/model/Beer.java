package fr.nduheron.poc.benchmark.afterburner.model;

import java.time.YearMonth;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Beer {

	private int id;
	private String name;
	private String tagline;
	@JsonFormat(pattern = "MM/yyyy")
	private YearMonth firstBrewed;
	private String imageUrl;
	private double abv;
	private int ibu;
	private int targetFg;
	private int targetOg;
	private int ebc;
	private int srm;
	private double ph;
	private int attenuationLevel;
	private Value volume;
	private Value boilVolume;
	private Method method;
	private Ingredients ingredients;
	private List<String> foodPairing;
	private String brewersTips;
	private String contributedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public YearMonth getFirstBrewed() {
		return firstBrewed;
	}

	public void setFirstBrewed(YearMonth firstBrewed) {
		this.firstBrewed = firstBrewed;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getAbv() {
		return abv;
	}

	public void setAbv(double abv) {
		this.abv = abv;
	}

	public int getIbu() {
		return ibu;
	}

	public void setIbu(int ibu) {
		this.ibu = ibu;
	}

	public int getTargetFg() {
		return targetFg;
	}

	public void setTargetFg(int targetFg) {
		this.targetFg = targetFg;
	}

	public int getTargetOg() {
		return targetOg;
	}

	public void setTargetOg(int targetOg) {
		this.targetOg = targetOg;
	}

	public int getEbc() {
		return ebc;
	}

	public void setEbc(int ebc) {
		this.ebc = ebc;
	}

	public int getSrm() {
		return srm;
	}

	public void setSrm(int srm) {
		this.srm = srm;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public int getAttenuationLevel() {
		return attenuationLevel;
	}

	public void setAttenuationLevel(int attenuationLevel) {
		this.attenuationLevel = attenuationLevel;
	}

	public Value getVolume() {
		return volume;
	}

	public void setVolume(Value volume) {
		this.volume = volume;
	}

	public Value getBoilVolume() {
		return boilVolume;
	}

	public void setBoilVolume(Value boilVolume) {
		this.boilVolume = boilVolume;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	public List<String> getFoodPairing() {
		return foodPairing;
	}

	public void setFoodPairing(List<String> foodPairing) {
		this.foodPairing = foodPairing;
	}

	public String getBrewersTips() {
		return brewersTips;
	}

	public void setBrewersTips(String brewersTips) {
		this.brewersTips = brewersTips;
	}

	public String getContributedBy() {
		return contributedBy;
	}

	public void setContributedBy(String contributedBy) {
		this.contributedBy = contributedBy;
	}

}
