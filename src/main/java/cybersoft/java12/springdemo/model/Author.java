package cybersoft.java12.springdemo.model;

public class Author {
	private String name;
	private String email;
	private String facebook;
	public Author() {
		name="Tin";
		email="tinngo@gmail.com";
		facebook = "https://www.facebook.com/tristanngo2002";
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getFacebook() {
		return facebook;
	}
}
