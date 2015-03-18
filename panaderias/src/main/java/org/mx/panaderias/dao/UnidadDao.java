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
