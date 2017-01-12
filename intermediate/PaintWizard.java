import java.util.ArrayList;

public class PaintWizard {
	
	public Paint p1;
	public Paint p2;
	public Paint p3;

	public PaintWizard(){
		p1 = new Paint("CheapoMax", 20.0, 19.99, 10.0);
		p2 = new Paint("AverageJoes", 15.0, 17.99, 11.0);
		p3 = new Paint("DuluxourousPaints", 10.0, 25.00, 20.0);
		
	}
	
	ArrayList<Paint> p = new ArrayList<Paint>();
	
	public void addPaint(){
		p.add(p1);
		p.add(p2);
		p.add(p3);
	}
	
	public String findCheapestPaint(int roomAreaSize){
		
		double paintCost = p1.workOutCost(roomAreaSize);
		
		String cheapestPaint = "";
		for (Paint paint : p) {
			double cost = paint.workOutCost(roomAreaSize);
			if(cost < paintCost){
				paintCost = cost;
				cheapestPaint = "The cheapest paint is " + paint.getName() + 
						" costing £" + paintCost + " for room size " + roomAreaSize + "m2.";
						
			}
		}
		
		return cheapestPaint;
	}
	
	public String outputAllPaintInfo(int roomSize){
		
		String paintInfo = "";
		for (Paint currentPaint : p) {
			paintInfo += ("\n" + currentPaint.outputPaintInfo(roomSize));
		}
		
		
		return paintInfo;
	}
	
}
