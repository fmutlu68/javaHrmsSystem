package furkan.hrmssystem.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "employee_users")
@Entity
public class EmployeeUser {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "birth_date")
	private Date birthDate;
	
	@Column(name = "identity_no")
	private String tcNo;
	
	public EmployeeUser() {
		
	}

	public EmployeeUser(int userId, String firstName, String lastName, Date birthDate, String tcNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.tcNo = tcNo;
	}
}	
