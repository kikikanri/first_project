package todo.dao;

public class LoginModel {

	private String userid;
	private String password;
	private String username;

	private int state = -1;		// ログイン状態

	public String getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername(){
		return this.username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public int getState(){
		return this.state;
	}

	public void setState(int state){
		this.state = state;
	}
}
