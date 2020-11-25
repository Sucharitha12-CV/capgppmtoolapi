package in.codegram.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmtoolapi.domain.Project;
import in.codegram.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		//TODO Service Logic on Project
		return projectRepository.save(project);
	}

}
