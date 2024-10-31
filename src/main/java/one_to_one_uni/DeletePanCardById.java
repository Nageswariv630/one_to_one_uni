package one_to_one_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class DeletePanCardById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		int pcid=1;
		PanCard pc=em.find(PanCard.class,pcid);
		Query q=em.createQuery("from person");
		List<Person> pl=q.getResultList();
		for(Person p:pl) {
			if(p.getPc().getId()==pcid)
			{
				et.begin();
				em.merge(pl);
				et.commit();
			}
		}
	}

}
