<<<<<<< HEAD
package org.mx.panaderias.dao;
import org.mx.panaderias.domain.Unidad;
import java.util.List;

public interface UnidadDao{
	boolean saveUnidad(Unidad unidad);
	boolean editUnidad(Unidad unidad);
	Unidad findUnidad(int idUnidad);
	List<Unidad> findUnidades();
	List<Unidad> findUnidades(String unidad); 
}
=======
package org.mx.panaderias.dao;
import org.mx.panaderias.domain.Unidad;
import java.util.List;

public interface UnidadDao{
	boolean saveUnidad(Unidad unidad);
	boolean editUnidad(Unidad unidad);
	Unidad findUnidad(int idUnidad);
	List<Unidad> findUnidades();
	List<Unidad> findUnidades(String unidad); 
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
