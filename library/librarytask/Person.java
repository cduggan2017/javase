package librarytask;

public class Person implements Information {

	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void checkItemOut(String itemName){
		
	}
	
	public void checkItemIn(){
			
	}
	
	public int getMembershipNo(){
		
		return 0;
	}


	
	
}
