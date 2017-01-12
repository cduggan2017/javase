
public class Car extends Vehicle {
	
	public int doors;
	
	public Car(String aMake, String aModel, double aEngineSize, int aTopSpeed, 
			String aColor ,int aDoors, String aLicencePlate){
		super(aMake, aModel, 4,aEngineSize,aTopSpeed,aColor,aLicencePlate);
		doors = aDoors;
	}
	
	
}
