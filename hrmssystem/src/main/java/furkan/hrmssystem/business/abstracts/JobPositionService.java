package furkan.hrmssystem.business.abstracts;

import java.util.List;

import furkan.hrmssystem.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
	JobPosition getById(int id);
}
