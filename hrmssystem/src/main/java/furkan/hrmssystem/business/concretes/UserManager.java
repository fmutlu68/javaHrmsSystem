package furkan.hrmssystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import furkan.hrmssystem.business.abstracts.UserService;
import furkan.hrmssystem.dataAccess.abstracts.UserDao;
import furkan.hrmssystem.entities.concretes.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

	@Override
	public User getById(int id) {
		return userDao.findById(id).get();
	}

}
