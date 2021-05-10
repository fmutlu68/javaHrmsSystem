package furkan.hrmssystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import furkan.hrmssystem.business.abstracts.EmployeeUserService;
import furkan.hrmssystem.dataAccess.abstracts.EmployeeUserDao;
import furkan.hrmssystem.entities.concretes.EmployeeUser;

@Service
public class EmployeeUserManager implements EmployeeUserService{

	private EmployeeUserDao employeeUserDao;
	
	@Autowired
	public EmployeeUserManager(EmployeeUserDao employeeUserDao) {
		super();
		this.employeeUserDao = employeeUserDao;
	}

	@Override
	public List<EmployeeUser> getAll() {
		return employeeUserDao.findAll();
	}

	@Override
	public EmployeeUser getById(int id) {
		return employeeUserDao.findById(id).get();
	}
}
