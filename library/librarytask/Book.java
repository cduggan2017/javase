package librarytask;

import junittests.CoverType;

public class Book extends Item {
	
	private String author;
	private CoverType coverType;
	
	public Book(int id, String name, int noPages, int edition, double price, int publicationYear, String author, CoverType coverType) {
		
		super(id, name, noPages, edition, price, publicationYear);
		this.author = author;
		this.coverType = coverType;
	}

	public String getAuthor() {
		return author;
	}

	public CoverType getCoverType() {
		return coverType;
	}

	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}
	
	
	
}
