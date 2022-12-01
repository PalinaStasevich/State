package lt.lhu.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

	private String titleOfState;
	private City capitalOfState;
	private double squareOfState;
	private List<Region> regions = new ArrayList<Region>();

	public State() {

	}

	public State(String titleOfState, City capitalOfState, double squareOfState, List<Region> regions) {
		this.titleOfState = titleOfState;
		this.capitalOfState = capitalOfState;
		this.squareOfState = squareOfState;
		this.regions = regions;
	}

	public String getTitleOfState() {
		return titleOfState;
	}

	public void setTitleOfState(String titleOfState) {
		this.titleOfState = titleOfState;
	}

	public City getCapitalOfState() {
		return capitalOfState;
	}

	public void setCapitalOfState(City capitalOfState) {
		this.capitalOfState = capitalOfState;
	}

	public double getSquareOfState() {
		return squareOfState;
	}

	public void setSquareOfState(double squareOfState) {
		this.squareOfState = squareOfState;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public void addRegions(Region region) {
		regions.add(region);
	}

	public double findSquareOfState(Region... region) {
		squareOfState = 0;
		for (Region r : getRegions()) {
			squareOfState = squareOfState + r.getSquareOfRegion();
		}
		return squareOfState;
	}
	
	public int findCountOfRegions() {
		return regions.size();
	}

	@Override
	public int hashCode() {
		return Objects.hash(capitalOfState, regions, squareOfState, titleOfState);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(capitalOfState, other.capitalOfState) && Objects.equals(regions, other.regions)
				&& Double.doubleToLongBits(squareOfState) == Double.doubleToLongBits(other.squareOfState)
				&& Objects.equals(titleOfState, other.titleOfState);
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "State [titleOfState=" + titleOfState + ", capitalOfState=" + capitalOfState + ", squareOfState="
				+ squareOfState + ", regions="
				+ (regions != null ? regions.subList(0, Math.min(regions.size(), maxLen)) : null) + "]";
	}

}
