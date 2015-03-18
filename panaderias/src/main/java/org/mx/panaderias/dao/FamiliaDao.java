<<<<<<< HEAD
package org.mx.panaderias.dao;
import org.mx.panaderias.domain.Familia;
import java.util.List;

public interface FamiliaDao{
	boolean saveFamilia(Familia familia);
	boolean editFamilia(Familia familia);
	Familia findFamilia(int idFamilia);
	List<Familia> findFamilias();
	List<Familia> findFamilias(String familia);
}
=======
package org.mx.panaderias.dao;
import org.mx.panaderias.domain.Familia;
import java.util.List;

public interface FamiliaDao{
	boolean saveFamilia(Familia familia);
	boolean editFamilia(Familia familia);
	Familia findFamilia(int idFamilia);
	List<Familia> findFamilias();
	List<Familia> findFamilias(String familia);
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
