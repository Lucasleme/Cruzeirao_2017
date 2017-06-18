package sistema.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import sistema.modelos.Categoria;

public class CategoriaService extends Service  {

	
	public void salvar(Categoria categoria)
	{
	    
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.persist(categoria);
		em.getTransaction().commit();	
	    em.close();
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List <Categoria> getCategorias()
	{
		
		List <Categoria>categorias;
		
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("Select b From Categoria b");
		categorias = q.getResultList();
		em.close();
		
		return categorias;
		
	}

	public void alterar(Categoria categoria) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			em.merge(categoria);
		em.getTransaction().commit();	
	    em.close();

		
		
	}

	
	public void remover(Categoria categoria) {

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
			categoria = em.find(Categoria.class,categoria.getID()); 
			em.remove(categoria);
		em.getTransaction().commit();	
	    em.close();

		
		
	}
	
	
	
}
