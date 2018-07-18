package trptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class TRPSortBy {
	List<Vehicle> list = new ArrayList<>();
	
	TRPSortBy() {
	    
	    list.add(new Vehicle("Honda","CRV","Green",(short)2016,23845,(float)8,(byte)33));
	    list.add(new Vehicle("Ford","Escape","Red",(short)2017,23590,(float)7.8,(byte)32));
	    list.add(new Vehicle("Hyundai","Sante Fe","Grey",(short)2016,24950,(float)8,(byte)27));
	    list.add(new Vehicle("Mazda","CX-5","Red",(short)2017,21795,(float)8,(byte)35));
	    list.add(new Vehicle("Subaru","Forester","Blue",(short)2016,22395,(float)8.4,(byte)32));
	}
	
	
	
	public void sortBy(String sortBy) {
		Comparator<Vehicle> vehicleSortBy = null;
			if("year".equalsIgnoreCase(sortBy)) {
				vehicleSortBy = new VehicleByYear();	
			} else if("make".equalsIgnoreCase(sortBy)) {
				vehicleSortBy = new VehicleByMake();	
			} else if("price".equalsIgnoreCase(sortBy)) {
				vehicleSortBy = new VehicleByPrice();	
			}
		
		
		Collections.sort(list, vehicleSortBy);
		
		list.stream().forEach(action -> {
			System.out.println(action.toString());
		});
	}
	
	public void sortByYear() {
		sortBy("year");
	}
	
	public void sortByMake() {
		sortBy("make");
	}
	
	public void sortByPrice() {
		sortBy("price");
	}
	
	public void bestValue() {
		VehicleByPrice vehicleByPrice = new VehicleByPrice();
		Collections.sort(list, vehicleByPrice);
		System.out.println(list.stream().findFirst().get().toString());
	}
	
	public void fuelConsumptionfForDistance(long distance) {
		list.stream().forEach(action -> {
			System.out.println(action.toString() + " " + (double)distance/action.getHwyMpg());
		});
	}
	
	public void randomVehicle() {
		Random rand = new Random();
		
		System.out.println(list.get(rand.nextInt(list.size())).toString());
	}
	
	public void avgMpgByYear() {
		//assuming average MPG by year would be the same as the MPG
		list.stream().forEach(action -> {
			System.out.println(action.toString() + " " + action.getHwyMpg());
		});
	}
}
