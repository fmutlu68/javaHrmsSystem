package furkan.hrmssystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "e_mail")
	private String eMail;
	
	@Column(name = "password")
	private String password;
	
	public User() {
		
	}

	public User(int id, int userId, String eMail, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.eMail = eMail;
		this.password = password;
	}
	
}
