import java.util.Scanner;
public class ScannerTask {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);

		int usersIntValue = userInput.nextInt();
		int[] myArray = new int[usersIntValue];
		
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = i +1;
			System.out.println(myArray[i]);
		}
		
		for(int i = 1; i < myArray.length; i++){
			
			myArray[i] = (i + 1) * 10;
			System.out.println(myArray[i]);
		}
		
		userInput.close();

	}

}
