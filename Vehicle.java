package ü5;

public class Vehicle {

	private String name;
	private Brand brand;

	public Vehicle(String name, Brand brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void drive() {
		System.out.println("drive vehicle: " + this.name + " (Marke: " + this.brand.getName() + ")");
	}

}
