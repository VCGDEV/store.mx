package org.mx.panaderias.dao;
import org.mx.panaderias.domain.Beneficiario;
import org.mx.panaderias.domain.Usuario;
import java.util.List;
/**
* @Author vcgdev
* @version 1.0
* 
**/
public interface BeneficiarioDao{
	boolean save(Beneficiario beneficiario) throws Exception;
	boolean updateOrDelete(Beneficiario beneficiario);
	Beneficiario findBeneficiario(int idBeneficiario);
	List<Beneficiario> findBeneficiario(String nombre,int tipoBeneficiario);	
	boolean addLoginData(Usuario usuario);
	boolean editLoginData(Usuario usuario);
	Usuario findUsuario(int idBeneficiario);
}
