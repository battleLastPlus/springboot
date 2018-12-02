package boot.pojo;

import java.util.Date;

public class User {
	public Integer id;
	public String username;
	public String password;
	public Date login_time;
	public Date registered_time;
	public Integer login_num;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	public Date getRegistered_time() {
		return registered_time;
	}
	public void setRegistered_time(Date registered_time) {
		this.registered_time = registered_time;
	}
	public Integer getLogin_num() {
		return login_num;
	}
	public void setLogin_num(Integer login_num) {
		this.login_num = login_num;
	}
	
	
}
