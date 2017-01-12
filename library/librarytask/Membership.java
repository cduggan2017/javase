package librarytask;


public class Membership implements Information {

	private int membershipNo;
	private String memberName;

	public Membership(int membershipNo, String memberName) {
		this.membershipNo = membershipNo;
		this.memberName = memberName;
	}

	public int getMembershipNo(){
		return membershipNo;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	
	





}
