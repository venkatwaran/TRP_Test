package trptest;

import org.junit.Test;

public class TRPSorByTest {
	
	@Test
	public void sortByYear() {
		TRPSortBy tester = new TRPSortBy(); 
		System.out.println("By Year");
		tester.sortByYear();
		System.out.println("By Make");
		tester.sortByMake();
		System.out.println("By Price");
		tester.sortByPrice();
		System.out.println("Best Value");
		tester.bestValue();
		System.out.println("Fuel consumption by distance");
		tester.fuelConsumptionfForDistance(100);
		System.out.println("Random Vehicle");
		tester.randomVehicle();
		System.out.println("Average MPG by Year");
		tester.avgMpgByYear();
	}

}
