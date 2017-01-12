
public class RecursionArrays2 {

	public static void main(String[] args) {
		
		int[] myArray = new int[10];
		
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = i +1;
			System.out.println(myArray[i]);
		}
		
		for(int i = 1; i < myArray.length; i++){
			
			myArray[i] = (i + 1) * 10;
			System.out.println(myArray[i]);
		}

	}

}
