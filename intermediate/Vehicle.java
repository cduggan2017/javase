
public abstract class Vehicle {
	
	public String make;
	public String model;
	public int wheels;
	public double engineSize;
	public int topSpeed;
	public String color;
	public String licencePlate;
	
	
	public Vehicle(String aMake, String aModel, int aWheels, 
			double aEngineSize, int aTopSpeed, String aColor,String aLicencePlate){
		
		make = aMake;
		model = aModel;
		wheels = aWheels;
		engineSize = aEngineSize;
		topSpeed = aTopSpeed;
		color = aColor;
		licencePlate = aLicencePlate;
	}


	
	
	
}
