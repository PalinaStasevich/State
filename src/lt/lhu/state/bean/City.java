package lt.lhu.state.bean;

import java.util.Objects;

public class City {

	private String titleOfCity;

	public City() {

	}

	public City(String titleOfCity) {
		this.titleOfCity = titleOfCity;
	}

	public String getTitleOfCity() {
		return titleOfCity;
	}

	public void setTitleOfCity(String titleOfCity) {
		this.titleOfCity = titleOfCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titleOfCity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(titleOfCity, other.titleOfCity);
	}

	@Override
	public String toString() {
		return "City [titleOfCity=" + titleOfCity + "]";
	}

}