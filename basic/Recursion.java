
public class Recursion {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			System.out.println(returnMyInt(i,3,true));
		}
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
