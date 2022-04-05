import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProjectDAOImple implements ProjectDAO {

	EntityManagerFactory emf;
	EntityManager em ;
	
	public ProjectDAOImple() {
		System.out.println("ProjectDAOImple()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}

		
	public void addProject(Project project) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(project);
		et.commit();
	}
	public void modifyProject(Project prj) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(prj);
		et.commit();
	}
	public void deleteProject(int prjid) {
		// TODO Auto-generated method stub
		EntityTransaction et = em.getTransaction();
		et.begin();
			Project prj = em.find(Project.class, prjid);
			em.remove(prj);
		et.commit();
	}
	public Project findProject(int prjid) {
		// TODO Auto-generated method stub
		return em.find(Project.class, prjid);
	}
	public Set<Project> findAllProject() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Project");
		List<Project> list = query.getResultList();
		Set<Project> prjset = new HashSet(list);
		return prjset;
	}

}