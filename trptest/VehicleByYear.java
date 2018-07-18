package trptest;

import java.util.Comparator;

public class VehicleByYear implements Comparator<Vehicle> {

	public int compare(Vehicle v1, Vehicle v2) {
		if (v1.getYear() < v2.getYear())
			return 1;
		if (v1.getYear() > v2.getYear())
			return -1;
		else
			return 0;
	}
}
