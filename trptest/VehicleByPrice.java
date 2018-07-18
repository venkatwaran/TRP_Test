package trptest;

import java.util.Comparator;

public class VehicleByPrice implements Comparator<Vehicle> {

	public int compare(Vehicle v1, Vehicle v2) {
		if (v1.getPrice() < v2.getPrice())
			return -1;
		if (v1.getPrice() > v2.getPrice())
			return 1;
		else
			return 0;
	}

}
