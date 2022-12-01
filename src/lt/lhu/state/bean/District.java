package lt.lhu.state.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {

	private String titleOfDistrict;
	private List<City> cities = new ArrayList<City>();

	public District() {

	}

	public District(String titleOfDistrict) {
		this.titleOfDistrict = titleOfDistrict;
	}

	public District(String titleOfDistrict, List<City> cities) {
		super();
		this.titleOfDistrict = titleOfDistrict;
		this.cities = cities;
	}

	public String getTitleOfDistrict() {
		return titleOfDistrict;
	}

	public void setTitleOfDistrict(String titleOfDistrict) {
		this.titleOfDistrict = titleOfDistrict;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	public void addCities(City city) {
		cities.add(city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cities, titleOfDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Objects.equals(cities, other.cities) && Objects.equals(titleOfDistrict, other.titleOfDistrict);
	}

}
