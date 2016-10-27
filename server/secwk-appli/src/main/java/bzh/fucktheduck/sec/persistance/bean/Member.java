package bzh.fucktheduck.sec.persistance.bean;

public class Member {

	private Integer id = 0;
	
	private String login;
	
	private String password;
	
	public Member() {
	}
	
	public Member(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Member - id : " + id + ", login : " + login;
	}
}
