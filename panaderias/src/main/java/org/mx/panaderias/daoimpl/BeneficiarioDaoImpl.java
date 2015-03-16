package org.mx.panaderias.daoimpl;
import org.mx.panaderias.dao.BeneficiarioDao;
import org.mx.panaderias.domain.Beneficiario;
import org.mx.panaderias.domain.Usuario;
import org.springframework.stereotype.Repository;
import javax.persistence.NoResultException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository("beneficiarioDao")
public class BeneficiarioDaoImpl implements BeneficiarioDao{
	private EntityManager em;
	private Query query;
	
	@PersistenceContext
	public void setEm(EntityManager em){ this.em = em; }

	@Transactional(readOnly=false)
	public boolean save(Beneficiario  beneficiario) throws Exception{
		em.persist(beneficiario.getDireccion());
		beneficiario.setIdDireccion(beneficiario.getDireccion().getIdDireccion());
		em.persist(beneficiario);
		return true;
	}

	@Transactional(readOnly=false)
	public boolean updateOrDelete(Beneficiario beneficiario){
		em.merge(beneficiario);
		return true;
	}

	public Beneficiario findBeneficiario(int idBeneficiario){
		return em.find(Beneficiario.class,idBeneficiario);
	}	

	public List<Beneficiario> findBeneficiario(String nombre,int tipoBeneficiario){
		query = em.createQuery("SELECT b FROM Beneficiario b WHERE b.nombre LIKE :nombre AND b.tipoBeneficiario=:tipo");
		query.setParameter("nombre","%"+nombre+"%");
		query.setParameter("tipo",tipoBeneficiario);
		return query.getResultList();
	}

	@Transactional(readOnly=false)
	public	boolean addLoginData(Usuario usuario){
		try{
			query = em.createQuery("SELECT u FROM Usuario u WHERE u.idBenefciario=:id");
			query.setParameter("id",usuario.getIdBeneficiario());
			Usuario us = (Usuario)query.getSingleResult();
			if(us!=null){
				throw new Exception("Beneficiario already has a Login!!");
			}
		}catch(NoResultException ex){
			em.persist(usuario);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	@Transactional(readOnly=false)
	public	boolean editLoginData(Usuario usuario){
		em.merge(usuario);
		return true;	
	}

	public Usuario findUsuario(int idBeneficiario){
		try{
			query = em.createQuery("SELECT u FROM Usuario u WHERE u.idBenefciario=:id");
			query.setParameter("id",idBeneficiario);
			return (Usuario)query.getSingleResult();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	public Usuario findUsuario(String userName,String pwd){
		try{
			query = em.createQuery("SELECT u FROM Usuario u WHERE u.userName=:user AND u.password=:pwd");
			query.setParameter("user",userName);
			query.setParameter("pwd",pwd);
			return (Usuario)query.getSingleResult();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
}

