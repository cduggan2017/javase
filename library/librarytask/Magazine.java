package librarytask;

public class Magazine extends Item {

	private boolean freebies;
	private boolean glossyFrontCover;
	private int issueNo;
	
	public Magazine() {
		super();
		
	}
	public Magazine(int id, String name, int noPages, int edition, 
			double price, int publicationYear, boolean freebies, boolean glossyFrontCover, int issueNo) {
		super(id, name, noPages, edition, price, publicationYear);
		this.freebies = freebies;
		this.glossyFrontCover = glossyFrontCover;
		this.issueNo = issueNo;
	}
	
	// Getter Methods
	public boolean containsFreebies() {
		return freebies;
	}
	
	public boolean isGlossyFrontCover() {
		return glossyFrontCover;
	}

	public int getIssueNo() {
		return issueNo;
	}
	
	// Setter Method
	public void setFreebiesMissing(boolean freebies) {
		this.freebies = freebies;
	}
	
	
}
