
public class TooHot {

	public static void main(String[] args) {
		
		TooHot t1 = new TooHot();
		System.out.println(t1.isTooHot(45,true));
		System.out.println(t1.isTooHot(45,false));
		System.out.println(t1.isTooHot(65,true));
		System.out.println(t1.isTooHot(95,true));
		System.out.println(t1.isTooHot(70,false));
		System.out.println(t1.isTooHot(45,true));
		System.out.println(t1.isTooHot(100,true));

	}

	public boolean isTooHot(int temperature, boolean isSummer){
		boolean isHot = false;
		
		if(isSummer){
			if(temperature >= 60 && temperature <= 100){
				isHot = true;
			}
		} else {
			if(temperature >= 60 && temperature <= 90){
				isHot = true;
			}
		}
						
		return isHot;
	}
	
}
