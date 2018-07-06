package data;

public class Magazine extends Publication {
	private int day;
	private String language;
	private int month;
	
	public Magazine(String title, String publisher, String language, int year, int month, int day) {
		setTitle(title);
		setPublisher(publisher);
		setLanguage(language);
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	public int getDay() {
		return day;
	}
	public String getLanguage() {
		return language;
	}
	public int getMonth() {
		return month;
	}
	public void printInfo() {
		String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "-"
				+ getMonth() + "-" + getDay() + "; " + getLanguage();
		System.out.println(info);
	}
	public void setDay(int day) {
		this.day = day;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}