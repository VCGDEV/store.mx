package org.mx.panaderias.daoimpl;

import org.mx.panaderias.domain.Beneficiario;
import org.mx.panaderias.domain.Direccion;
import org.mx.panaderias.dao.BeneficiarioDao;
import javax.persistence.EntityManager;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring-config.xml"})
@Transactional
public class BeneficiarioDaoImplSave{
	@Autowired
	private BeneficiarioDao beneficiarioDao;

	@Test
	@Rollback(true)
	public void testSave(){
		System.out.println("Runing save Test");
		Beneficiario beneficiario = new Beneficiario();
		beneficiario.setNombre("Victor de la Cruz Gonzalez");
		beneficiario.setRfc("CGA030903UC3");
		beneficiario.setTipoBeneficiario(1);// Empleado
		beneficiario.setActivo(true);
		Direccion direccion = new Direccion();
		direccion.setEstado("Hidalgo");
		direccion.setMunicipio("Tulancingo de Bravo");
		direccion.setLocalidad("Tulancingo");
		direccion.setColonia("Centro");
		direccion.setCalle("Hidalgo");
		direccion.setNumeroExterior("SN");
		direccion.setNumeroInterior("SN");
		direccion.setTelefonos("01-555-555-5555");
		direccion.setCorreo("vcg_cruz@hotmail.com");
		beneficiario.setDireccion(direccion);
		try{
			assertTrue(beneficiarioDao.save(beneficiario));
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}


}
