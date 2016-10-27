package bzh.fucktheduck.sec.persistance.bean;

public class Movie {

	private Integer id = null;
	
	private String title;
	
	private int year;
	
	private String synopsys;
	
	public Movie() {
	}
	
	public Movie(String title, int year, String synopsys) {
		this.title = title;
		this.year = year;
		this.synopsys = synopsys; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSynopsys() {
		return synopsys;
	}

	public void setSynopsys(String synopsys) {
		this.synopsys = synopsys;
	}
	
	@Override
	public String toString() {
		return "Film - title : " + title + ", year : " + year + ", synopsys : " + synopsys;
	}
}
