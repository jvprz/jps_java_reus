package Ejercicio_4;

public class Serie {

	//Attributes
	private String title;
	private int season;
	private boolean delivered;
	private String gender;
	private String creator;
	
	//Constructors
	public Serie() {
		this.title = "";
		this.season = 3;
		this.delivered = false;
		this.gender = "";
		this.creator = "";
	}
	
	public Serie(String title, String creator) {
		this.title = title;
		this.season = 3;
		this.delivered = false;
		this.gender = "";
		this.creator = creator;
	}
	
	public Serie(String title, int season, String gender, String creator) {
		this.title = title;
		this.season = season;
		this.delivered = false;
		this.gender = gender;
		this.creator = creator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", season=" + season + ", delivered=" + delivered + ", gender=" + gender
				+ ", creator=" + creator + "]";
	}
	
	
}
