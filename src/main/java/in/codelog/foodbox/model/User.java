package in.codelog.foodbox.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer u_id;

	private String u_name;
	
	@Column(name = "u_email", nullable = false)
	private String email;
	
	private String u_address;
	private String u_password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String u_name, String email, String u_address, String u_password) {
		super();
		this.u_name = u_name;
		this.email = email;
		this.u_address = u_address;
		this.u_password = u_password;
	}

	public User(Integer u_id, String u_name, String email, String u_address, String u_password) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.email = email;
		this.u_address = u_address;
		this.u_password = u_password;
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_email() {
		return email;
	}

	public void setU_email(String u_email) {
		this.email = u_email;
	}

	public String getU_address() {
		return u_address;
	}

	public void setU_address(String u_address) {
		this.u_address = u_address;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(u_address, email, u_id, u_name, u_password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(u_address, other.u_address) && Objects.equals(email, other.email)
				&& Objects.equals(u_id, other.u_id) && Objects.equals(u_name, other.u_name)
				&& Objects.equals(u_password, other.u_password);
	}

}
