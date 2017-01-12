
public class Motorcycle extends Vehicle  {

	public boolean hasPanniers;
	
	
	public Motorcycle(String aMake, String aModel, double aEngineSize, 
			String aColor ,int aTopSpeed, boolean panniers,String aLicencePlate){
		super(aMake, aModel, 2,aEngineSize,aTopSpeed,aColor,aLicencePlate);
		hasPanniers = panniers;
		
	}
	
}
