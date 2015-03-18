<<<<<<< HEAD
package org.mx.panaderias.daoimpl;

import org.mx.panaderias.dao.FamiliaDao;
import org.mx.panaderias.domain.Familia;

import org.springframework.stereotype.Repository;
import javax.persistence.NoResultException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository("familiaDao")
public class FamiliaDaoImpl implements FamiliaDao{
	private Query query;
	private EntityManager em;

	@PersistenceContext
	public void setEm(EntityManager em){ this.em = em; }

	@Transactional(readOnly=false)
	public boolean saveFamilia(Familia familia){
		try{
			em.persist(familia);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	
	@Transactional(readOnly=false)
	public boolean editFamilia(Familia familia){
		try{
			em.merge(familia);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	public Familia findFamilia(int idFamilia){
		return em.find(Familia.class,idFamilia);
	}
	public List<Familia> findFamilias(){
		return em.createQuery("SELECT f FROM Familia f WHERE f.activo=true").getResultList();
	}
	public List<Familia> findFamilias(String familia){
		query = em.createQuery("SELECT f FROM Familia f WHERE f.familia LIKE :fam AND f.activo=true");
		query.setParameter("fam","%"+familia+"%");
		return query.getResultList();
	}
}
=======
package org.mx.panaderias.daoimpl;

import org.mx.panaderias.dao.FamiliaDao;
import org.mx.panaderias.domain.Familia;

import org.springframework.stereotype.Repository;
import javax.persistence.NoResultException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository("familiaDao")
public class FamiliaDaoImpl implements FamiliaDao{
	private Query query;
	private EntityManager em;

	@PersistenceContext
	public void setEm(EntityManager em){ this.em = em; }

	@Transactional(readOnly=false)
	public boolean saveFamilia(Familia familia){
		try{
			em.persist(familia);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	
	@Transactional(readOnly=false)
	public boolean editFamilia(Familia familia){
		try{
			em.merge(familia);
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	public Familia findFamilia(int idFamilia){
		return em.find(Familia.class,idFamilia);
	}
	public List<Familia> findFamilias(){
		return em.createQuery("SELECT f FROM Familia f WHERE f.activo=true").getResultList();
	}
	public List<Familia> findFamilias(String familia){
		query = em.createQuery("SELECT f FROM Familia f WHERE f.familia LIKE :fam AND f.activo=true");
		query.setParameter("fam","%"+familia+"%");
		return query.getResultList();
	}
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
