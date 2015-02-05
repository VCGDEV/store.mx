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
	public boolean save(Beneficiario  beneficiario){
		try{
			em.persist(beneficiario);
			return true;
		}catch(Exception ex){	
			ex.printStackTrace();
		}
		return false;
	}

	public boolean updateOrDelete(Beneficiario beneficiario){
		//not implemented yet
		return false;
	}

	public Beneficiario findBeneficiario(int idBeneficiario){
		//not implemented yet
		return null;
	}	

	public List<Beneficiario> findBeneficiario(String nombre,int tipoBeneficiario){
		//not implemented yet
		return null;
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

