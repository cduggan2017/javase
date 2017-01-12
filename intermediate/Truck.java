
public class Truck extends Vehicle  {

	public boolean hasTrailer;
	public int doors;
	
	public Truck(String aMake, String aModel, int aWheels, double aEngineSize, 
			int aTopSpeed, String aColor, boolean aHasTrailer, int aDoors,String aLicencePlate){
		super(aMake, aModel, aWheels,aEngineSize,aTopSpeed, aColor, aLicencePlate);
		hasTrailer = aHasTrailer;
		doors = aDoors;
	}
	
}
