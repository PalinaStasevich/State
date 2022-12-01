package lt.lhu.state.main;

import lt.lhu.state.bean.City;
import lt.lhu.state.bean.District;
import lt.lhu.state.bean.Region;
import lt.lhu.state.bean.State;
import lt.lhu.state.view.StateView;

public class Main {

	public static void main(String[] args) {
		City city1 = new City("Minsk");
		City city2 = new City("Zaslavl");
		City city3 = new City("Kolodihi");
		City city4 = new City("Borisov");
		City city5 = new City("Soligorsk");
		City city6 = new City("Brest");
		City city7 = new City("Baranovichi");
		City city8 = new City("Pinsk");
		City city9 = new City("Kobrin");
		City city10 = new City("Grodno");
		City city11 = new City("Lida");

		District district1 = new District("Minski");
		district1.addCities(city1);
		district1.addCities(city2);
		district1.addCities(city3);
		District district2 = new District("Brestski");
		district2.addCities(city6);
		district2.addCities(city7);
		District district3 = new District("Grodnencki");
		district3.addCities(city10);
		district3.addCities(city11);
		District district4 = new District("Borisovski");
		district4.addCities(city4);
		District district5 = new District("Soligorcki");
		district5.addCities(city5);
		District district6 = new District("Pinski");
		district6.addCities(city8);
		District district7 = new District("Kobrinski");
		district7.addCities(city9);

		Region region1 = new Region("Minski", 38900.0, city1);
		region1.addDistricts(district1);
		region1.addDistricts(district4);
		region1.addDistricts(district5);
		Region region2 = new Region("Brestski", 32700.0, city6);
		region2.addDistricts(district2);
		region2.addDistricts(district6);
		Region region3 = new Region("Grodnencki", 25127.0, city10);
		region3.addDistricts(district3);
		region3.addDistricts(district7);

		State state = new State();
		state.setTitleOfState("Belarus");
		state.setCapitalOfState(city1);
		state.addRegions(region1);
		state.addRegions(region2);
		state.addRegions(region3);

		StateView view = new StateView();
		view.printCapital(state);
		view.printSquare(state);
		view.printCountOfRegions(state);
		view.printCentresOfRegions(state);
	}

}
