package librarytask;

public abstract class Item {

	private int id;
	private String name;
	private int noPages; 
	private int publicationYear;
	private int edition;
	private double price;
	
	public Item(){
		
	}

	public Item(int id, String name, int noPages, int edition, double price, int publicationYear) {
		this.id = id;
		this.name = name;
		this.noPages = noPages;
		this.publicationYear = publicationYear;
		this.edition = edition;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoPages() {
		return noPages;
	}

	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
