package org.mx.panaderias.daoimpl;
import org.mx.panaderias.dao.BeneficiarioDao;
import org.mx.panaderias.domain.Beneficiario;
import org.mx.panaderias.domain.Usuario;
import org.springframework.stereotype.Repository;
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

	public boolean updateOrDelete(Beneficiario beneficiario){
		//not implemented yet
		return false;
	}

	public Beneficiario findBeneficiario(int idBeneficiario){
		return em.find(Beneficiario.class,idBeneficiario);
	}	

	public List<Beneficiario> findBeneficiario(String nombre,int tipoBeneficiario){
		query = em.createQuery("SELECT b FROM Beneficiario b WHERE b.nombre LIKE :nombre AND b.tipoBeneficario=:tipo");
		query.setParameter("nombre","%"+nombre+"%");
		query.setParameter("tipo",tipoBeneficiario);
		return query.getResultList();
	}

	public	boolean addLoginData(Usuario usuario){
		//not implemented yet
		return false;
	}
	public	boolean editLoginData(Usuario usuario){
		//not implemented yet
		return false;	
	}
	public Usuario findUsuario(int idBeneficiario){//not implemented
		return null;
	}
}

