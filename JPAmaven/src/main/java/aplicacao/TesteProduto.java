package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto(null, "celular", 800);
		Produto p2 = new Produto(null, "notebook", 900);
		Produto p3 = new Produto(null, "computador", 1000);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");
		EntityManager em = emf.createEntityManager();

		
		// em.getTransaction().begin();
		 /*em.persist(p1); em.persist(p2); em.persist(p3); 
		 em.getTransaction().commit();
		 */

	}
}