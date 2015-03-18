<<<<<<< HEAD
package org.mx.panaderias.daoimpl;

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
public class BeneficiarioDaoImplFind{
	@Autowired
	private BeneficiarioDao beneficiarioDao;

	@Test
	public void testFind(){
		assertNotNull(beneficiarioDao.findBeneficiario(8));
	}
	
}
=======
package org.mx.panaderias.daoimpl;

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
public class BeneficiarioDaoImplFind{
	@Autowired
	private BeneficiarioDao beneficiarioDao;

	@Test
	public void testFind(){
		assertNotNull(beneficiarioDao.findBeneficiario(8));
	}
	
}
>>>>>>> deb1a1f972bf1f62bbbf2a4455bcc75d355a6411
