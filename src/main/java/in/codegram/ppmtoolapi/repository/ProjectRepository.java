package in.codegram.ppmtoolapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codegram.ppmtoolapi.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

	//TODO: No need to add any CRUD method, methods can be customized
	

}
