package lt.lhu.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

	private String titleOfRegion;
	private double squareOfRegion;
	private City centreOfRegion;
	private List<District> districts = new ArrayList<District>();

	public Region() {

	}

	public Region(String titleOfRegion, double squareOfRegion, City centreOfRegion, List<District> districts) {
		this.titleOfRegion = titleOfRegion;
		this.squareOfRegion = squareOfRegion;
		this.centreOfRegion = centreOfRegion;
		this.districts = districts;
	}
	
	public Region(String titleOfRegion, double squareOfRegion, City centreOfRegion) {
		this.titleOfRegion = titleOfRegion;
		this.squareOfRegion = squareOfRegion;
		this.centreOfRegion = centreOfRegion;
	}

	public String getTitleOfRegion() {
		return titleOfRegion;
	}

	public void setTitleOfRegion(String titleOfRegion) {
		this.titleOfRegion = titleOfRegion;
	}

	public double getSquareOfRegion() {
		return squareOfRegion;
	}

	public void setSquareOfRegion(double squareOfRegion) {
		this.squareOfRegion = squareOfRegion;
	}

	public City getCentreOfRegion() {
		return centreOfRegion;
	}

	public void setCentreOfRegion(City centreOfRegion) {
		this.centreOfRegion = centreOfRegion;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	
	public void addDistricts(District district) {
		districts.add(district);
	}

	@Override
	public int hashCode() {
		return Objects.hash(centreOfRegion, districts, squareOfRegion, titleOfRegion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(centreOfRegion, other.centreOfRegion) && Objects.equals(districts, other.districts)
				&& Double.doubleToLongBits(squareOfRegion) == Double.doubleToLongBits(other.squareOfRegion)
				&& Objects.equals(titleOfRegion, other.titleOfRegion);
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Region [titleOfRegion=" + titleOfRegion + ", squareOfRegion=" + squareOfRegion + ", centreOfRegion="
				+ centreOfRegion + ", districts="
				+ (districts != null ? districts.subList(0, Math.min(districts.size(), maxLen)) : null) + "]";
	}

}
