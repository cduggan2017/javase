
public class GarageTask {

	public static void main(String[] args) {
		
		Garage ncp = new Garage();
		
		Car car1 = new Car("Ford", "Escort", 1.2, 125, "White", 4,"AB12FDG");
		Car car2 = new Car("Ford", "Fiesta ST", 1.6, 125, "Green", 2,"JN76FFW");
		Car car3 = new Car("Ford", "Focus RS", 2.0, 145, "Black", 4,"JY87UUH");
		Car car4 = new Car("Ford", "GT40", 3.0, 185, "Blue", 2,"LK77IJG");
		Car car5 = new Car("Seat", "Ibiza", 1.2, 125, "Silver", 4,"FD09DUD");
		
		System.out.println(ncp.addVehicle(car1));
		System.out.println(ncp.addVehicle(car2));
		System.out.println(ncp.addVehicle(car3));
		System.out.println(ncp.addVehicle(car4));
		System.out.println(ncp.addVehicle(car5));
			
		Motorcycle bike1 = new Motorcycle("Suzuki", "GSX-R600", 0.6, "Blue", 157, false,"HD85IUU");
		Motorcycle bike2 = new Motorcycle("Honda", "CBR600", 0.6, "Red", 153, false,"TR22NVS");
		Motorcycle bike3 = new Motorcycle("Suzuki", "Bandit", 1.2, "Black", 150, true,"AB21JSN");
		
		System.out.println(ncp.addVehicle(bike1));
		System.out.println(ncp.addVehicle(bike2));
		System.out.println(ncp.addVehicle(bike3));
		
		Truck truck1 = new Truck("Scania", "P-Series", 12, 4.0, 80, "White", true, 2,"KA11USS");
		Truck truck2 = new Truck("Scania", "G-Series", 12, 4.0, 80, "White", true, 2,"AQ17SSH");
		Truck truck3 = new Truck("Mercedes", "Actros", 6, 4.0, 100, "Silver", false, 2,"UY99NGD");
		
		System.out.println(ncp.addVehicle(truck1));
		System.out.println(ncp.addVehicle(truck2));
		System.out.println(ncp.addVehicle(truck3));
		
		System.out.println();
		System.out.println(ncp.fixVehicle());
		
		System.out.println();
		System.out.println(ncp.showAllVehicles());
		
		System.out.println();
		System.out.println(ncp.removeVehicleFromLocation(2));
		System.out.println(ncp.removeVehicleFromLocation(6));
		System.out.println(ncp.removeVehicle(truck1));
		
		ncp.removeByVehicleType(bike1,"bike");
		System.out.println();
		
		
		System.out.println();
		System.out.println(ncp.showAllVehicles());
		
	}

}
