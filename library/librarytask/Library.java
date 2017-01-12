package librarytask;
import java.util.ArrayList;

public class Library {

	
	private ArrayList<Item> itemStorage;
	private ArrayList<Membership> memberships;
	
	// constructor
	public Library() {
		this.itemStorage = new ArrayList<Item>(); 
		this.memberships = new ArrayList<Membership>();
	}

	// adds item to itemStorage ArrayList
	public void addItem(Item item){
		this.itemStorage.add(item);
	}
	
	// finds the item by passing in the location of the item
	public int getItemLocation(int id){
		int itemLocation = 0;
				
		for (Item item : itemStorage) {
			int itemId = item.getId();
			if(itemId == id){
				itemLocation = itemStorage.indexOf(item);
				break;
			}
		}	
		return itemLocation;	
	}

	public int getItemLocation(Item item){
		int itemIndex = this.itemStorage.indexOf(item);
		return itemIndex;
	}
	
	public boolean removeItem(Item item){
		boolean confirmation = false;
		
		if(this.itemStorage.contains(item)){
			int itemLocation = this.itemStorage.indexOf(item);
			this.itemStorage.remove(itemLocation);
			confirmation = true;
		}
		
		return confirmation;
	}
	
	public void registerPerson(Person person, int membershipNo){
		Membership tempMembership = new Membership(membershipNo, person.getName());
		this.memberships.add(tempMembership);
	}
	
	public int findRegisteredPerson(String personName){
		int membershipNo = 0;
		
		for (Membership m : memberships) {
			if(personName == m.getMemberName()){
				membershipNo = m.getMembershipNo();
			}
		}
		
		return membershipNo;
		
	}	
	
	public boolean unregisterPerson(Person person, int membershipNo){
		
		boolean confirmation = false;
		for (Membership m : memberships) {
			if(m.getMembershipNo() == membershipNo){
				this.memberships.remove(person);
				confirmation = true;
			}
			
		}
		
		return confirmation;
		
	}

	public boolean updateRegisteredPerson(String personName, String newName){
		boolean confirmation = false;
		for (Membership m : memberships) {
			if(personName == m.getMemberName()){
				m.setMemberName(newName);
				confirmation = true;
			}
		}
		return confirmation;
	}
	
	public void updateItemPrice(String itemName, double newPrice){
		for (Item i : itemStorage) {
			if (itemName == i.getName()){
				i.setPrice(6.2d);
			}
		}
	}
	
	
}
