import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="project_tbl")
public class Project
{
	@Id
	@GeneratedValue
	@Column(name="prj_ID")
	private int projectId;
	
	@Column(name="prj_title", length = 30)
	private String projectTitle;
	
	@Column(name="prj_ddl")
	private LocalDate projectDeadLine;
	
	
	public Project() {
		super();
		System.out.println("Project created....");
	}
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public LocalDate getProjectDeadLine() {
		return projectDeadLine;
	}
	public void setProjectDeadLine(LocalDate projectDeadLine) {
		this.projectDeadLine = projectDeadLine;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", projectDeadLine="
				+ projectDeadLine + "]";
	}
	
	 
}
