package one_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertPerson {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Email:");
		Person p=new Person(0,sc.next(),sc.next(),null);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(p);
		et.commit();
		System.out.println("person inserted successfully");
	}

}
