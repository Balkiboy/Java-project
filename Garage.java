package ü5;

import java.util.ArrayList;

public class Garage {

	private String name;
	
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public Garage(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}
	
	public void showVehicles() {
		
		for (Vehicle v : vehicles) {
			System.out.println(v.getName() + " (Marke: " + v.getBrand().getName() + ")");
		}
		
	}
	
}
