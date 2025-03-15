package ü5;

public class Car extends Vehicle {

	public Car(String name, Brand brand) {
		super(name, brand);
	}

	public void drive() {
		System.out.println("drive car: " + super.getName() + " (Marke: " + super.getBrand().getName() + ")");
	}

}
