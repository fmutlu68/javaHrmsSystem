package furkan.hrmssystem.business.abstracts;

import java.util.List;

import furkan.hrmssystem.entities.concretes.EmployerUser;

public interface EmployerUserService {
	List<EmployerUser> getAll();
	EmployerUser getById(int id);
}
