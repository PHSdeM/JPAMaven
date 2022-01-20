package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;


public class Programa {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(null, "Mayara", "mayara@gmail.com", "Rua SãoPaulo");
		Funcionario f2 = new Funcionario(null, "Joao", "joao@gmail.com", "Avenida Brasil");
		Funcionario f3 = new Funcionario(null, "Marcos", "marcos@gmail.com", "Flamengo");
		Funcionario f4 = new Funcionario(null, "Pedro", "pedro@gmail.com", "Rua SãoPaulo");
		Funcionario f5 = new Funcionario(null, "Lucas", "lucas@gmail.com", "Avenida Brasil");
		Funcionario f6 = new Funcionario(null, "Karol", "carol@gmail.com", "Flamengo");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancoDados");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.persist(f4);
		em.persist(f5);
		em.persist(f6);
		em.getTransaction().commit();
		
		Funcionario f = em.find(Funcionario.class, 2);
		em.remove(f);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		System.out.println(f1);
		
		em.close();
		emf.close();
	}
}