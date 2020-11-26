package in.codegram.ppmtoolapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmtoolapi.domain.Project;
import in.codegram.ppmtoolapi.exception.ProjectIDException;
import in.codegram.ppmtoolapi.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdate(Project project) {
		
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}
		catch (Exception e) {
			throw new ProjectIDException("ProjectIdentifier "+project.getProjectIdentifier()+" already available");
		}
	}

}
