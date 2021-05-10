package furkan.hrmssystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import furkan.hrmssystem.business.abstracts.EmployerUserService;
import furkan.hrmssystem.dataAccess.abstracts.EmployerUserDao;
import furkan.hrmssystem.entities.concretes.EmployerUser;

@Service
public class EmployerUserManager implements EmployerUserService{

	private EmployerUserDao employerUserDao;
	
	@Autowired
	public EmployerUserManager(EmployerUserDao employerUserDao) {
		super();
		this.employerUserDao = employerUserDao;
	}

	@Override
	public List<EmployerUser> getAll() {
		return employerUserDao.findAll();
	}

	@Override
	public EmployerUser getById(int id) {
		return employerUserDao.findById(id).get();
	}

}
