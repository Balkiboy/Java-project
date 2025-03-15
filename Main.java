package ü5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Garage g = new Garage("Tiefgarage");
		
		Car c1 = new Car("Papa-Mobil", new Brand("VW"));
		Car c2 = new Car("Mama-Mobil", new Brand("Opel"));
		
		Bike b1 = new Bike("Sportvelo", new Brand("Giant"));
		
		g.addVehicle(c1);
		g.addVehicle(c2);
		g.addVehicle(b1);
		
		g.showVehicles();
		
		System.out.println("---");
		
		ArrayList<Vehicle> myVehicles = new ArrayList<Vehicle>();
		myVehicles.add(c1);
		myVehicles.add(c2);
		myVehicles.add(b1);
		// test
		//myVehicles.add(new Vehicle("Power V", new Brand("no brand")));
		for (Vehicle vehicle : myVehicles) {
			vehicle.drive();
		}
		
	}

}
