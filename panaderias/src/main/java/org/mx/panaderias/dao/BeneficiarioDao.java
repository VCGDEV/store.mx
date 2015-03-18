<<<<<<< HEAD
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
	Usuario findUsuario(String userName,String pwd);
}
=======
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
	Usuario findUsuario(String userName,String pwd);
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
