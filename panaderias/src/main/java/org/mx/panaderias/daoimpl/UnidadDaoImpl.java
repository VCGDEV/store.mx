<<<<<<< HEAD
package org.mx.panaderias.daoimpl;
import org.mx.panaderias.dao.UnidadDao;
import org.mx.panaderias.domain.Unidad;
import org.springframework.stereotype.Repository;
import javax.persistence.NoResultException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository("unidadDao")
public class UnidadDaoImpl implements UnidadDao{
	private EntityManager em;
	private Query query;
	
	@PersistenceContext
	public void setEm(EntityManager em){ this.em = em; }
	
	@Transactional(readOnly=false)
	public boolean saveUnidad(Unidad unidad){
		em.persist(unidad);
		return true;
	}

	@Transactional(readOnly=false)
	public boolean editUnidad(Unidad unidad){
		em.merge(unidad);
		return true;
	}
	public Unidad findUnidad(int idUnidad){
		return em.find(Unidad.class,idUnidad);
	}
	
	public List<Unidad> findUnidades(){
		return em.createQuery("SELECT u FROM Unidad u WHERE u.activo=true").getResultList();
	}
	
	public List<Unidad> findUnidades(String unidad){
		query = em.createQuery("SELECT u FROM Unidad u WHERE u.activo=true AND u.unidad=:unidad");
		query.setParameter("unidad","%"+unidad+"%");
		return query.getResultList();
	}
}
=======
package org.mx.panaderias.daoimpl;
import org.mx.panaderias.dao.UnidadDao;
import org.mx.panaderias.domain.Unidad;
import org.springframework.stereotype.Repository;
import javax.persistence.NoResultException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository("unidadDao")
public class UnidadDaoImpl implements UnidadDao{
	private EntityManager em;
	private Query query;
	
	@PersistenceContext
	public void setEm(EntityManager em){ this.em = em; }
	
	@Transactional(readOnly=false)
	public boolean saveUnidad(Unidad unidad){
		em.persist(unidad);
		return true;
	}

	@Transactional(readOnly=false)
	public boolean editUnidad(Unidad unidad){
		em.merge(unidad);
		return true;
	}
	public Unidad findUnidad(int idUnidad){
		return em.find(Unidad.class,idUnidad);
	}
	
	public List<Unidad> findUnidades(){
		return em.createQuery("SELECT u FROM Unidad u WHERE u.activo=true").getResultList();
	}
	
	public List<Unidad> findUnidades(String unidad){
		query = em.createQuery("SELECT u FROM Unidad u WHERE u.activo=true AND u.unidad=:unidad");
		query.setParameter("unidad","%"+unidad+"%");
		return query.getResultList();
	}
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
