package lt.lhu.state.view;

import lt.lhu.state.bean.Region;
import lt.lhu.state.bean.State;

public class StateView {

	public void printCapital(State state) {
		System.out.println("Capital of state: " + state.getCapitalOfState());
	}

	public void printSquare(State state) {
		System.out.println("Square of state: " + state.findSquareOfState());
	}

	public void printCountOfRegions(State state) {
		System.out.println("Count of regions: " + state.findCountOfRegions());
	}

	public void printCentresOfRegions(State state) {
		for (Region r : state.getRegions()) {
			System.out.println(r.getCentreOfRegion());
		}

	}

}
