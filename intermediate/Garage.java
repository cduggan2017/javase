import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

	private double ticketPrice = 5.0;
	
	/*	implements an arraylist 
	 * */
	public ArrayList<Vehicle> carPark = new ArrayList<Vehicle>();
	
	
	/* getter for ticketPrice variable
	 * */
	public double getTicketPrice(){
		return this.ticketPrice;
	}
	
		
	/*	Adds a vehicle to the garage by there id
	 * */
	public String addVehicle(Vehicle vehicle){
		carPark.add(vehicle);
		return vehicle.make + " " + vehicle.model + " has been added to the garage.";
	}
	
	
	/*	Removes the vehicle from the garage by there id
	 * */
	public String removeVehicle(Vehicle vehicle){
		String removedVehicle = vehicle.make + " " + vehicle.model + " removed from garage.";
		carPark.remove(vehicle);
		return removedVehicle;
	}
	
	
	/*	Removes a vehicle by there location within the arraylist
	 * */
	public String removeVehicleFromLocation(int location){
		String removedVehicle = carPark.get(location).make + " " + carPark.get(location).model + " removed from garage.";
		
		carPark.remove(location);
		
		return removedVehicle;
	}
	
	
	/*	Removes all vehicles by there specific type from the garage
	 *  
	 * */
	public void removeByVehicleType(Vehicle vehicleType, String type){
		
		Iterator<Vehicle> garageList = carPark.iterator();
		
		
		for (Vehicle currentVehicle : carPark) {
			if(garageList.hasNext()){
				if (vehicleType instanceof Car) {
					carPark.remove(currentVehicle);
					
				} else if (vehicleType instanceof Motorcycle) {
					carPark.remove(currentVehicle);
				} else if (vehicleType instanceof Truck) {
					carPark.remove(currentVehicle);
				}
			}
		}
		
	}
	
	/* 	iterate through Arraylist called carPark to calculate
	*	the cost of each type of vehicle's stay 
	**/
	public String fixVehicle(){
		
		double carPrice = 0.0;
		double motorcyclePrice = 0.0;
		double truckPrice = 0.0;
		
		for (Vehicle currentVehicle : carPark) {
			
			if(currentVehicle instanceof Car){
				carPrice  = this.getTicketPrice() * 2;
			} else if (currentVehicle instanceof Motorcycle) {
				motorcyclePrice  = this.getTicketPrice() / 2;
			} else if (currentVehicle instanceof Truck) {
				truckPrice  = this.getTicketPrice() * 5;
			}
		
		}
		
		return "Car bill is: £" + carPrice + 
				"\nMotorcycle bill is: £" + motorcyclePrice + 
				"\nTruck bill is: £" + truckPrice;
	}
	
	/*	Removes all vehicles form the garage
	 * */
	public void emptyGarage(){
		for (Vehicle currentVehicle : carPark) {
			this.removeVehicle(currentVehicle);
		}
	}
	
	/*	returns a list of all the current vehicles within the garage
	 *  returns the make, model and licence plate of each vehicle
	 * */
	public String showAllVehicles(){
		
		String currentVehiclesInGarage = "Currently in the garage:";
		
		for (Vehicle currentVehicle : carPark) {
			currentVehiclesInGarage += ("\n"+ currentVehicle.make + " " +
										currentVehicle.model + " " +
										currentVehicle.licencePlate);
		}
		
		return currentVehiclesInGarage;
	}
	
	
}
