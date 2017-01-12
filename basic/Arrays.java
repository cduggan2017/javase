// first change in a file
public class Arrays {

	public static void main(String[] args) {
		// create array of size 10
		int[] myArray = {0,1,2,3,4,5,6,7,8,9};
		
		//
		for(int i = 0; i < myArray.length; i++){
			System.out.println(returnMyInt(1, myArray[i], true));
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
