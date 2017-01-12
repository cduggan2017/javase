
public class PaintWizardTask {

	public static void main(String[] args) {
				
		PaintWizard pw = new PaintWizard();
		int roomSize = 300;
		
		pw.addPaint();
		System.out.println(pw.findCheapestPaint(roomSize));
		System.out.println(pw.outputAllPaintInfo(roomSize));
		
		
	}

}
