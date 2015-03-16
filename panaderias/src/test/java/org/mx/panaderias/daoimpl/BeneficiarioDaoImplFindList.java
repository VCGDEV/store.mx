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
public class BeneficiarioDaoImplFindList{
	@Autowired
	private BeneficiarioDao beneficiarioDao;

	@Test
	public void testFind(){
		assertEquals(2,beneficiarioDao.findBeneficiario("vic",1).size());
	}
	
}
