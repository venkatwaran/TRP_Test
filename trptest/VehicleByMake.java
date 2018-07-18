package trptest;

import java.util.Comparator;

public class VehicleByMake implements Comparator<Vehicle> {

	public int compare(Vehicle v1, Vehicle v2) {
		return v1.getMake().compareTo(v2.getMake());
	}

}
