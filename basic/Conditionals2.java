
public class Conditionals2 {

	public static void main(String[] args) {
		System.out.println(returnMyInt(1,0,true));
		System.out.println(returnMyInt(1,2,true));
		System.out.println(returnMyInt(1,0,false));
		System.out.println(returnMyInt(1,2,false));

	}
	
	public static int returnMyInt(int num1, int num2, boolean returnSum){
		
		int sum;
		
				
		if(returnSum){
			sum = num1 + num2;
		} else {
			sum = num1 * num2;
		}
		
		if (num1 == 0){
			sum = num2;
		} else if (num2 == 0) {
			sum = num1;
		}
		
		return sum;
	}

}
