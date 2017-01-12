
public class UniqueSum {

	public static void main(String[] args) {
		UniqueSum us = new UniqueSum();
		
		System.out.println(us.retrunUniqueSum(1, 2, 3));
		System.out.println(us.retrunUniqueSum(3, 3, 3));
		System.out.println(us.retrunUniqueSum(1, 1, 2));

	}
	
	public int retrunUniqueSum(int num1, int num2, int num3){
		int totalNum = 0;
		
		if(num1 != num2 && num1 != num3){
			totalNum = num1;
		}
		
		if (num2 != num1 && num2 != num3){
			totalNum += num2;
		}
		
		if (num3 != num1 && num3 != num2){
			totalNum += num3;
		}
		
				
		return totalNum;
	}

}
