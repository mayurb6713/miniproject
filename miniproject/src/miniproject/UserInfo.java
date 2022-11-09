package miniproject;

public class UserInfo {
	
	private int userId;

	private String userUsername;
	private String userPassword;

	public UserInfo(int userId, String userName, String userPassword
			) {
		super();
		this.userId = userId;
		
		this.userUsername = userName;
		this.userPassword = userPassword;
	
	}
	
	public String toString() {
		return "UserInfo [userId=" + userId + ", userUsername=" + userUsername + ", userPassword=" + userPassword + "]";
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	
	public String getuserUsername() {
		return userUsername;
	}
	public void setuserUsername(String userUsername) {
		this.userUsername = userUsername;
	}
	public String getuserPassword() {
		return userPassword;
	}
	public void setuserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
	