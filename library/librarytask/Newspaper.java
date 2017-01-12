package librarytask;

public class Newspaper extends Item {

	private String frontPageHeadline;

	public Newspaper(int id, String name, int noPages, int edition, double price, String frontPageHeadline, int publicationYear) {
		
		super(id, name, noPages, edition, price, publicationYear);
		this.frontPageHeadline = frontPageHeadline; 
	}

	// Getter Method
	public String getFrontPageHeadline() {
		return frontPageHeadline;
	}

	


	
	
	
	
}
