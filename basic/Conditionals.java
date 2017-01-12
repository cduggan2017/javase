
public class Conditionals {

	public static void main(String[] args) {
		System.out.println(returnMyInt(3,42,true));
		System.out.println(returnMyInt(3,42,false));

	}
	
	public static int returnMyInt(int num1, int num2, boolean returnSum){
		int sum;
		
		if(returnSum){
			sum = num1 + num2;
		} else {
			sum = num1 * num2;
		}
		
		return sum;
	}


}
