import java.text.DecimalFormat;

public class Paint {

	public String name;
	public double noLitre;
	public double price;
	public double areaPerLitre;
	
	public Paint(String name, double noLitre, double price, double area) {
		this.name = name;
		this.noLitre = noLitre;
		this.price = price;
		this.areaPerLitre = area;
	}

	public String getName() {
		return name;
	}

	public double getNoLitre() {
		return noLitre;
	}

	public double getPrice() {
		return price;
	}

	public double getArea() {
		return this.areaPerLitre;
	}
	
	
	// works the amount of paint used for any size room
	public double workOutLitresNeeded(int areaNeeded){
		DecimalFormat decFmt = new DecimalFormat("#0.00"); 
		double litresUsed = areaNeeded / this.getArea();
		String format = decFmt.format(litresUsed);
		Double litresUsedFmt = Double.parseDouble(format);
		
		return litresUsedFmt;
	}
	
	// works out the waste per can
	public double workOutWasteage(int areaNeeded){
		double noTinsNeeded = this.workOutNoTinsNeeded(areaNeeded) * this.getNoLitre();
		double waste = noTinsNeeded - this.workOutLitresNeeded(areaNeeded);
		DecimalFormat decFmt = new DecimalFormat("#0.00");
		String format = decFmt.format(waste);
		Double wasteFmt = Double.parseDouble(format);
		return wasteFmt;
	}
	
	// works out the number of tins needed for the area provided
	public double workOutNoTinsNeeded(int areaNeeded){
		double noFullTins = Math.ceil(this.workOutLitresNeeded(areaNeeded) / this.getNoLitre());
		return noFullTins;
	}
	
	// works out the cost of total amount of tins
	public double workOutCost(int areaNeeded){
		double totalCost = this.workOutNoTinsNeeded(areaNeeded) * this.getPrice();
		
		return totalCost;
	}
	
	public String outputPaintInfo(int areaNeeded){
		double litresNeeded = this.workOutLitresNeeded(areaNeeded);
		double litresWasted = this.workOutWasteage(areaNeeded);
		int noTinsNeeded = (int) this.workOutNoTinsNeeded(areaNeeded);
		double totalCost = this.workOutCost(areaNeeded);
			
		return litresNeeded + " of paint are needed for an area size of " + areaNeeded + 
				"m2.\n" + noTinsNeeded + " tin of paint is needed and there will be " + litresWasted +
				" wasted.\nThe total cost will be £" + totalCost +"\n";
		
	}
	
	
}
	
