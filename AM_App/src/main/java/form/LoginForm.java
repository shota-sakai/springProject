package form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class LoginForm implements Serializable{
	
	@NotNull
	private String id;
	
	@NotNull
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
