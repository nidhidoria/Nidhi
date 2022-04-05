import java.util.Set;

public interface ProjectDAO
{
	void addProject(Project project);
	void modifyProject(Project prj);
	void deleteProject(int prjid);
	Project findProject(int prjid);
	Set<Project> findAllProject();
}