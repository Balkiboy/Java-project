package ü5;

public class Bike extends Vehicle {

	public Bike(String name, Brand brand) {
		super(name, brand);
	}

	public void drive() {
		System.out.println("drive bike: " + super.getName() + " (Marke: " + super.getBrand().getName() + ")");
	}

}
