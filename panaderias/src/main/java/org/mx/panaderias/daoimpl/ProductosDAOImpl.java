package org.mx.panaderias.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.mx.panaderias.domain.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productosDAO")
public class ProductosDAOImpl {
	
	@PersistenceContext
	private EntityManager em;
	private Query query;
	
	public void setEm(EntityManager em){ this.em = em; }
	
	@Transactional
	public void guardarProducto(Producto producto) {
		System.out.println("El producto:" + producto.toString());
		
		em.persist(producto);
		
		Producto p = em.find(Producto.class, 1);
		System.out.println(p);
	}
	

}
