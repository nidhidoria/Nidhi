


import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProjectDAOTesting {
	
	@Test
	public void addProjectTest() {
		
		Project prj1 = new Project();
	//	prj1.setProjectId(101);
		prj1.setProjectTitle("Airline");
		prj1.setProjectDeadLine(LocalDate.of(2022, 05,05));
				
		Project prj2 = new Project();
		prj2.setProjectTitle("Online Banking");
		prj2.setProjectDeadLine(LocalDate.of(2022, 06,05));
		
		Project prj3 = new Project();
		prj3.setProjectTitle("Hotel Managerment");
		prj3.setProjectDeadLine(LocalDate.of(2022, 07,05));
		
		ProjectDAOImple prjDAO = new ProjectDAOImple();
		//Employee theEmp = empDAO.findEmployee(7);
		prjDAO.addProject(prj1);
		prjDAO.addProject(prj2);
		prjDAO.addProject(prj3);
	//	System.out.println("Project ID : "+thePrj.getProjectId());
		//System.out.println("Project Title   : "+thePrj.getProjectTitle());
		//System.out.println("Project Deadline    : "+thePrj.getProjectDeadLine());
		
	}
	
	
	@Test
	public void showProjectTest() {
		
		ProjectDAOImple prjDAO = new ProjectDAOImple();
		//Employee theEmp = empDAO.findEmployee(7);
		Project thePrj = prjDAO.findProject(8);
		System.out.println("Project ID 		: "+thePrj.getProjectId());
		System.out.println("Project Title   : "+thePrj.getProjectTitle());
		System.out.println("Project Deadline: "+thePrj.getProjectDeadLine());
		
	}
	
	
	@Test
	public void UpdateProjectTest()
	{
		
		ProjectDAOImple prjDAO = new ProjectDAOImple();
		Project prj3 = prjDAO.findProject(8);
			
		prj3.setProjectTitle("Airline");
		prj3.setProjectDeadLine(LocalDate.of(2022, 07,15));
			
		
		prjDAO.modifyProject(prj3);
		
	}
	
	@Test
	public void DeleteProjectTest()
	{
		ProjectDAOImple prjDAO = new ProjectDAOImple();
		Project prj = prjDAO.findProject(8);
		prjDAO.deleteProject(prj.getProjectId());
		
	}
	
	@Test
	public void showAllProjectTest() 
	{
		ProjectDAOImple prjDAO = new ProjectDAOImple();
		
		Set<Project> staff = prjDAO.findAllProject();
	//	List<Project> staff = query.getResultList();
		for (Project thePrj : staff) {
			System.out.println("Project ID 		: "+thePrj.getProjectId());
			System.out.println("Project Title   : "+thePrj.getProjectTitle());
			System.out.println("Project Deadline: "+thePrj.getProjectDeadLine());
			System.out.println("*************************************************");
	}
}
}