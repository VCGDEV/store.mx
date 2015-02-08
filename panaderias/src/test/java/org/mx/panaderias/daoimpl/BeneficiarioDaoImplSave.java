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
	public void testSave(){
		System.out.println("Runing save Test");
		Beneficiario beneficiario = new Beneficiario();
		beneficiario.setNombre("Victor de la Cruz Gonzalez");
		assertEquals(false,beneficiarioDao.save(beneficiario));
	}
}
