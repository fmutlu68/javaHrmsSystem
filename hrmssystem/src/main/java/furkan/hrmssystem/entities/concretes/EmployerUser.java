package furkan.hrmssystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employer_users")
public class EmployerUser {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_web_site")
	private String companyWebSite;
	
	@Column(name = "company_phone")
	private String companyPhone;
	
	public EmployerUser() {
		super();
	}
	public EmployerUser(int userId, String companyName, String companyWebSite, String companyPhone) {
		super();
		this.userId = userId;
		this.companyName = companyName;
		this.companyWebSite = companyWebSite;
		this.companyPhone = companyPhone;
	}
	
}
