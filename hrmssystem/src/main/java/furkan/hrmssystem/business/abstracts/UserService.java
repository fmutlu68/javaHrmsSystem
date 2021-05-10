package furkan.hrmssystem.business.abstracts;

import java.util.List;

import furkan.hrmssystem.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	User getById(int id);
	
}
