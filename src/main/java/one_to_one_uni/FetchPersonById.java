package one_to_one_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPersonById {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("dev").createEntityManager();
		System.out.println("Enter Id:");
		Person c=em.find(Person.class, new Scanner(System.in).nextInt());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPc().getpNo());
	}

}

