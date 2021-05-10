package furkan.hrmssystem.business.abstracts;

import java.util.List;

import furkan.hrmssystem.entities.concretes.EmployeeUser;

public interface EmployeeUserService {
	List<EmployeeUser> getAll();
	EmployeeUser getById(int id);
}
